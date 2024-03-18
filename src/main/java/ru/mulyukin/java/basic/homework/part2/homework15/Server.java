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
            BufferedInputStream inputStream = new BufferedInputStream(clientSocket.getInputStream());
            BufferedOutputStream outputStream = new BufferedOutputStream(clientSocket.getOutputStream());
            int clientRequest = inputStream.read();
            int result = calculatorApp.calculator(clientRequest, clientRequest);
            outputStream.write(result);
            outputStream.flush();
        }
    }
}
