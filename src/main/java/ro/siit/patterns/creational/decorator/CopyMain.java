package ro.siit.patterns.creational.decorator;

import java.io.*;

public class CopyMain {
    public static void main(String[] args) {
//        int val;
//        try (FileInputStream fileInputStream = new FileInputStream("resources/input.txt");
//             FileOutputStream fileOutputStream = new FileOutputStream("resources/output.txt")) {
//            while ((val = fileInputStream.read()) != -1) {
//                fileOutputStream.write(val);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        String line;
        try(BufferedReader fileReader = new BufferedReader(new FileReader("resources/input.txt"));
        BufferedWriter fileWriter  = new BufferedWriter(new PrintWriter("resources/output.txt"))){
            while((line=fileReader.readLine()) != null){
                fileWriter.write(line);
                fileWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
