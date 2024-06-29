package pl.pjatk.jaz_s29602_nbp;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
public class KursyWalut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    @Size(min = 0, max = 10)
    @Schema(description = "Numer id", example = "1")
    private Long id;
    @NotBlank
    @Size(min = 2, max = 3)
    @Schema(description = "Skrot waluty", example = "USD")
    private String code;
    @Schema(description = "Data początku", example = "2023-31-02")
    private String startDate;
    @Schema(description = "Data koncowa ne moze byc dluzej niz 93 dni", example = "2024-01-01")
    private String endDate;
    @Schema(description = "Przykładowy wynik", example = "3.40")
    private Double mid;
    @Schema(description = "Dzisiejsza data", example = "2024-06-29T14:23:56.254Z")
    private LocalDateTime queryTimestamp;
    @Size(min = 1, max = 93)
    @Schema(description = "Musi byc przynajmniej jeden dzien", example = "3")
    private int roznica;

    public KursyWalut(Long id, String code, String startDate, String endDate, Double mid, LocalDateTime queryTimestamp, int roznica) {
        this.id = id;
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
        this.mid = mid;
        this.queryTimestamp = queryTimestamp;
        this.roznica = roznica;
    }


    public KursyWalut() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getMid() {
        return mid;
    }

    public void setMid(Double mid) {
        this.mid = mid;
    }

    public LocalDateTime getQueryTimestamp() {
        return queryTimestamp;
    }

    public void setQueryTimestamp(LocalDateTime queryTimestamp) {
        this.queryTimestamp = queryTimestamp;
    }

    public int getRoznica() {
        return roznica;
    }

    public void setRoznica(int roznica) {
        this.roznica = roznica;
    }
}
