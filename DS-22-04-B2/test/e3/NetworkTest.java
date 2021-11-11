package e3;

import e1.Colegio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {

    Network mapNet;
    Network tableNet;
    List<TopicOfInterest> topicOfInterestList;
    List<TopicOfInterest> anEmptyList;
    TopicOfInterest t1;
    TopicOfInterest t2;
    TopicOfInterest t3;
    TopicOfInterest t4;
    @BeforeEach
    void setUp() {
        topicOfInterestList = new ArrayList<>();
        anEmptyList = new ArrayList<>();
        mapNet = new Network(new NetworkMap());
        tableNet = new Network(new NetworkTable());
        t1 = new TopicOfInterest("COCHES");
        t2 = new TopicOfInterest("COCINA");
        t3 = new TopicOfInterest("DEPORTES");
        t4 = new TopicOfInterest("JAVA");
        topicOfInterestList.add(t1);
        topicOfInterestList.add(t3);
    }

    @Test
    void testAddUserMap(){
        assertTrue(mapNet.getUsers().isEmpty());
        mapNet.addUser("pepe", topicOfInterestList);
        mapNet.addUser("carlos", topicOfInterestList);
        assertFalse(topicOfInterestList.isEmpty());
        assertFalse(mapNet.getUsers().isEmpty());
        assertEquals(mapNet.getUsers().toString(), "[carlos, pepe]");
    }

    @Disabled
    void testAddUserTable(){
        tableNet.addUser("pepe", topicOfInterestList);
        tableNet.addUser("carlos", topicOfInterestList);
        assertEquals(mapNet.getUsers().toString(), "[carlos, pepe]");
    }

    @Test
    void testRemoveUserMap(){
        mapNet.addUser("pepe", topicOfInterestList);
        mapNet.addUser("carlos", topicOfInterestList);
        mapNet.removeUser("pepe");
        assertFalse(mapNet.getUsers().isEmpty());
        mapNet.removeUser("carlos");
        assertTrue(mapNet.getUsers().isEmpty());
    }

    @Disabled
    void testRemoveUserTable(){
        tableNet.addUser("pepe", topicOfInterestList);
        tableNet.addUser("carlos", topicOfInterestList);
        tableNet.removeUser("pepe");
        assertFalse(mapNet.getUsers().isEmpty());
        tableNet.removeUser("carlos");
        assertTrue(mapNet.getUsers().isEmpty());
    }

    @Test
    void testAddInterestMap(){
        List<TopicOfInterest> emptyList = new ArrayList<>();
        List<TopicOfInterest> emptyList2 = new ArrayList<>();
        mapNet.addUser("pepe", emptyList);
        mapNet.addInterest("pepe", t4);
        mapNet.addInterest("pepe", t2);
        assertThrows(IllegalArgumentException.class, () -> mapNet.addInterest("carlos", t3));
        mapNet.addUser("carlos", emptyList2);
        mapNet.addInterest("carlos", t3);
        assertEquals(mapNet.getInterestsUser("pepe").toString(), emptyList.toString());
        assertEquals(mapNet.getInterestsUser("pepe"), emptyList);
        assertEquals(mapNet.getInterestsUser("carlos").toString(), emptyList2.toString());
        assertEquals(mapNet.getInterestsUser("carlos"), emptyList2);
    }

    @Disabled
    void AddInterestTable(){

    }

    @Test
    void testRemoveInterestMap(){
        List<TopicOfInterest> emptyList = new ArrayList<>();
        mapNet.addUser("pepe", emptyList);
        mapNet.addInterest("pepe", t4);
        mapNet.addInterest("pepe", t2);
        assertFalse(emptyList.isEmpty());
        mapNet.removeInterest("pepe", t4);
        mapNet.removeInterest("pepe", t2);
        assertTrue(emptyList.isEmpty());
    }

    @Test
    void getUsers(){
        List<String> userList = new ArrayList<>();
        mapNet.addUser("pepe", anEmptyList);
        mapNet.addUser("manolo", anEmptyList);
        mapNet.addUser("roberto", anEmptyList);
        userList.add("manolo");
        userList.add("roberto");
        userList.add("pepe"); //Se pone en este orden a causa de la ordenación del tipo de Map utilizado, el HashMap
        assertEquals(userList, mapNet.getUsers());
    }

    @Test
    void testGetInterests(){
        List<TopicOfInterest> emptyList = new ArrayList<>();
        mapNet.addUser("pepe", emptyList);
        mapNet.addInterest("pepe", t4);
        mapNet.addInterest("pepe", t2);
        assertEquals(mapNet.getInterests(), emptyList);
    }

    @Test
    void testInterestUser(){
        List<TopicOfInterest> emptyList = new ArrayList<>();
        List<TopicOfInterest> emptyList2 = new ArrayList<>();
        mapNet.addUser("pepe", emptyList);
        mapNet.addUser("carlos", emptyList2);
        mapNet.addInterest("pepe", t4);
        mapNet.addInterest("pepe", t2);
        assertEquals(mapNet.getInterests(), Stream.concat(emptyList2.stream(), emptyList.stream()).collect(Collectors.toList()));
    }
}