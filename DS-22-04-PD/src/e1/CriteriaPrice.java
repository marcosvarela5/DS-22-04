package e1;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPrice implements GroupManager {

    public int maxPrice;

    List<Ticket> filteredList = new ArrayList<>();

    CriteriaPrice(int maxPrice){
        this.maxPrice = maxPrice;
    }

    @Override
    public List<Ticket> filter(List<Ticket> availableTickets) {
        int i;
        for(i = 0; i < availableTickets.size(); i++){
            if(availableTickets.get(i).getPrice() <= maxPrice ){
                if(!filteredList.contains(availableTickets.get(i))){
                    filteredList.add(availableTickets.get(i));
                }
            }
        }
        return filteredList;
    }
}
