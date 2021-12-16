package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StrongDependencies implements Algorythm {

    @Override
    public void order(List<Task> taskList) {
        int i, j, cont = 0;
        List<String> nameList = new ArrayList<>();
        List<Task> completedTasks = new ArrayList<>();
        List<Task> availableTasks = new ArrayList<>();

       /* do {
            for (i = 0; i < taskList.size(); i++) {
                    TaskManager.markAsAvailable(taskList.get(i));
                    availableTasks.add(taskList.get(i));
                    for (j = 0; j < taskList.get(i).getAncestorList().size(); j++) {
                        if(TaskManager.isCompleted(taskList.get(i).getAncestorList().get(j)))
                            TaskManager.markAsAvailable(taskList.get(i));
                        availableTasks.add(taskList.get(i));
                    }

                    if (TaskManager.isAvailable(taskList.get(i))) {
                        Collections.sort(availableTasks);
                        TaskManager.markAsCompleted(availableTasks.get(0));
                        completedTasks.add(availableTasks.get(0));
                    }
                }
        cont++;
        } while(cont < taskList.size());
        System.out.println(completedTasks); */
    }
}
