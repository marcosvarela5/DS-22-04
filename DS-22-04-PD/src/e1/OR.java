package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OR extends Composition {

    List<Ticket> parameters = new ArrayList<>();

    @Override
    public List<Ticket> filter(GroupManager criteria1, GroupManager criteria2, List<Ticket> availableTickets) {

        if(criteria1.getClass() != criteria2.getClass()) throw new IllegalArgumentException();

        List<Ticket> list1 = criteria1.filter(availableTickets);
        List<Ticket> list2 = criteria2.filter(availableTickets);
        return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
    }
}
