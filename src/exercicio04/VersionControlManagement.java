package exercicio04;

import java.util.LinkedList;
import java.util.ListIterator;

public class VersionControlManagement {

    private LinkedList<String> actions = new LinkedList<>();
    private ListIterator<String> undoRedo = actions.listIterator();
    private String currentText = "";

    // Adiciona uma nova ação de texto ao editor
    public void addText(String newText) {
        // Remove todas as ações "futuras" antes de adicionar nova ação
        while (undoRedo.hasNext()) {
            undoRedo.next();
            undoRedo.remove();  // Remove as ações "futuras" após o ponto atual
        }

        // Adiciona nova ação ao ponto atual
        undoRedo.add(newText);
        updateText();  // Atualiza o texto completo com base nas ações
        System.out.println("Texto adicionado: " + newText);
    }

    // Desfaz a última ação
    public void undo() {
        if (undoRedo.hasPrevious()) {
            undoRedo.previous();  // Move o iterador para a ação anterior
            updateText();  // Atualiza o texto completo após desfazer
            System.out.println("Desfeita a última ação.");
        } else {
            System.out.println("Nenhuma ação para desfazer.");
        }
    }

    // Refaz a última ação
    public void redo() {
        if (undoRedo.hasNext()) {
            undoRedo.next();  // Move o iterador para a próxima ação
            updateText();  // Atualiza o texto completo com base nas ações
            System.out.println("Refazendo a última ação.");
        } else {
            System.out.println("Nenhuma ação para refazer.");
        }
    }

    // Atualiza o texto completo com base nas ações até o ponto atual do iterador
    private void updateText() {
        String text = "";  // Reinicializa o texto
        ListIterator<String> tempIterator = actions.listIterator();  // Cria um iterador temporário

        // Percorre todas as ações até a posição atual do iterador undoRedo
        while (tempIterator.hasNext() && tempIterator.nextIndex() <= undoRedo.nextIndex() - 1) {
            text += tempIterator.next();  // Concatena cada ação à string final
        }

        this.currentText = text;  // Atualiza o texto final
    }

    // Exibe o texto atual
    public void showText() {
        System.out.println("Texto Atual: " + currentText);
    }
}
