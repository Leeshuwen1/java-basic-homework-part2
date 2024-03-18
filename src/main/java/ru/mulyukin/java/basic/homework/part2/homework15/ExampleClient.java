package ru.mulyukin.java.basic.homework.part2.homework15;

import java.io.*;

public class ExampleClient implements Closeable {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ExampleClient(InputStream inputStream, OutputStream outputStream) {
        this.inputStream = new DataInputStream(inputStream);
        this.outputStream = new DataOutputStream(outputStream);
    }

    public int send(int a) throws IOException {
        outputStream.writeInt(a);
        outputStream.flush();
        int result = inputStream.readInt();
        System.out.println(result);
        return result;
    }

    @Override
    public void close() throws IOException {
        inputStream.close();
        outputStream.close();
    }
}
