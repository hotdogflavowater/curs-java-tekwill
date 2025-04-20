package homeWork2;

public class enumMonths {
    public static void main(String[] args) {
        enum Month {
            JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            MAY,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER
        }
        for (Month month : Month.values()) {
            System.out.println(month);
        }

    }
}
