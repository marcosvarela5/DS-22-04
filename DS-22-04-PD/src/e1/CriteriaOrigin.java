package e1;

import java.util.ArrayList;
import java.util.List;

public class CriteriaOrigin implements GroupManager {

    public String origin;

    List<Ticket> filteredList = new ArrayList<>();

    CriteriaOrigin(String origin){
        this.origin = origin;
    }

    @Override
    public List<Ticket> filter(List<Ticket> availableTickets) {
        int i;
        for(i = 0; i < availableTickets.size(); i++){
            if(availableTickets.get(i).getOrigin().equals(origin)){
                if(!filteredList.contains(availableTickets.get(i))){
                    filteredList.add(availableTickets.get(i));
                }
            }
        }
        return filteredList;
    }
}
