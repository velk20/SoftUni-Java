package p04_BubbleSortTest;

import OOP.L10UnitTesting.Exercise.p04_BubbleSortTest.Bubble;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleTest {

    @Test
    public void testBubbleSort() {
        int[] numbers = {42, 2, 5, 12, 45, 12, 4, 3452, 65, 76};

        Bubble.sort(numbers);
        int[] expectedArray = {2, 4, 5, 12, 12, 42, 45, 65, 76, 3452};
        assertEquals(numbers.length, expectedArray.length);
        assertArrayEquals(expectedArray, numbers);
    }
}