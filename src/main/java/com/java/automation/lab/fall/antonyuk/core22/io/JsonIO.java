package com.java.automation.lab.fall.antonyuk.core22.io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class JsonIO<T> {
    private Class<T> clasz;
    private final static Gson GSON =
            new GsonBuilder().setPrettyPrinting()
                    .serializeNulls()
                    .create();

    public JsonIO(Class<T> clasz) {
        this.clasz = clasz;
    }

    public void write(T obj, String pathTo) throws IOException {
        Writer writer = new FileWriter(pathTo);
        GSON.toJson(obj, writer);
        writer.flush();
        writer.close();
    }

    public T read(String pathTo) throws IOException {
        return (T) GSON.fromJson(new FileReader(pathTo), clasz);
    }
}
