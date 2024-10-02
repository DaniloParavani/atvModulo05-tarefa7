package exercicio01;

public class TaskManager {

    public static void main(String[] args) {
        ManagerTask managerTask = new ManagerTask();

        managerTask.add("Lavar louça");
        managerTask.add("Estudar java");
        managerTask.add("Passear com o cachorro");

        System.out.println("\nLista de Tarefas:");
        managerTask.listTasks();

        managerTask.markTaskIsFinished(1);

        System.out.println("\nLista de Tarefas após concluir uma tarefa:");
        managerTask.listTasks();

        managerTask.deleteTask(0);

        System.out.println("\nLista de Tarefas após remover uma tarefa:");
        managerTask.listTasks();
    }
}
