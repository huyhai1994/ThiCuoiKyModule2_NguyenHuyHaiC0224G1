package patient;

import healthrecord.type.*;
import patient.relatedinformations.*;

public class Patient {
    private String name;
    private PatientId patientID;
    private HealthRecordCode healthRecordCode;
    private HealthRecordId healthRecordId;
    private HospitalizationDate hospitalizationDateIn;
    private HospitalizationDate hospitalizationDateOut;
    private Reason reason;
    private HealthRecord [] healthRecords;

    public Patient(){
        this.name = "";
        this.patientID = new PatientId();
        this.healthRecordCode = new HealthRecordCode();
        this.healthRecordId = new HealthRecordId();
        this.hospitalizationDateIn= new HospitalizationDate();
        this.hospitalizationDateOut= new HospitalizationDate();
        this.reason = new Reason();
        this.healthRecords = new HealthRecord[]{new Normal(), new VipI(), new VipII(), new VipIII()};
    }
    public Patient(String name) {
        this.name = name;
        this.patientID = new PatientId();
        this.healthRecordCode = new HealthRecordCode();
        this.healthRecordId = new HealthRecordId();
        this.hospitalizationDateIn = new HospitalizationDate();
        this.hospitalizationDateOut = new HospitalizationDate();
        this.reason = new Reason();
        this.healthRecords = new HealthRecord[]{new Normal(), new VipI(), new VipII(), new VipIII()};
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

    public String getHospitalizationDateIn() {
        return this.hospitalizationDateIn.getDate();
    }

    public void setHospitalizationDateIn(String inputDateIn) {
        this.hospitalizationDateIn.setDate(inputDateIn);
    }

    public String getHospitalizationDateOut() {
        return this.hospitalizationDateOut.getDate();
    }

    public void setHospitalizationDateOut(String inputDateOut) {
        this.hospitalizationDateOut.setDate(inputDateOut);
    }

    public HealthRecord getHealthRecords(int index) {
        return this.healthRecords[index-1];
    }
}
