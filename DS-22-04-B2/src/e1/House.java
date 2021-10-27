package e1;

public enum House {
    GRYFFINDOR("Gryffindor"),
    HUFFLEPUFF("Hufflepuff"),
    RAVENCLAW("Ravenclaw"),
    SLYTHERIN("Slytherin");

    private final String symbol;

    House(String symbol) {
        this.symbol = symbol;
    }

    public String toString(){
        return symbol;
    }
}



