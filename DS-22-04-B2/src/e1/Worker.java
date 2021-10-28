package e1;

public class Worker extends Member{

    Worker(String name, String surname, int age, int horrocrux){
        super(name, surname, age, horrocrux);
    }

    public static class Teacher extends Worker{
        Subject subject;
        Teacher(String name, String surname, int age, int horrocrux, Subject subject){
            super(name, surname, age, horrocrux);
            this.subject = subject;
        }
        @Override
        public Number calculateReward() {
            if(subject == Subject.DEFENSE){ return horrocrux*50*0.75;}
            else return horrocrux*50;
        }

        public Number calculateSalary(){
            if(subject == Subject.DEFENSE) return 500;
            if(subject == Subject.TRANSFORMATIONS) return 400;
            if(subject == Subject.POTIONS) return 350;
            if(subject == Subject.HERBOLOGY) return 250;
            return 200; //no te va a dejar crear un profesor que no sea de otra asignatura
        }

        @Override
        public String toString(){
            return name + " " + surname + "(Docente de " + this.subject + "," + this.horrocrux + " horrocruxes): " +
                    this.calculateReward() + " galeones\n";
        }
    }

    public static class Conserje extends Worker{
        boolean night;
        Conserje(String name, String surname, int age, int horrocrux, boolean night){
            super(name, surname, age, horrocrux);
            this.night = night;
        }
        @Override
        public Number calculateReward() {
            return horrocrux*65;
        }

        public Number calculateSalary() {
            if (night) {return 160;}
            return 150;
        }

        @Override
        public String toString(){
            return name + " " + surname + "(Conserje, " + this.horrocrux + " horrocruxes): " +
                    this.calculateReward() + " galeones\n";
        }
    }

    public static class Guardabosques extends Worker {
        boolean night;

        Guardabosques(String name, String surname, int age, int horrocrux, boolean night) {
            super(name, surname, age, horrocrux);
            this.night = night;
        }

        @Override
        public Number calculateReward() {
            return horrocrux * 75;
        }

        public Number calculateSalary() {
            if (night) {return 180;}
            return 170;
        }

        public String toString(){
            return name + " " + surname + "(Guardabosques, " + this.horrocrux + " horrocruxes): " +
                    this.calculateReward() + " galeones\n";
        }
    }







}
