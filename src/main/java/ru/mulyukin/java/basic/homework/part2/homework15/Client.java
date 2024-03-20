package ru.mulyukin.java.basic.homework.part2.homework15;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try (Socket socket = new Socket("localHost", 8080)) {
                ExampleClient exampleClient = new ExampleClient(socket.getInputStream(), socket.getOutputStream());
                System.out.println("Выберите символ: +, -, *, /");
                char sing = scanner.next().charAt(0);
                System.out.println("Введите числа ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                exampleClient.send(sing, a, b);
                exampleClient.close();

            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NullPointerException e) {
                System.out.println("На ноль делить нельзя " + e);
            }
        }
    }
}
