package e2;
import java.util.ArrayList;
import java.util.List;

public class Task implements Comparable <Task>{

    private final char name;
    private final int level;
    public boolean available = false;
    public boolean completed = false;

    Task(char name, int level) {
        this.name = name;
        this.level = level;
    }

    public char getName() {
        return this.name;
    }
    public int getLevel(){
        return this.level;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(String.valueOf(this.name).compareTo(String.valueOf(o.name)), 0);
    }

    public String toString(){
        return String.valueOf(this.name);
    }
}

