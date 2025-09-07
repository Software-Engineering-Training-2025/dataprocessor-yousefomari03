package org.example.dataprocessor.Output;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFile implements OutputInterface {
    @Override
    public void output(double value) throws IOException {
        String result = "Result = " + value;
        Path path = Paths.get("target/result.txt");
        Files.createDirectories(path.getParent());
        Files.write(path, result.getBytes());
    }
}
