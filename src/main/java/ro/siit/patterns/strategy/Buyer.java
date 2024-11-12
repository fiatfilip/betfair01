package ro.siit.patterns.strategy;

public class Buyer {
    private PaymentType paymentType;
    public Buyer(PaymentType paymentType){
        this.paymentType = paymentType;
    }
    public void buy() {
        paymentType.pay();
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
