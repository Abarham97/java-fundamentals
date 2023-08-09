import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(1);
        flipNHeads(1);
        flipNHeads(2);

        clock();
    }

    public static String pluralize(String word, int count) {
        if (count == 1) {
            return word;
        } else {
            return word + "s";
        }
    }

    public static void flipNHeads(int n) {
        Random random = new Random();
        int consecutiveHeads = 0;
        int flips = 0;

        while (consecutiveHeads < n) {
            double flipResult = random.nextDouble();
            if (flipResult < 0.5) {
                System.out.println("tails");
                consecutiveHeads = 0;
            } else {
                System.out.println("heads");
                consecutiveHeads++;
            }
            flips++;
        }

        System.out.println("It took " + flips + " " + pluralize("flip", flips) + " to flip " + n + " " + pluralize("head", n) + " in a row.");
    }

    public static void clock() {
        LocalDateTime lastTime = LocalDateTime.now();
        double startTime = System.nanoTime();

        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            if (!currentTime.equals(lastTime)) {
                lastTime = currentTime;

                String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(formattedTime);

                double elapsedTime = (System.nanoTime() - startTime) / 1_000_000.0;
                double cyclesPerSecond = 1.0 / (elapsedTime / 1_000);

                String speed;
                if (cyclesPerSecond >= 1_000_000_000) {
                    speed = String.format("%.6f GHz", cyclesPerSecond / 1_000_000_000);
                } else if (cyclesPerSecond >= 1_000_000) {
                    speed = String.format("%.6f MHz", cyclesPerSecond / 1_000_000);
                } else if (cyclesPerSecond >= 1_000) {
                    speed = String.format("%.6f kHz", cyclesPerSecond / 1_000);
                } else {
                    speed = String.format("%.6f Hz", cyclesPerSecond);
                }

                System.out.println(speed);

                startTime = System.nanoTime();
            }
        }
    }
}
