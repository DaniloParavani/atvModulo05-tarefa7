package exercicio03;

public class VersionControl {

    public static void main(String[] args) {

        VersionControlManagement editor = new VersionControlManagement();

        editor.addText("Vamos ");
        editor.showText();

        editor.addText("começar o ");
        editor.showText();

        editor.addText("projeto!");
        editor.showText();

        editor.undo();
        editor.showText();

        editor.undo();
        editor.showText();

        editor.undo();
        editor.showText();
    }
}
