package com.company;

import java.util.Arrays;

public enum Days {

    MONDAY("Java jany tema otobuz"),
    TUESDAY("Otulgon temany praktikada koldonobuz"),
    WEDNESDAY("Java jany tema otobuz"),
    THURSDAY("Otulgon temany praktikada koldonobuz"),
    FRIDAY("Otulgon temalardy byshyktaybyz"),
    SATURDAY("Koshumcha praktikalyk sabak"),
    SUNDAY("English or softskills");

    private String emneKylam;


    Days(String emneKylam) {
        this.emneKylam = emneKylam;
    }

    public String getEmneKylam() {
        return emneKylam;
    }

    public void setEmneKylam(String emneKylam) {
        this.emneKylam = emneKylam;
    }

    @Override
    public String toString() {
        return  this.name()+ " "+
                "emneKylam='" + emneKylam + '\'' +
                '}';
    }
}
