package exercicio04;

public class VersionControl {

    public static void main(String[] args) {
        VersionControlManagement editor = new VersionControlManagement();

        editor.addText("Olá, ");
        editor.showText();

        editor.addText("mundo!");
        editor.showText();

        editor.undo();  // Desfaz "mundo!"
        editor.showText();

        editor.redo();  // Refaz "mundo!"
        editor.showText();
    }

}
