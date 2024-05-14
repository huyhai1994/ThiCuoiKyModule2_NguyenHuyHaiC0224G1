package patient.relatedinformations;
/*Ma benh nhan*/
public class HealthRecordId {
    private String id;
    public HealthRecordId(){

    }
    public HealthRecordId(String id){
        this.id = id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public String toString(){
        return this.id;
    }
}
