import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Search {

    public static List<Ticket> searchTicket(String origin1, Clausula op1, String origin2, String destination1, Clausula op2,
                                     String destination2, TicketDate date1, Clausula op3, TicketDate date2, int price){
        List<Ticket> ticketList = new ArrayList<>();
            List<Ticket> list1 = Stream.concat(FilterManager.filterByPrice(price).stream(),FilterManager.filterByDate(date1, date2, op3).stream()).collect(Collectors.toList());
            List<Ticket> list2 = Stream.concat(FilterManager.filterByDestination(destination1, destination2, op2).stream()
                    ,FilterManager.filterByOrigin(origin1, origin2, op1).stream()).collect(Collectors.toList());

        return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        }
    }

