package e2;

public class Apartment implements Comparable<Apartment>{
    public int price;
    public int ZIP;
    public String address;
    public Size size;
    public int referenceNumber;

    Apartment(int price, int ZIP, String address, Size size){
        this.price = price;
        this.ZIP = ZIP;
        this.address = address;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Apartment o) {
        return Integer.compare(this.getPrice(), o.getPrice());
    }


    public class ApartmentWithGarage extends Apartment{
        public int pricePerParcel;
        public int numberOfParcels;

        public ApartmentWithGarage(int price, int ZIP, String address, Size size, int pricePerParcel, int numberOfParcels) {
            super(price, ZIP, address, size);
            this.pricePerParcel = pricePerParcel;
            this.numberOfParcels = numberOfParcels;
        }

        public int getGaragePrice(){
            return numberOfParcels*pricePerParcel;
        }

        @Override
        public int getPrice(){
            return price + this.getGaragePrice();
        }
    }
}
