package MementoPattern.Editor;

public interface IEditor {
    IMemento save ();
    void restore (IMemento memento);
}
