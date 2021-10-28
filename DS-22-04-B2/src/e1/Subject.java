package e1;

public enum Subject {
    HISTORY("Historia"),
    DEFENSE("Defensa"),
    TRANSFORMATIONS("Transformaciones"),
    POTIONS("Pociones"),
    HERBOLOGY("Herbología");

    private final String symbol;

    Subject(String name) {
        this.symbol = name;
    }

    public String toString(){
        return symbol;
    }
}
