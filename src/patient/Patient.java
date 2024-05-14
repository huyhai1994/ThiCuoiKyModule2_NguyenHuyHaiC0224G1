package patient;

import patient.relatedinformations.*;

public class Patient {

    private String name;
    private PatientId patientID;
    private HealthRecordCode healthRecordCode;
    private HealthRecordId healthRecordId;
    private HospitalizationDate hospitalizationDate;
    private Reason reason;

    public Patient(){
        this.name = "";
        this.patientID = new PatientId();
        this.healthRecordCode = new HealthRecordCode();
        this.healthRecordId = new HealthRecordId();
        this.hospitalizationDate = new HospitalizationDate();
        this.reason = new Reason();

    }
    public Patient(String name) {
        this.name = name;
        this.patientID = new PatientId();
        this.healthRecordCode = new HealthRecordCode();
        this.healthRecordId = new HealthRecordId();
        this.hospitalizationDate = new HospitalizationDate();
        this.reason = new Reason();

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHealthRecordCode(String healthRecordCode) {
        this.healthRecordCode.setRecordCode(healthRecordCode);
    }

    public String getHealthRecordCode() {
        return this.healthRecordCode.getRecordCode();
    }

    public void setHealthRecordId(String input) {
        this.healthRecordId.setId(input);
    }
    public String getHealthRecordId() {
        return this.healthRecordId.getId();
    }
}
