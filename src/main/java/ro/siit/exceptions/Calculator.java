package ro.siit.exceptions;

public class Calculator {
    public static void main(String[] args) {
        int number;
        try {
            number = Integer.parseInt(args[0]);
            System.out.println(2 * number);
            throw new Exception("My exception occurred");
        } catch (NumberFormatException numberFormatException){
            System.out.println("Invalid number");
        } catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("Nonexistent parameter");
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        } finally {
            System.out.println("Finally code");
        }


//        int k = 10;
//        Integer j = k;
//        j.toString();
//        // Integer.valueOf(k);
//        k = j.intValue();


        /*
        int -> Integer
        double -> Double
        long -> Long
        short -> Short
        byte
        char -> Character
        boolean -> Boolean
        String
         */
    }
}
