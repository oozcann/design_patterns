package MementoPattern.Editor;

import java.util.Stack;

public class History {
    private Stack<IMemento> mementos = new Stack<>();

    public void save(IEditor editor) {
        mementos.push(editor.save());
    }
    public void undo (IEditor editor) {
        if (!mementos.isEmpty()) {
            editor.restore(mementos.pop());
        }
    }
}
