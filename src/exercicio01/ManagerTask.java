package exercicio01;

import java.util.LinkedList;

public class ManagerTask {

    private LinkedList<Task> tasks;

    public ManagerTask() {
        this.tasks = new LinkedList<>();
    }

    public void add(String task) {

        Task newTask = new Task(task);
        tasks.add(newTask);
    }

    public void markTaskIsFinished(int index) {

        tasks.get(index).isFinished();
    }

    public void deleteTask(int index) {

        tasks.remove(index);
    }

    public void listTasks() {

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }
}
