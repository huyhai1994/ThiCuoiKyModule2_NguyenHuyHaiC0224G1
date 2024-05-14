package patient.relatedinformations;

public class HospitalizationDate {
    private String date;
    public HospitalizationDate(){

    }
    public HospitalizationDate(String date){
        this.date = date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
    public String toString(){
        return this.date;
    }
}
