package homeWork3;

public class ArrayStats {
    public static void main(String[] args) {
        // Одномерный массив
        int[] oneDim = {1, 2, 3, 4, 5, 6};

        int oneSum = 0;
        int oneEven = 0;
        int oneOdd = 0;

        for (int num : oneDim) {
            oneSum += num;
            if (num % 2 == 0) oneEven++;
            else oneOdd++;
        }

        double oneAverage = (double) oneSum / oneDim.length;

        System.out.println("🔹 Одномерный массив:");
        System.out.println("Сумма: " + oneSum);
        System.out.println("Среднее: " + oneAverage);
        System.out.println("Чётных: " + oneEven);
        System.out.println("Нечётных: " + oneOdd);

        // Двумерный массив
        int[][] twoDim = {
                {7, 8, 9},
                {10, 11, 12}
        };

        int twoSum = 0;
        int twoCount = 0;
        int twoEven = 0;
        int twoOdd = 0;

        for (int[] row : twoDim) {
            for (int num : row) {
                twoSum += num;
                twoCount++;
                if (num % 2 == 0) twoEven++;
                else twoOdd++;
            }
        }

        double twoAverage = (double) twoSum / twoCount;

        System.out.println("\n🔸 Двумерный массив:");
        System.out.println("Сумма: " + twoSum);
        System.out.println("Среднее: " + twoAverage);
        System.out.println("Чётных: " + twoEven);
        System.out.println("Нечётных: " + twoOdd);
    }
}

