package com.bjss.nhsd.a2si.idt.casedata;

public enum GenderEnumeration {
    MALE("Male"),
    FEMALE("Female");

    private String gender;

    GenderEnumeration(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}