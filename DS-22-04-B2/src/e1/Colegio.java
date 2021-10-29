package e1;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Colegio {

    public static List<String> imprimirRecompensas(List<Member> memberList){

        List<String> rewardList = new ArrayList<>();
        for(Member member : memberList) {
            rewardList.add(member.toStringReward());
        }
        return rewardList;
    }

    public static List<String> imprimirSalarios(List<Member> workerList){
        List<String> salaryList = new ArrayList<>();
        int gasto = 0;
        for(Member worker : workerList) {
            if(worker instanceof Resident) throw new IllegalArgumentException("A resident does not have salary, only workers do");
            else
            salaryList.add(worker.toStringSalary());
        }

        for(Member worker : workerList){
            gasto += worker.calculateSalary();
        }
        salaryList.add("El gasto de Hogwarts en personal es de " + gasto + " galeones.");
        return salaryList;
    }


    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        List<Member> workerList = new ArrayList<>();
        Member hermione = new Resident.Student("Hermione", "Granger", 18, 45, House.HUFFLEPUFF);
        Member baron = new Resident.Student("Barón", "Sanguinario", 85, 5, House.SLYTHERIN);
        Member severus = new Worker.Teacher("Severus", "Snape", 50, 3, Subject.DEFENSE);
        Member winters = new Worker.Ranger("Dick", "Winters", 29, 2, true);
        Member toye = new Worker.Ranger("Joe", "Toye", 25, 2, false);
        memberList.add(hermione);
        memberList.add(baron);
        memberList.add(severus);
        memberList.add(winters);
        memberList.add(toye);
        workerList.add(winters);
        workerList.add(toye);
        workerList.add(severus);

        //formato
        String s1 = imprimirRecompensas(memberList).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println(s1);

        String s2 = imprimirSalarios(workerList).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println(s2);
    }
}
