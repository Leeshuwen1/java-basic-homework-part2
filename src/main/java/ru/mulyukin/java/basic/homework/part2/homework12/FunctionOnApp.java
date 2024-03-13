package ru.mulyukin.java.basic.homework.part2.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FunctionOnApp {

    private static byte[] buffer = new byte[254];


    public static void fileCreation(String nameFile) {
        try {
            File file = new File(nameFile);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }

    public static void outputFile(String nameFile, String text) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(nameFile, true))) {
            buffer = text.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void inputFile(String nameOfFile) {
        try (FileInputStream in1 = new FileInputStream(nameOfFile)) {
            int n = in1.read(buffer);
            while (n > 0) {
                System.out.print(new String(buffer, 0, n));
                n = in1.read(buffer);
            }
        } catch (IOException e) {
        }
    }

    public static void search() {
        File path = new File("../java-basic-homework-part2");
        for (File file : path.listFiles()) {
            if (!file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }
}
