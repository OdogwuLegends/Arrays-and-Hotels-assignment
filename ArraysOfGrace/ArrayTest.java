package ArraysOfGrace;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    Digits digits;
    @BeforeEach
    void startAllTestWith(){
        digits = new Digits();
        assertNotNull(digits);
    }

    @Test
    void multiplySelf(){
        digits.multiplyNumberByItself();
        assertEquals("[4, 16, 36, 9, 25, 1]",  digits.multiplyNumberByItself());
    }


    @Test
    void checkAscending(){
        int[] numbers = {2,4,6,3,5,1};
        int[] ascending = {1,2,3,4,5,6};
        assertArrayEquals(ascending,digits.ascending(numbers));
    }

    @Test
    void checkDescending(){
        int[] numbers = {2,4,6,3,5,1};
        int[] descending = {6,5,4,3,2,1};
        assertArrayEquals(descending,digits.descending(numbers));
    }

}
