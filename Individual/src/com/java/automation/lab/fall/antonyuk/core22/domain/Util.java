package com.java.automation.lab.fall.antonyuk.core22.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Util {

    private static void write(String path, String content, boolean isAppend) {
        try {
            if (isAppend) {
                Files.writeString(Path.of(path), content, StandardOpenOption.APPEND);
            } else {
                Files.writeString(Path.of(path), content, StandardOpenOption.WRITE);
            }
        }
        catch (IOException ioe) {
            ioe.getMessage();
        }
    }

    public static String read(String path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            stringBuilder.append(line);
            line = reader.readLine();
        }
        return stringBuilder.toString();
    }

    public static void append(String path, String content) {
            Util.write(path, content, true);
    }

    public static void overwrite(String path, String content) {
        Util.write(path, content, false);
    }
}
