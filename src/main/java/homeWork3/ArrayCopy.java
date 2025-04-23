package homeWork3;

public class ArrayCopy {
    public static void main(String[] args) {
        // Исходный массив
        int[] original = {10, 20, 30, 40, 50};

        // Новый массив такой же длины
        int[] copy = new int[original.length];

        // Копирование элементов
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Вывод обоих массивов
        System.out.println("Исходный массив:");
        for (int num : original) {
            System.out.print(num + " ");
        }

        System.out.println("\nСкопированный массив:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
