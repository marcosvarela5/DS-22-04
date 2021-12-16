package e1;

import java.util.ArrayList;
import java.util.List;

public class CriteriaDate implements GroupManager {
    public String date1;

    List<Ticket> filteredList = new ArrayList<>();

    CriteriaDate(String date1){
        this.date1 = date1;
    }

    @Override
    public List<Ticket> filter(List<Ticket> availableTickets) {
        int i;
        for(i = 0; i < availableTickets.size(); i++){
            if(availableTickets.get(i).getDate().equals(date1)){
                if(!filteredList.contains(availableTickets.get(i))){
                    filteredList.add(availableTickets.get(i));
                }
            }
        }
        return filteredList;
    }
}
