import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Ticket> getFilteredList() {
        List<Ticket> ticketList = new ArrayList<>();
        for (int i = 0; i < TicketManager.getAvailableTickets().size(); i++) {
            ticketList.addAll(FilterManager.filterByDate(TicketManager.getAvailableTickets().get(i).getDate()));
            ticketList.addAll(FilterManager.filterByOrigin(TicketManager.getAvailableTickets().get(i).getOrigin()));
            ticketList.addAll(FilterManager.filterByDestination(TicketManager.getAvailableTickets().get(i).getDestination()));
            ticketList.addAll(FilterManager.filterByPrice(TicketManager.getAvailableTickets().get(i).getPrice()));
        }
        return ticketList;
    }
}
