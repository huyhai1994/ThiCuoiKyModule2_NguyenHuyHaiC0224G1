package patient.relatedinformations;
/*Ma Benh An*/
public class HealthRecordCode {
    private String RecordCode;
    public HealthRecordCode(){

    }
    public HealthRecordCode(String RecordCode){
        this.RecordCode = RecordCode;
    }
    public void setRecordCode(String RecordCode){
        this.RecordCode = RecordCode;
    }
    public String getRecordCode(){
        return this.RecordCode;
    }
    public String toString(){
        return this.RecordCode;
    }
}
