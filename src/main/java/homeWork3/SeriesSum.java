package homeWork3;

public class SeriesSum {
        public static void main(String[] args) {
            double sum = 0;

            int top = 1;
            int bottom = 3;

            while (top <= 97 && bottom <= 99) {
                sum += (double) top / bottom;
                top += 2;
                bottom += 2;
            }

            System.out.println("Sum of the series: " + sum);
        }
    }
