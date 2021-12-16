package e1;

import java.util.ArrayList;
import java.util.List;

public abstract class Composition implements GroupManager {//jugaria el rol de composicion abstracta

    public abstract List<Ticket> filter(GroupManager criteria1, GroupManager criteria2, List<Ticket> availableTickets);


}
