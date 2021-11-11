package e3;

import java.util.*;

public class NetworkTable implements NetworkManager{
    String [] userTable = new String[1000]; //1000 users
    TopicOfInterest [][] topicTable = new TopicOfInterest[1000][100]; // 100 topics for each user


    @Override
    public void addUser(String user, List<TopicOfInterest> topicsOfInterest) {
        int i = 0;
        int j = 0;
        int a = 0;
        while (userTable[i] != null) {
            i++;
            if (i == userTable.length - 1) throw new IllegalArgumentException("Can't add new user");
        }
        userTable[i] = user;

        while (topicTable[i][j] != null && a < topicsOfInterest.size()) {
            a++;
            j++;
            if(j > 99) throw new IllegalArgumentException("Can't add new user");
        }
        topicTable[i][j] = topicsOfInterest.get(i);
    }

    @Override
    public void removeUser(String user) {
        for(int i = 0; i< userTable.length; i++){
            if(userTable[i].equals(user)){
                userTable[i] = null;
                topicTable[i] = null;
            }
        }
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest) {
        int i;
        int j;
        for(i = 0; i < userTable.length; i++) {
            for (j = 0; j < topicTable.length; j++) {
            if (userTable[i].equals(user)){
                while(topicTable[i][j] == null){ j++;}
                topicTable[i][j] = topicOfInterest;}
            }
        }
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
        int i;
        int j;
        for(i = 0; i < userTable.length; i++) {
            for (j = 0; j < topicTable.length; j++) {
                if (topicTable[i][j].equals(topicOfInterest)){
                    topicTable[i][j] = null;}
            }
        }
    }

    @Override
    public List<String> getUsers() {
        return new ArrayList<>(Arrays.asList(userTable));
    }

    @Override
    public List<TopicOfInterest> getInterests() {
        List<TopicOfInterest> topicOfInterestList = new ArrayList<>();
        for (TopicOfInterest[] topicOfInterests : topicTable) {
            topicOfInterestList.addAll(Arrays.asList(topicOfInterests).subList(0, topicTable[0].length));
        }
        return topicOfInterestList;
    }

    @Override
    public List<TopicOfInterest> getInterestsUser(String user) {

        List<TopicOfInterest> interestList = new ArrayList<>();
        for(int i = 0; i < userTable.length; i++){
            if(user.equals(userTable[i])){
                interestList.addAll(Arrays.asList(topicTable[i]));
            }
        }
        return interestList;
    }
}
