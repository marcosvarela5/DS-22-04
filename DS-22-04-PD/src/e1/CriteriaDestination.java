package e1;

import java.util.ArrayList;
import java.util.List;

public class CriteriaDestination implements GroupManager {
    public String destination;

    List<Ticket> filteredList = new ArrayList<>();

    CriteriaDestination(String destination){
        this.destination = destination;
    }

    @Override
    public List<Ticket> filter(List<Ticket> availableTickets) {
        int i;
        for(i = 0; i < availableTickets.size(); i++){
            if(availableTickets.get(i).getDestination().equals(destination)){
                if(!filteredList.contains(availableTickets.get(i))){
                    filteredList.add(availableTickets.get(i));
                }
            }
        }
        return filteredList;
    }
}

