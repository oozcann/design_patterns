package ChainOfResponsibility.TaskCategorization.domain;

public class Bug extends Task{

    public Bug(String description) {
        super(TaskType.BUG, description);
    }
}
