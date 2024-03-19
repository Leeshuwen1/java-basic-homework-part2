package ru.mulyukin.java.basic.homework.part2.homework15;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        CalculatorApp calculatorApp = new CalculatorApp();
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket clientSocket = serverSocket.accept();
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), "UTF-8"));
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            char clientRequest = (char) inputStream.read();
            System.out.println(clientRequest);
            int clientInt = inputStream.read();
            System.out.println(clientInt);
            int result = calculatorApp.calculator(clientRequest, clientInt, clientInt);
            System.out.println(result);
            outputStream.write(result);
            outputStream.flush();
        }
    }
}
