package e2;

import java.util.Comparator;
import java.util.List;

public class Dashboard implements Comparator<Apartment> {
    public List<Apartment> apartmentList;
    Comparator<Apartment> comparator = null;

    public void setApartmentList(List<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }

    public void setComparator(Comparator<Apartment> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(Apartment o1, Apartment o2) {
        return 0;
    }
}
