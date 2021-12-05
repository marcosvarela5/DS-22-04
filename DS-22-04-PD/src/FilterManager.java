import java.util.ArrayList;
import java.util.List;

public interface FilterManager {
    static List<Ticket> filterByDestination(String destination){
        List<Ticket> ticketList = new ArrayList<>();
        for(int i = 0; i < TicketManager.getAvailableTickets().size(); i++){
            if(TicketManager.getAvailableTickets().get(i).getDestination().equals(destination)){
                ticketList.add(TicketManager.getAvailableTickets().get(i));
            }
        }
        return  ticketList;
    }
    static List<Ticket> filterByOrigin(String origin){
        List<Ticket> ticketList = new ArrayList<>();
        for(int i = 0; i < TicketManager.getAvailableTickets().size(); i++){
            if(TicketManager.getAvailableTickets().get(i).getOrigin().equals(origin)){
                ticketList.add(TicketManager.getAvailableTickets().get(i));
            }
        }
        return  ticketList;
    }
    static List<Ticket> filterByDate(TicketDate date){
        List<Ticket> ticketList = new ArrayList<>();
        for(int i = 0; i < TicketManager.getAvailableTickets().size(); i++){
            if(TicketManager.getAvailableTickets().get(i).getDate().equals(date)){
                ticketList.add(TicketManager.getAvailableTickets().get(i));
            }
        }
        return  ticketList;
    }
    static List<Ticket> filterByPrice(int maxPrice){
        List<Ticket> ticketList = new ArrayList<>();
        for(int i = 0; i < TicketManager.getAvailableTickets().size(); i++){
            if(TicketManager.getAvailableTickets().get(i).getPrice() < maxPrice){
                ticketList.add(TicketManager.getAvailableTickets().get(i));
            }
        }
        return  ticketList;
    }
}


