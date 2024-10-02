package exercicio02;

import java.util.LinkedList;
public class Historic {

    private LinkedList<String> historic;
    private int maxSize;

    public Historic() {
        this.historic = new LinkedList<>();
        this.maxSize = 3;
    }

    public void addURL(String url) {

        if (historic.size() == maxSize) {
            historic.removeFirst();
        }

        historic.addLast(url);
    }

    public void showHistoric() {

        System.out.println("Histórico de navegação:");

        for (String url : historic) {
            System.out.println(url);
        }
    }
}
