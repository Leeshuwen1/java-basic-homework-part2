package ru.mulyukin.java.basic.homework.part2.homework15;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        CalculatorApp calculatorApp = new CalculatorApp();
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket clientSocket = serverSocket.accept();

            BufferedInputStream inputStream = new BufferedInputStream(new DataInputStream(clientSocket.getInputStream()));



            BufferedOutputStream outputStream = new BufferedOutputStream(new DataOutputStream(clientSocket.getOutputStream()));



            char clientRequest = (char) inputStream.read();
            System.out.println(clientRequest);
            int clientInt = inputStream.read();
            System.out.println(clientInt);
            int secondInt = inputStream.read();
            System.out.println(secondInt);
            int result = calculatorApp.calculator(clientRequest, clientInt, secondInt);
            System.out.println(result);
            outputStream.write(result);
            outputStream.flush();
        }
    }
}
