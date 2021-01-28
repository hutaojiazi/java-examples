package tutorial.example.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        readFile();

        String text = "I want to write a text, can you help me?";
        String fileName = "sample.md";
        writeToFile(text, fileName);
    }

    public static void readFile() throws IOException {
        Path path = Paths.get("src/main/resources/readme.md");
        Stream<String> lines = Files.lines(path);
        lines.forEach(line -> {
            System.out.println("read line: " + line);
        });
    }

    public static void writeToFile(String text, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        byte[] strToBytes = text.getBytes();

        Files.write(path, strToBytes);

    }
}
