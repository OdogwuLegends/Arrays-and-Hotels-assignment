package ArraysOfGrace;

import java.util.Arrays;

public class Digits {
    private final int[] numbers = {2, 4, 6, 3, 5, 1};

    int count = 0;
    public String multiplyNumberByItself() {
        int[] product = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            product[i] = numbers[i] * numbers[i];
        }
        return Arrays.toString(product);
    }

    public int[] ascending(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){
                    count = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = count;
                }
            }
        }
        return numbers;
    }

    public int[] descending(int[] numbers) {
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]){
                    count = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = count;
                }
            }
        }
        return numbers;
    }
}
