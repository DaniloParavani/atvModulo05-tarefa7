package exercicio02;

public class BrowserHistoric {

    public static void main(String[] args) {

        Historic historic = new Historic();

        historic.addURL("https://www.google.com.br");
        historic.addURL("https://aws.amazon.com/pt/");
        historic.addURL("https://www.uol.com.br/");

        historic.showHistoric();

        historic.addURL("https://g1.globo.com/");

        historic.showHistoric();

    }
}
