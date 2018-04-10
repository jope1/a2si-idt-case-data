package com.bjss.nhsd.a2si.idt.casedata;

import java.util.Objects;

public class IdtCaseCallDetails {

    private String callSite;
    private String locationCCG; // ccg is important because we definitely think that showing case data by ccg will be a requirement
    private String callStartDateTime;
    private String callEndDateTime; // This could be the end date from the call handler or clinician, if the call was forwarded to one.
    private boolean thirdPartyCaller;
    private GenderEnumeration genderEnumeration;
    private AgeGroupEnumeration ageGroupEnumeration;
    private String dispositionGroup;
    private String dispositionBroadGroup;

    public IdtCaseCallDetails() {
    }

    public String getCallSite() {
        return callSite;
    }

    public void setCallSite(String callSite) {
        this.callSite = callSite;
    }

    public String getLocationCCG() {
        return locationCCG;
    }

    public void setLocationCCG(String locationCCG) {
        this.locationCCG = locationCCG;
    }

    public String getCallStartDateTime() {
        return callStartDateTime;
    }

    public void setCallStartDateTime(String callStartDateTime) {
        this.callStartDateTime = callStartDateTime;
    }

    public String getCallEndDateTime() {
        return callEndDateTime;
    }

    public void setCallEndDateTime(String callEndDateTime) {
        this.callEndDateTime = callEndDateTime;
    }

    public boolean isThirdPartyCaller() {
        return thirdPartyCaller;
    }

    public void setThirdPartyCaller(boolean thirdPartyCaller) {
        this.thirdPartyCaller = thirdPartyCaller;
    }

    public GenderEnumeration getGenderEnumeration() {
        return genderEnumeration;
    }

    public void setGenderEnumeration(GenderEnumeration genderEnumeration) {
        this.genderEnumeration = genderEnumeration;
    }

    public AgeGroupEnumeration getAgeGroupEnumeration() {
        return ageGroupEnumeration;
    }

    public void setAgeGroupEnumeration(AgeGroupEnumeration ageGroupEnumeration) {
        this.ageGroupEnumeration = ageGroupEnumeration;
    }

    public String getDispositionGroup() {
        return dispositionGroup;
    }

    public void setDispositionGroup(String dispositionGroup) {
        this.dispositionGroup = dispositionGroup;
    }

    public String getDispositionBroadGroup() {
        return dispositionBroadGroup;
    }

    public void setDispositionBroadGroup(String dispositionBroadGroup) {
        this.dispositionBroadGroup = dispositionBroadGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdtCaseCallDetails)) return false;
        IdtCaseCallDetails that = (IdtCaseCallDetails) o;
        return isThirdPartyCaller() == that.isThirdPartyCaller() &&
                Objects.equals(getCallSite(), that.getCallSite()) &&
                Objects.equals(getLocationCCG(), that.getLocationCCG()) &&
                Objects.equals(getCallStartDateTime(), that.getCallStartDateTime()) &&
                Objects.equals(getCallEndDateTime(), that.getCallEndDateTime()) &&
                getGenderEnumeration() == that.getGenderEnumeration() &&
                getAgeGroupEnumeration() == that.getAgeGroupEnumeration() &&
                Objects.equals(getDispositionGroup(), that.getDispositionGroup()) &&
                Objects.equals(getDispositionBroadGroup(), that.getDispositionBroadGroup());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCallSite(), getLocationCCG(), getCallStartDateTime(), getCallEndDateTime(), isThirdPartyCaller(), getGenderEnumeration(), getAgeGroupEnumeration(), getDispositionGroup(), getDispositionBroadGroup());
    }

    @Override
    public String toString() {
        return "IdtCaseCallDetails{" +
                "callSite='" + callSite + '\'' +
                ", locationCCG='" + locationCCG + '\'' +
                ", callStartDateTime='" + callStartDateTime + '\'' +
                ", callEndDateTime='" + callEndDateTime + '\'' +
                ", thirdPartyCaller=" + thirdPartyCaller +
                ", genderEnumeration=" + genderEnumeration +
                ", ageGroupEnumeration=" + ageGroupEnumeration +
                ", dispositionGroup='" + dispositionGroup + '\'' +
                ", dispositionBroadGroup='" + dispositionBroadGroup + '\'' +
                '}';
    }
}
