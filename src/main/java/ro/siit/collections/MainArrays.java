package ro.siit.collections;

public class MainArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        Payment[] payments = new Payment[3];
        payments[0] = new Payment(300.0);
        payments[1] = new Payment(500.0);
        payments[2] = new Payment(600.0);

        // payments[3] = new Payment(700.0);

        System.out.println(total(payments));


        // 1 2 3
        // 4 3 3 5 7
        Integer matrix [][] = new Integer[2][];
        matrix[0] = new Integer[3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1] = new Integer[5];
        matrix[1][0] = 4;
        matrix[1][1] = 3;
        matrix[1][2] = 3;
        matrix[1][3] = 5;
        matrix[1][4] = 7;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print (" " + matrix[i][j]);
            }
            System.out.println();
        }

    }

    public static  double total(Payment[] payments) {
        double total = 0;
        for (Payment payment : payments) {
            total += payment.getAmount();
        }
        return total;
    }
}
