package ChainOfResponsibility.TaskCategorization.domain;

public abstract class Task {
    private String description;
    private TaskType type;

    public Task(TaskType type,String description) {
        this.description = description;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public TaskType getType() {
        return type;
    }

    public boolean isYourType (TaskType type) {
        return this.type.equals(type);
    }

}
