package e2;

public class TaskManager {

    public void setAncestor(Task task){
        switch (task.getName()) {
            case "A" -> task.ancestorList.add("C");
            case "B", "D" -> task.ancestorList.add("A");
            case "C", "G" -> task.ancestorList.add(null);
            case "E" -> {
                task.ancestorList.add("B");
                task.ancestorList.add("D");
                task.ancestorList.add("F");
            }
            case "F", "H" -> task.ancestorList.add("G");
            case "J" -> {
                task.ancestorList.add("F");
                task.ancestorList.add("H");
            }
        }
    }

    public void setSuccessor(Task task) {
        switch (task.getName()) {
            case "A" -> {
                task.successorList.add("B");
                task.successorList.add("D");
            }
            case "B", "D" -> task.successorList.add("E");
            case "C" -> {
                task.successorList.add("A");
                task.successorList.add("F");
            }
            case "E", "J" -> task.successorList.add(null);
            case "F" -> {
                task.successorList.add("J");
                task.successorList.add("E");
            }
            case "G" -> {
                task.successorList.add("H");
                task.successorList.add("F");
            }
        }
    }

    public boolean hasAncestor(Task task){
        for(int i = 0; i < task.ancestorList.size(); i++){
            if(task.ancestorList.get(i) == null) return false;
        }
        return true;
    }

    public boolean hasSuccessor(Task task){
        for(int i = 0; i < task.successorList.size(); i++){
            if(task.successorList.get(i) == null) return false;
        }
        return true;
    }
}

