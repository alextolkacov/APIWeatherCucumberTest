package model;

import java.math.BigDecimal;

public class Sys {
    private BigDecimal type;
    private BigDecimal id;
    private BigDecimal message;
    private String country;
    private BigDecimal sinrise;
    private BigDecimal sunset;

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getMessage() {
        return message;
    }

    public void setMessage(BigDecimal message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getSinrise() {
        return sinrise;
    }

    public void setSinrise(BigDecimal sinrise) {
        this.sinrise = sinrise;
    }

    public BigDecimal getSunset() {
        return sunset;
    }

    public void setSunset(BigDecimal sunset) {
        this.sunset = sunset;
    }
}
