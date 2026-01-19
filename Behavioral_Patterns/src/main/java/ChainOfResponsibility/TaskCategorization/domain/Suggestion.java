package ChainOfResponsibility.TaskCategorization.domain;

public class Suggestion extends Task {
    public Suggestion (String description) {
        super(TaskType.SUGGESTION,description);
    }
}
