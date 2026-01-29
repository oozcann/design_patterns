package MementoPattern.Editor;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.write("Merhaba ");
        history.save(editor);

        editor.write("Dünya!");
        history.save(editor);

        editor.write(" Nasılsın?");
        System.out.println(editor.getContent()); // "Merhaba Dünya! Nasılsın?"

        history.undo(editor);
        System.out.println(editor.getContent()); // "Merhaba Dünya!"

        history.undo(editor);
        System.out.println(editor.getContent());


    }
}
