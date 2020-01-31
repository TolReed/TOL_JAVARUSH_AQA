package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream name;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public QuestionFileOutputStream(AmigoOutputStream name) {
        this.name = name;
    }

    @Override
    public void flush() throws IOException {
        name.flush();
    }

    @Override
    public void write(int b) throws IOException {
        name.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        name.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        name.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        if (reader.readLine().equals("Д")) {
            name.close();
        }

    }
}

