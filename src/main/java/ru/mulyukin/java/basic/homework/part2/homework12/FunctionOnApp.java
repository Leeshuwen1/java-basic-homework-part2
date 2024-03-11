package ru.mulyukin.java.basic.homework.part2.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FunctionOnApp {

    private static byte[] buffer = new byte[254];

    public byte[] getBuffer() {
        return buffer;
    }

    public static void fileCreation(String nameFile) throws IOException {
        try {
            File file = new File(nameFile);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }

    public static void firstFile(String text) {
        try (FileOutputStream out = new FileOutputStream("fail.txt")) {
            buffer = text.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            System.out.println("error " + e);
        }
    }

    public static void secondFile(String text) {
        try (FileOutputStream out = new FileOutputStream("file.txt")) {
            buffer = text.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            System.out.println("error " + e);
        }
    }

    public static void outPutFirstFile() {
        try (FileInputStream in1 = new FileInputStream("fail.txt")) {
            int n = in1.read(buffer);
            while (n > 0) {
                System.out.print(new String(buffer, 0, n));
                n = in1.read(buffer);
            }
        } catch (IOException e) {
        }
    }

    public static void outPutSecondFile() {
        try (FileInputStream in1 = new FileInputStream("file.txt")) {
            byte[] buf = new byte[64];
            int n = in1.read(buf);
            while (n > 0) {
                System.out.print(new String(buf, 0, n));
                n = in1.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
