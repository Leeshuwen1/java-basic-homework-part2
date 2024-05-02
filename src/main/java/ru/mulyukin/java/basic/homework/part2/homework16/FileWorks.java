package ru.mulyukin.java.basic.homework.part2.homework16;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileWorks {
    private byte[] buffer = new byte[128];


    public void readFile(String nameOfFile) {
        try (FileReader fileReader = new FileReader(nameOfFile, StandardCharsets.UTF_8)) {
            int byteRead;
            while ((byteRead = fileReader.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void searchFile() {
        File path = new File("../java-basic-homework-part2");
        for (File file : path.listFiles()) {
            if (!file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }

    public void searchWord(String fileName, String word) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int str;
            while ((str = fis.read(buffer)) != -1) {
                String[] lines = new String(buffer, 0, str, StandardCharsets.UTF_8).split("\n");
                int i = 0;
                for (String line : lines) {
                    String[] words = line.split(" ");
                    int j = 0;
                    for (String elem : words) {
                        if (elem.equals(word)) {
                            System.out.println("Найдено в " + i + "-й строке, " + j + "-е слово");
                        }
                        j++;
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "FileWorks{" +
                "buffer=" + Arrays.toString(buffer) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileWorks fileWorks = (FileWorks) o;
        return Arrays.equals(buffer, fileWorks.buffer);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(buffer);
    }
}
