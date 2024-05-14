package patient.relatedinformations;
/*So thu tu*/
public class PatientId {
    private int id;
    public PatientId(){

    }
    public PatientId(int id){
        this.id = id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public String toString(){
        return this.id+"";
    }
}
