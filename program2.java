import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> countMap = new HashMap<>();

        // Initialize map for numbers 1 to 9 with 0
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Count multiples
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Print result
        System.out.println(countMap);
    }
}
