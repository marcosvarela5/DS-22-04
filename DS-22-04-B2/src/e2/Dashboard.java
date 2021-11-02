package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dashboard implements Comparator<Apartment> {

    Comparator<Apartment> comparator;

    Dashboard(){
        comparator = null;
    }

    public void applySort(List<Apartment> apartmentList, Comparator<Apartment> comparator){
        if(comparator == null) Collections.sort(apartmentList);
        else
        Collections.sort(apartmentList, comparator);
    }


    @Override
    public int compare(Apartment o1, Apartment o2) {
        return o1.getReferenceNumber() - o2.getReferenceNumber();
    }


    public static void main(String[] args) {

        List<Apartment> apartmentList = new ArrayList<>();
        Dashboard d1 = new Dashboard();
        Apartment a1 = new Apartment(30000, 15005, "Elviña", 490340, 4);
        Apartment a2 = new ApartmentWithGarage(200000,
                15003, "Orzán",  490342, 3, 5000,3);
        Apartment a3 = new Apartment(40000, 15006, "Riazor", 5232, 5);

        apartmentList.add(a1);
        apartmentList.add(a2);
        apartmentList.add(a3);
        d1.applySort(apartmentList, new OrderByPrice());
        System.out.println("Ordenado por precio\n" + apartmentList);
        d1.applySort(apartmentList, new OrderByZIP());
        System.out.println("Ordenado por ZIP\n" + apartmentList);
        d1.applySort(apartmentList, new OrderByRooms());
        System.out.println("Ordenado por habitaciones\n" + apartmentList);
        d1.applySort(apartmentList, new OrderByRooms());
        System.out.println("Orden natural\n" + apartmentList);
        d1.applySort(apartmentList, null);
    }
}
