package linter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        try {
            JavaScriptLinter();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void JavaScriptLinter() throws IOException {
        Path pathFile = Path.of("./app/src/main/resources/gates.js");

        List<String> allLines = Files.readAllLines(pathFile);

        for (int num = 0; num < allLines.size(); num++) {
            String line = allLines.get(num).trim(); // Get and trim the current line

            if (!line.isEmpty() && !line.endsWith("{") && !line.endsWith("}") &&
                    !line.startsWith("if") && !line.startsWith("else") && !line.endsWith(";")) {
                System.out.println("Error: Missing semicolon at line " + (num + 1));
            }

            System.out.println(line);
        }
    }}