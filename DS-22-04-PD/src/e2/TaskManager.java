package e2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List<Task> taskList = new ArrayList<>();

    public static boolean isCompleted(Task task){
        return task.completed;
    }

    public static boolean isAvailable(Task task){
        return task.available;
    }

    public static void markAsCompleted(Task task){
        task.completed = true;
    }

    public static void markAsAvailable(Task task){
        task.available = true;
    }
}

