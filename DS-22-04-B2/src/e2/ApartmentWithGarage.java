package e2;

public class ApartmentWithGarage extends Apartment{
    public int pricePerParcel;
    public int numberOfParcels;

    public ApartmentWithGarage(int price, int ZIP, String address, int referenceNumber, int numberOfRooms,
                               int pricePerParcel, int numberOfParcels) {
        super(price, ZIP, address, referenceNumber, numberOfRooms);
        this.pricePerParcel = pricePerParcel;
        this.numberOfParcels = numberOfParcels;
    }

    public int getGaragePrice(){
        return numberOfParcels*pricePerParcel;
    }

    @Override
    public int getTotalPrice(){
        return price + this.getGaragePrice();
    }
}
