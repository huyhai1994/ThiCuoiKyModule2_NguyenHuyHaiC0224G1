package patient.relatedinformations;
/*Ly do nhap vien
*
* */
public class Reason {
    private String reason;
    public Reason(){

    }
    public Reason(String reason){
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String toString(){
        return this.reason;
    }
}
