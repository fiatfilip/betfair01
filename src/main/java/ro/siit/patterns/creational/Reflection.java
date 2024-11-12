package ro.siit.patterns.creational;

public class Reflection {
    private String reflect(String value){
        StringBuffer sb = new StringBuffer(value);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Reflection reflection = new Reflection();
        System.out.println(reflection.reflect("bobo"));
    }
}
