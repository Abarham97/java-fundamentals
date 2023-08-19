import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class LibraryTest {

    @Test
    public void testRoll() {
        // Arrange
        int n = 4;

        // Act
        int[] rolls = Library.roll(n);

        // Assert
        assertEquals(n, rolls.length);
        for (int roll : rolls) {
            assertTrue(roll >= 1 && roll <= 6);
        }
    }

    @Test
    public void testContainsDuplicates() {
        // Arrange
        int[] arrayWithDuplicates = {1, 2, 3, 4, 2};
        int[] arrayWithoutDuplicates = {1, 2, 3, 4, 5};

        // Act & Assert
        assertTrue(Library.containsDuplicates(arrayWithDuplicates));
        assertFalse(Library.containsDuplicates(arrayWithoutDuplicates));
    }

    @Test
    public void testCalculateAverage() {
        // Arrange
        int[] array = {3, 5, 7, 10, 2};
        double expectedAverage = (3 + 5 + 7 + 10 + 2) / 5.0;

        // Act
        double actualAverage = Library.calculateAverage(array);

        // Assert
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void testFindArrayWithLowestAverage() {
        // Arrange
        int[][] arrays = {
                {2, 4, 6, 8},
                {1, 3, 5, 7},
                {10, 20, 30, 40}
        };
        int[] expectedLowestAverageArray = {1, 3, 5, 7};

        // Act
        int[] actualLowestAverageArray = Library.findArrayWithLowestAverage(arrays);

        // Assert
        assertArrayEquals(expectedLowestAverageArray, actualLowestAverageArray);
    }

    @Test
    public void testWeatherTempMonthly() {
        // Arrange
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expectedWeather = "High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69\n";

        // Act
        String actualWeather = Library.weatherTempMonthly(weeklyMonthTemperatures);

        // Assert
        assertEquals(expectedWeather, actualWeather);
    }

    @Test
    public void testTally() {
        // Arrange
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
        String expectedWinner = "Bush received the most votes!";

        // Act
        String actualWinner = Library.tally(votes);

        // Assert
        assertEquals(expectedWinner, actualWinner);
    }
}
