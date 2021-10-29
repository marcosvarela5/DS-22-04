package e1;

public interface Reward {
    public default Number calculateReward(){
        throw new IllegalArgumentException("You need to specify the type of character to calculate its reward!");
    }
    public default int calculateSalary(){ //retorna una excepcion cuando se aplica sobre un tipo que no tiene salario implementado, es decir, los estudiantes
       throw new IllegalArgumentException("This type of member does not have a salary");
    }
}
