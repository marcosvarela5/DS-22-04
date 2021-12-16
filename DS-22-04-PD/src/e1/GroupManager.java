package e1;

import java.util.ArrayList;
import java.util.List;

public interface GroupManager { //define el comportamiento del componente
    default  List<Ticket> filter(List<Ticket> availableTickets){throw new IllegalArgumentException();}
}
