package ro.siit.patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Buyer buyer1 = new Buyer(new PaymentType() {
            @Override
            public void pay() {
                System.out.println("Pay by card");
            }
        });

        buyer1.buy();

        Buyer buyer2 = new Buyer(new PaymentType() {
            @Override
            public void pay() {
                System.out.println("Pay cash");
            }
        });

        buyer2.buy();
        buyer1.setPaymentType(new PaymentType() {
            @Override
            public void pay() {
                System.out.println("Pay using payPal");
            }
        });
        buyer1.buy();
    }
}
