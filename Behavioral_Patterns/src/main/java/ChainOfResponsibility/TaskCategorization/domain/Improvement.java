package ChainOfResponsibility.TaskCategorization.domain;

public class Improvement extends Task {
    public Improvement (String description) {
        super(TaskType.IMPROVEMENT,description);
    }
}
