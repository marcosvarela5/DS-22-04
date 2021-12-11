public class TicketDate {
    public final int day;
    public final int month;
    public final int year;

    TicketDate(int day, int month, int year) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketDate date = (TicketDate) o;
        return day == date.day && month == date.month && year == date.year;
    }

    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }

}
