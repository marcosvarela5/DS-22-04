package e3;

public enum Accidentals {
    Flat("b"),
    Sharp("#"),
    Natural("");

    private final String symbol;

    Accidentals(String symbol) {
        this.symbol = symbol;
    }

    public String toString(){
        return symbol;
    }
}
