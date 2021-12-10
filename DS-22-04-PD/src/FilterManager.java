import java.util.ArrayList;
import java.util.List;

public interface FilterManager {
    //Se filtran de 2 en 2 como dice el enunciado
    static List<Ticket> filterByDestination(String destination1, String destination2, Clausula operando){
        List<Ticket> ticketList = new ArrayList<>();
        switch (operando) {
            case OR -> {
                for (int i = 0; i < TicketManager.getAvailableTickets().size(); i++){
                    if((TicketManager.getAvailableTickets().get(i).getDestination().equals(destination1) ||
                            TicketManager.getAvailableTickets().get(i).getDestination().equals(destination2)) &&
                            (check(TicketManager.getAvailableTickets().get(i)))) {
                        ticketList.add(TicketManager.getAvailableTickets().get(i));
                    }
                }
            }

            case AND -> throw new IllegalArgumentException("No tickets available for this filter");
        }
        return ticketList;
    }

    static List<Ticket> filterByOrigin(String origin1, String origin2, Clausula operando){
        List<Ticket> ticketList = new ArrayList<>();
        switch (operando) {
            case OR -> {
                for (int i = 0; i < TicketManager.getAvailableTickets().size(); i++){
                    if((TicketManager.getAvailableTickets().get(i).getOrigin().equals(origin1) ||
                            TicketManager.getAvailableTickets().get(i).getOrigin().equals(origin2)) &&
                            (check(TicketManager.getAvailableTickets().get(i)))) {
                        ticketList.add(TicketManager.getAvailableTickets().get(i));
                    }
                }
            }

            case AND -> throw new IllegalArgumentException("No tickets available for this filter");
        }
        return ticketList;
    }

    static List<Ticket> filterByDate(TicketDate date1, TicketDate date2, Clausula operando){
        List<Ticket> ticketList = new ArrayList<>();
        switch (operando) {
            case OR -> {
                for (int i = 0; i < TicketManager.getAvailableTickets().size(); i++){
                    if((TicketManager.getAvailableTickets().get(i).getDate().equals(date1) ||
                            TicketManager.getAvailableTickets().get(i).getDate().equals(date2)) &&
                            (check(TicketManager.getAvailableTickets().get(i)))) {
                        ticketList.add(TicketManager.getAvailableTickets().get(i));
                    }
                }
            }

            case AND -> throw new IllegalArgumentException("No tickets available for this filter");
        }
        return ticketList;

    }

    static List<Ticket> filterByPrice(int maxPrice){
        List<Ticket> ticketList = new ArrayList<>();
        for(int i = 0; i< TicketManager.getAvailableTickets().size(); i++) {
            if (TicketManager.getAvailableTickets().get(i).getPrice() <= maxPrice && check(TicketManager.getAvailableTickets().get(i)))
                ticketList.add(TicketManager.getAvailableTickets().get(i));
        }
        return ticketList;
    }

    static boolean check(Ticket ticket){
        return !TicketManager.getAvailableTickets().contains(ticket);
    }
}


