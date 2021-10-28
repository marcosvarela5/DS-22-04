package e1;

public enum Subject {
    HISTORY("History"),
    DEFENSE("Defense"),
    TRANSFORMATIONS("Transformations"),
    POTIONS("Potions"),
    HERBOLOGY("Herbology");

    private final String symbol;

    Subject(String name) {
        this.symbol = name;
    }

    public String toString(){
        return symbol;
    }
}
