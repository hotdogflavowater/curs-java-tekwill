package homeWork4.date;

public class Date {
    int year;
    int month;
    int day;

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month < 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month");
        }

    }

    public void setDay(int day) {
        if (day >= 1 && day < 31) {
            this.day = day;
        } else {
            System.out.println("Invalid day");
        }
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}


