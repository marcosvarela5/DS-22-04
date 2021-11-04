package e2;

public class Apartment implements Comparable<Apartment>{
    public int price;
    public int ZIP;
    public Address address;
    public int referenceNumber;
    public int numberOfRooms;

    public int getZIP() {
        return ZIP;
    }

    public Address getAddress() {
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

    Apartment(int price, int ZIP, Address address, int referenceNumber, int numberOfRooms){
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


    public boolean equals(Apartment apartment) { //no usar numero de referencia
        if (apartment != null && this instanceof ApartmentWithGarage) return false;
        else {
            assert apartment != null;
            return apartment.getAddress().equals(this.getAddress()) && apartment.getZIP() == this.getZIP() &&
                    apartment.getNumberOfRooms() == this.getNumberOfRooms() && apartment.getPrice() == this.getPrice();
        }
        //Si todos sus atributos son iguales el toString por lógica también y el número de referencia
        //no se utiliza, ya que puede haber varios anuncios del mismo apartamento con distintos nºs de referencia
    }

    public int hashCode(){ //no usar numero de referencia
        int result = 0;
        //No es sólido, existe una diminuta posibilidad de que haya coincidencia, acordarse de mejorarlo!!
        result = address.getNumber() * 31;
        result = result + address.getStreet().length() * 31 + getZIP() * 31;
        result = result + getNumberOfRooms() * 31 + getPrice();
        return result;
    }
}


