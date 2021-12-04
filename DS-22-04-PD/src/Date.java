public class Date {
    public final int day;
    public final int month;
    public final int year;

    Date(int day, int month, int year) {
        if (day < 1 || (day > 30 && (month == 4 || month == 6 | month == 9 || month == 11))) {
            throw new IllegalArgumentException("Date is not valid");
        }
        if (day > 31 && (month == 1 || month == 2 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            throw new IllegalArgumentException("Date is not valid");
        } else {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}
