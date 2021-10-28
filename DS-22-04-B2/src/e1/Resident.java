package e1;

public class Resident extends Member {

    public House house;

    Resident(String name, String surname, int age, int horrocrux, House house){
        super(name, surname, age, horrocrux);
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    //este setter no deberia ser necesario
    public void setHouse(House house) {
        this.house = house;
    }

    public static class Student extends Resident{
        Student(String name, String surname, int age, int horrocrux, House house){
            super(name, surname, age, horrocrux, house);
        }
        @Override
        public Number calculateReward() {
            if(house != House.SLYTHERIN){
                return 90*horrocrux;
            }
            return 2*90*horrocrux;
        }

        @Override
        public String toString(){
            return name + " " + surname + "(Estudiante de " + this.house + "," + this.horrocrux + " horrocruxes): " +
                    this.calculateReward() + " galeones\n";
        }
    }

    public static class Ghost extends Resident{
        Ghost(String name, String surname, int age, int horrocrux, House house){
            super(name, surname, age, horrocrux, house);
        }
        @Override
        public Number calculateReward() {
            if(house != House.SLYTHERIN){
                return 80*horrocrux;
            }
            return 2*80*horrocrux;
        }

        @Override
        public String toString(){
            return name + " " + surname + "(Fantasma de " + this.house + "," + this.horrocrux + " horrocruxes): " +
                    this.calculateReward() + " galeones\n";
        }
    }
}
