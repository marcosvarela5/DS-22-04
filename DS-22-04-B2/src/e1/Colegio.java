package e1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Colegio {

    public static List<String> imprimirRecompensas(List<Member> memberList){

        List<String> rewardList = new ArrayList<>();
        for(Member member : memberList) {
            rewardList.add(member.toString());
        }
        return rewardList;
    }

    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        Member hermione = new Resident.Student("Hermione", "Granger", 18, 45, House.HUFFLEPUFF);
        Member baron = new Resident.Student("Barón", "Sanguinario", 85, 5, House.SLYTHERIN);
        Member severus = new Worker.Teacher("Severus", "Snape", 50, 3, Subject.DEFENSE);
        memberList.add(hermione);
        memberList.add(baron);
        memberList.add(severus);
        //formato(cambiar de sitio)
        String s = imprimirRecompensas(memberList).stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(""));
        System.out.println(s);
    }
}
