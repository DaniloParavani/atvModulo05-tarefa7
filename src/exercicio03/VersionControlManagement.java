package exercicio03;

import java.util.LinkedList;

public class VersionControlManagement {

    private LinkedList<String> texts;

    public VersionControlManagement() {
        this.texts = new LinkedList<>();
    }

    public void addText(String newText) {
        texts.addLast(newText);
    }

    public void undo() {
        texts.removeLast();
    }

    public void showText() {

        if (texts.isEmpty()) {
            System.out.println("Texto vazio");
            return;
        }

        System.out.print("Texto Atual: ");

        for (String action : texts) {
            System.out.print(action);
        }

        System.out.println();
    }
}
