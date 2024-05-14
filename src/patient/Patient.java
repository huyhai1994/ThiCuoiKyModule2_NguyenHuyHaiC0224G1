package patient;

import patient.relatedinformations.*;

public class Patient {

    private String name;
    private PatientId patientID;
    private HealthRecordCode healthRecordCode;
    private HealthRecordId healthRecordID;
    private HospitalizationDate hospitalizationDate;
    private Reason reason;

    public Patient() {

    }
    public Patient(String name) {
        this.name = name;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public HealthRecordCode getHealthRecordCode() {
        return healthRecordCode;
    }

    public void setHealthRecordCode(HealthRecordCode healthRecordCode) {
        this.healthRecordCode = healthRecordCode;
    }

    public HealthRecordId getHealthRecordID() {
        return healthRecordID;
    }

    public void setHealthRecordID(HealthRecordId healthRecordID) {
        this.healthRecordID = healthRecordID;
    }

    public HospitalizationDate getHospitalizationDate() {
        return hospitalizationDate;
    }

    public void setHospitalizationDate(HospitalizationDate hospitalizationDate) {
        this.hospitalizationDate = hospitalizationDate;
    }

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }
}
