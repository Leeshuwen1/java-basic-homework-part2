package ru.mulyukin.java.basic.homework.part2.homework12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static ru.mulyukin.java.basic.homework.part2.homework12.FunctionOnApp.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome in DIARY");
        System.out.println("Тут вы можете как создать так и работать с создаными файлами");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создать файл: Yes или No"); // выбирайте No, (метод полностью рабочий) т.к. еще не умею делать так чтобы при создании нового файла они попадали автоматически в выбор пользователя
        char choiceUser = scanner.next().charAt(0);
        if (choiceUser == 'y') {
            System.out.println("Внесите название файла в формате .txt");
            fileCreation(scanner.next());
            System.out.println("Файл создан ");
        } else {
            System.out.println("Вы решили работать с уже созданными файлами");
            search();
        }

        outputFile(scanner.nextLine(), "fail.txt");


    }
}

