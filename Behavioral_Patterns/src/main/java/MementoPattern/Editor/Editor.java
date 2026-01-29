package MementoPattern.Editor;

class Editor implements IEditor{
    private String content = "";

    public Editor () {

    }

    public class EditorMemento implements IMemento{
        private final String content;

        public EditorMemento(String content) {
            this.content = content;
        }
    }

    @Override
    public IMemento save () {
        return new EditorMemento(content);
    }

    @Override
    public void restore (IMemento memento) {
        if (memento instanceof EditorMemento) {
            this.content = ((EditorMemento) memento).content;

        }
    }

    public void write (String text) {
        content += text;
    }

    public String getContent() {
        return this.content;
    }

}
