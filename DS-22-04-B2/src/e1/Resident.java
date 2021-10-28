package e1;

public class Resident extends Member {

    public House house;

    Resident(String name, String surname, int age, House house){
        super(name, surname, age);
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    //este setter no deberia ser necesario
    public void setHouse(House house) {
        this.house = house;
    }


}
