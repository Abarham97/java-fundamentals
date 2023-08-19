package linter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        try {
            Path filePath = Path.of("./app/src/main/resources/gates.js");
            String errors = JavaScriptLinter(filePath);
            System.out.println(errors);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String JavaScriptLinter(Path filePath) throws IOException {
        List<String> codeLines = Files.readAllLines(filePath);
        List<String> errors = new ArrayList<>();

        for (int count = 0; count < codeLines.size(); count++) {
            String line = codeLines.get(count).trim(); // Get and trim the current line

            if (!line.isEmpty() && !line.endsWith("{") && !line.endsWith("}") &&
                    !line.startsWith("if") && !line.startsWith("else") && !line.endsWith(";")) {
                errors.add("Missing semicolon at line " + (count + 1));
            }
        }

        return String.join("\n", errors);
    }
}
