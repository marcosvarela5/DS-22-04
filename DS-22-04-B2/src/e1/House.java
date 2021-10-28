package e1;

public enum House {
    GRYFFINDOR("Gryffindor"),
    HUFFLEPUFF("Hufflepuff"),
    RAVENCLAW("Ravenclaw"),
    SLYTHERIN("Slytherin");

    private final String symbol;

    House(String name) {
        this.symbol = name;
    }

    public String toString(){
        return symbol;
    }
}



