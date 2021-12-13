package e1;

public enum Clausula {
    AND("AND"),
    OR("OR");

    private final String symbol;

    Clausula(String name) {
        this.symbol = name;
    }

    public String toString(){
        return symbol;
    }
}
