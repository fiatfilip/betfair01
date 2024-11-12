package ro.siit.concurency;

public class Ops {
    public static void main(String[] args) {
        int a = 10;
        a++;
        // a = a + 1;

        int b = a++; //b = 10, a = 11
        int c = ++a; //a = 12  c = 13

        a = a + 1;
        c = a;
    }
}
