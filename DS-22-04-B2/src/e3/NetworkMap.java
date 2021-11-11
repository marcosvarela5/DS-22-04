package e3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkMap implements NetworkManager{

    Map<String, List<TopicOfInterest>> mapName = new HashMap<>();
    List<TopicOfInterest> topicList = new ArrayList<>();

    @Override
    public void addUser(String user, List<TopicOfInterest> topicsOfInterest) {
        if(!mapName.containsKey(user)) mapName.put(user, topicsOfInterest);
        throw new IllegalArgumentException("This user already exists!");
    }

    @Override
    public void removeUser(String user) {
        mapName.remove(user);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest) {
        if(mapName.containsKey(user) && !mapName.get(user).contains(topicOfInterest)) mapName.get(user).add(topicOfInterest);
        throw new IllegalArgumentException("User already has this interest");
    }

    public void removeInterest(String user, TopicOfInterest topicOfInterest){
        if(mapName.containsKey(user)) mapName.get(user).remove(topicOfInterest);
        throw new IllegalArgumentException("Cannot remove this interest.");
    }

    @Override
    public List<String> getUsers() {
        List<String> userList = new ArrayList<>();
        mapName.forEach((key, value) -> userList.add(key));
        return userList;
    }

    @Override
    public List<TopicOfInterest> getInterests() {
        List<TopicOfInterest> interestList = new ArrayList<>();
        mapName.forEach((key, value) -> interestList.addAll(value));
        return interestList;
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {
        return mapName.get(user);
    }
}
