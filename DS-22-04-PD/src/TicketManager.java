import java.util.ArrayList;
import java.util.List;

public class TicketManager {
    private static final List<Ticket> availableTickets = new ArrayList<>();

    public void addTicket(Ticket ticket){
        availableTickets.add(ticket);
    }

    public static List<Ticket> getAvailableTickets(){
        return availableTickets;
    }
}
