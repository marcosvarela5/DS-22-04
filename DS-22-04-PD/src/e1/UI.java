package e1;

import java.util.ArrayList;
import java.util.List;

public class UI {
    public static void main(String[] args) {
        OR or1 = new OR();
        OR or2 = new OR();
        List<Ticket> availableTickets = new ArrayList<>();
        Ticket t1 = new Ticket("Santiago", "Ourense", "01/01/2021", 200);
        Ticket t2 = new Ticket("Coruna", "Ferrol", "05/12/2003", 100);
        availableTickets.add(t1); availableTickets.add(t2);
        List<Ticket> list1 = AND.filter(or1.filter(new CriteriaDate("01/01/2021"), new CriteriaDate("02/02/2022"), availableTickets),
                or2.filter(new CriteriaOrigin("Santiago"), new CriteriaOrigin("Roma"), availableTickets));
        System.out.println(list1);
    }
}
