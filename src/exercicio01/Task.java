package exercicio01;

public class Task {

    String task;
    boolean isFinished;

    Task(String task) {
        this.task = task;
        this.isFinished = false;
    }

    void isFinished() {
        this.isFinished = true;
    }

    @Override
    public String toString() {

        if (isFinished) {
            return (task + " (Concluída)");
        } else {
            return (task + " (Pendente)");
        }
    }
}
