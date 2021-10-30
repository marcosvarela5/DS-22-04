package e2;

public enum Size {
    FAMILIAR("Familiar"),
    COUPLE("Couple"),
    INDIVIDUAL("Individual");


    private final String name;

    Size(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
