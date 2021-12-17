package e1;

public class Ticket {

    private final String origin;
    private final String destination;
    private final String date;
    private final int price;

    Ticket(String origin, String destination, String date, int price){
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return price == ticket.price && origin.equals(ticket.origin) && destination.equals(ticket.destination) && date.equals(ticket.date);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                '}';
    }
}
