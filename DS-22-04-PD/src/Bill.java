public final class Bill{
    //Patrón Inmutable (no se pueden cambiar los datos de un billete una vez este es expedido (en nuestro programa, al crear una instancia)
    private final String origin;
    private final String destination;
    private final int price;
    private final Date date;

    Bill(String origin, String destination, int price, Date date){
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

    public Date getDate() {
        return date;
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
