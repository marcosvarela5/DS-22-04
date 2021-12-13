package e2;
import java.util.List;

public class Task {

    private final String name;
    public List<String> ancestorList;
    public List<String> successorList;
    public boolean available;
    public boolean completed;

    Task(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getAncestorList() {
        return this.ancestorList;
    }

    public List<String> getSuccessorList() {
        return this.successorList;
    }
}

