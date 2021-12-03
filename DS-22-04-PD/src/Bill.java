public class Bill {
    public String origin;
    public String destination;
    public int price;
    public Date date;

    Bill(String origin, String destination, int price, Date date){
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.date = date;
    }

    //No se incluyen setters porque no tendría sentido cambiar los datos de un billete una vez expedido

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date.setDate(date.day, date.month, date.year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return getPrice() == bill.getPrice() && getOrigin().equals(bill.getOrigin()) &&
                getDestination().equals(bill.getDestination()) && getDate().equals(bill.getDate());
    }
}
