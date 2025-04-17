package me.rkycse.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {
    public static void main(String[] args) {
        String filename = "chars.txt";

        // 1. Write characters to a file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("こんにちは, Java IO!");  // Unicode text
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Read characters back from the file
        try (FileReader reader = new FileReader(filename)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

