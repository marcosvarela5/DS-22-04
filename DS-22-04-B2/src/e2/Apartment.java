package e2;

public class Apartment implements Comparable<Apartment>{
    public int price;
    public int ZIP;
    public String address; //se puede crear una clase adress para que sea mas preciso, hacer si da tiempo
    public int referenceNumber;
    public int numberOfRooms;

    public int getZIP() {
        return ZIP;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalPrice(){
        return price;
    }

    Apartment(int price, int ZIP, String address, int referenceNumber, int numberOfRooms){
        this.price = price;
        this.ZIP = ZIP;
        this.address = address;
        this.referenceNumber = referenceNumber;
        this.numberOfRooms = numberOfRooms;
    }

    public String toString(){
        return "\n Apartamento de " + getNumberOfRooms() +
                " habitaciones en " + getAddress() + " " + getZIP() + " con un precio de " + getPrice() + "€" +
                " reference number" + getReferenceNumber() + "\n";
    }

    @Override
    public int compareTo(Apartment o) {
        return Integer.compare(this.getReferenceNumber(), o.getReferenceNumber());
    }

    public boolean equals(Apartment apartment){ //no usar numero de referencia
        return true;
    }

    public int hashCode(){ //no usar numero de referencia
        return 0;
    }
}


