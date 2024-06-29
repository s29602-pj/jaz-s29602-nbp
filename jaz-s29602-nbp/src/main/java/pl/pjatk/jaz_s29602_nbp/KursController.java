package pl.pjatk.jaz_s29602_nbp;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class KursController {
    private final KursService kursService;

    public KursController(KursService kursService) {
        this.kursService = kursService;
    }


    @Operation(summary = "code", description = "mid ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "200", description = "Ok")
    })

    @GetMapping
    public KursyWalut getSredniaWalute(
            @RequestParam String code,
            @RequestParam String startDate,
            @RequestParam String endDate
    ) {
        KursyWalut walut = kursService.getSredniaWalute(code, startDate, endDate);
        return walut;
    }
}


