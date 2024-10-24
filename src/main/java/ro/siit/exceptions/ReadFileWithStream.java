package ro.siit.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileWithStream {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // e.printStackTrace();
        }
    }
}
