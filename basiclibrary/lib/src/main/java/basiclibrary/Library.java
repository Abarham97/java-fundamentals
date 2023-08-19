import java.util.*;

public class Library {

    public static int[] roll(int n) {
        int[] rolls = new int[n];
        for (int i = 0; i < n; i++) {
            rolls[i] = (int) (Math.random() * 6) + 1;
        }
        return rolls;
    }

    public static boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static int[] findArrayWithLowestAverage(int[][] arrays) {
        if (arrays.length == 0) {
            throw new IllegalArgumentException("Arrays is empty.");
        }
        int minIndex = 0;
        double minAverage = Double.MAX_VALUE;

        for (int i = 0; i < arrays.length; i++) {
            double average = calculateAverage(arrays[i]);
            if (average < minAverage) {
                minAverage = average;
                minIndex = i;
            }
        }

        return arrays[minIndex];
    }

    public static String weatherTempMonthly(int[][] weeklyMonthTemperatures) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        HashSet<Integer> uniqueDataTemp = new HashSet<>();

        for (int[] weekTemp : weeklyMonthTemperatures) {
            for (int dayTemp : weekTemp) {
                minValue = Math.min(minValue, dayTemp);
                maxValue = Math.max(maxValue, dayTemp);
                uniqueDataTemp.add(dayTemp);
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("High: ").append(maxValue).append("\n");
        result.append("Low: ").append(minValue).append("\n");

        for (int temp = minValue; temp <= maxValue; temp++) {
            if (!uniqueDataTemp.contains(temp)) {
                result.append("Never saw temperature: ").append(temp).append("\n");
            }
        }

        return result.toString();
    }

    public static String tally(List<String> votes) {
        Map<String, Integer> voteCounts = new HashMap<>();
        for (String vote : votes) {
            voteCounts.put(vote, voteCounts.getOrDefault(vote, 0) + 1);
        }

        String winner = "";
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner + " received the most votes!";
    }

    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        int[] lowestAverageArray = findArrayWithLowestAverage(weeklyMonthTemperatures);
        System.out.println("Array with lowest average: " + Arrays.toString(lowestAverageArray));


        String weather = weatherTempMonthly(weeklyMonthTemperatures);
        System.out.println(weather);

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }
}
