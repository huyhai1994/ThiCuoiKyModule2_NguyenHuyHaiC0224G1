package healthrecord.type;

public class Normal extends HealthRecord{
    private int payment;

    @Override
    public String getPayment() {
        return this.payment + "VND";
    }
    public void setPayment(int payment) {
        this.payment = payment;
    }
}
