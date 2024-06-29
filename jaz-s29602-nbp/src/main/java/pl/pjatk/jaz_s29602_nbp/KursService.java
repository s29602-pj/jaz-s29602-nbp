package pl.pjatk.jaz_s29602_nbp;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class KursService {
    private final RestTemplate restTemplate;

    public KursService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public KursyWalut getSredniaWalute(String code, String startDate, String endDate) {
        String url = "http://api.nbp.pl/api/exchangerates/rates/a/" + code + "/" + startDate + "/" + endDate + "/?format=json";
        KursyWalut kurs = restTemplate.getForObject(url, KursyWalut.class);


        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        long difference = ChronoUnit.DAYS.between(start, end);

        kurs.setQueryTimestamp(LocalDateTime.now());
        kurs.setStartDate(startDate);
        kurs.setEndDate(endDate);
        kurs.setCode(code);
        kurs.setRoznica((int) difference);



        return kurs;
    }
}


