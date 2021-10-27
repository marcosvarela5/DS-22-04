package e1;

public enum Subject {
    HISTORY("History"),
    DEFENSE("Defense"),
    TRANSFORMATIONS("Transformations"),
    POTIONS("Potions"),
    HERBOLOGY("Herbology");

    private final String symbol;

    Subject(String symbol) {
        this.symbol = symbol;
    }

    public String toString(){
        return symbol;
    }
}
