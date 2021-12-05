public final class Ticket {
    //Patrón Inmutable (no se pueden cambiar los datos de un billete una vez este es expedido (en nuestro programa, al crear una instancia)
    private final String origin;
    private final String destination;
    private final int price;
    private final TicketDate date;


    Ticket(String origin, String destination, int price, TicketDate date){
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return price;
    }

    public TicketDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return getPrice() == ticket.getPrice() && getOrigin().equals(ticket.getOrigin()) &&
                getDestination().equals(ticket.getDestination()) && getDate().equals(ticket.getDate());
    }
}
