package com.bjss.nhsd.a2si.idt.casedata;

public enum AgeGroupEnumeration  {
    INFANT("NeonateAndInfant-0to1"),
    ADULT("ADULT");

    private String ageGroup;

    AgeGroupEnumeration(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getAgeGroup() {
        return ageGroup;
    }
}