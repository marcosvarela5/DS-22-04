package e1;

public abstract class Resident extends Member {

    public House house;

    Resident(String name, String surname, int age, int horrocrux, House house){
        super(name, surname, age, horrocrux);
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public abstract String toStringReward();

    //Sublcase Estudiante
    public static class Student extends Resident{
        Student(String name, String surname, int age, int horrocrux, House house){
            super(name, surname, age, horrocrux, house);
        }
        @Override
        public double calculateReward() {
            if(house != House.SLYTHERIN){
                return 90*horrocrux;
            }
            return 2*90*horrocrux;
        }

        @Override
        public String toStringReward(){
            return name + " " + surname + "(Estudiante de " + this.house + "," + this.horrocrux + " horrocruxes): " +
                    this.calculateReward() + " galeones\n";
        }

        @Override //no procede en esta clase
        public String toStringSalary() {
            return null;
        }
    }

    //Subclase Fantasma
    public static class Ghost extends Resident{
        Ghost(String name, String surname, int age, int horrocrux, House house){
            super(name, surname, age, horrocrux, house);
        }
        @Override
        public double calculateReward() {
            if(house != House.SLYTHERIN){
                return 80*horrocrux;
            }
            return 2*80*horrocrux;
        }

        @Override
        public String toStringReward(){
            return name + " " + surname + "(Fantasma de " + this.house + "," + this.horrocrux + " horrocruxes): " +
                    this.calculateReward() + " galeones\n";
        }

        @Override //no procede en esta clase
        public String toStringSalary() {
            return null;
        }
    }
}
