package e1;

public abstract  class Worker extends Member{

    Worker(String name, String surname, int age, int horrocrux){
        super(name, surname, age, horrocrux);
    }
    public abstract int calculateSalary();
    public abstract String toStringReward();
    public abstract String toStringSalary();

    //Subclase docente
    public static class Teacher extends Worker{
        Subject subject;
        Teacher(String name, String surname, int age, int horrocrux, Subject subject){
            super(name, surname, age, horrocrux);
            this.subject = subject;
        }
        @Override
        public double calculateReward() {
            if(subject == Subject.DEFENSE){ return horrocrux*50*0.75;}
            else return horrocrux*50;
        }

        @Override
        public int calculateSalary(){
            if(subject == Subject.DEFENSE) return 500;
            if(subject == Subject.TRANSFORMATIONS) return 400;
            if(subject == Subject.POTIONS) return 350;
            if(subject == Subject.HERBOLOGY) return 250;
            return 200; //no te va a dejar crear un profesor que no sea de otra asignatura
        }

        @Override
        public String toStringReward(){
            return name + " " + surname + "(Docente de " + this.subject + "," + this.horrocrux + " horrocruxes): " +
                    this.calculateReward() + " galeones\n";
        }
        @Override
        public String toStringSalary(){
            return name + " " + surname + "(Docente de " + this.subject + "): " + this.calculateSalary() + " galeones\n";
        }

    }

    //Subclase conserje
    public static class Janitor extends Worker{
        boolean night;
        Janitor(String name, String surname, int age, int horrocrux, boolean night){
            super(name, surname, age, horrocrux);
            this.night = night;
        }
        @Override
        public double calculateReward() {
            return horrocrux*65;
        }

        @Override
        public int calculateSalary() {
            if (night) {return 160;}
            return 150;
        }

        @Override
        public String toStringReward(){
            return name + " " + surname + "(Conserje, " + this.horrocrux + " horrocruxes): " +
                    this.calculateReward() + " galeones\n";
        }

        @Override
        public String toStringSalary() {
            return name + " " + surname + "(Conserje): " + this.calculateSalary() + " galeones\n";
        }
    }

    //Subclase guardabosques
    public static class Ranger extends Worker {
        boolean night; //de tal forma que al crear un guardabosques se ha de indicar si tiene o no turno de noche

        Ranger(String name, String surname, int age, int horrocrux, boolean night) {
            super(name, surname, age, horrocrux);
            this.night = night;
        }

        public boolean isNight() {
            return night;
        }

        public void setNight(boolean night) { //metodo para cambiar el valor del turno de noche de un guardabosques
            this.night = night;
        }

        @Override
        public double calculateReward() {
            return horrocrux * 75;
        }

        public int calculateSalary() {
            if (night) {return 180;}
            return 170;
        }

        public String toStringReward(){
            return name + " " + surname + "(Guardabosques, " + this.horrocrux + " horrocruxes): " +
                    this.calculateReward() + " galeones\n";
        }

        @Override
        public String toStringSalary() {
            return name + " " + surname + "(Guardabosques): " + this.calculateSalary() + " galeones\n";
        }
    }
}
