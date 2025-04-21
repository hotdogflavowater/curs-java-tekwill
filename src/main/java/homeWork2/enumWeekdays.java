package homeWork2;

public class enumWeekdays {
    public static void main(String[] args) {
        Weekday today = Weekday.MONDAY;
        System.out.println(today + " is holiday? " + today.isHoliday());
        System.out.println(today + " is weekday? " + today.isWeekDay());
    }
}

enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

}
