package ChainOfResponsibility.TaskCategorization.chain;

import ChainOfResponsibility.TaskCategorization.domain.Bug;
import ChainOfResponsibility.TaskCategorization.domain.Task;
import ChainOfResponsibility.TaskCategorization.domain.TaskCategory;
import ChainOfResponsibility.TaskCategorization.domain.TaskType;

import java.util.List;

public class BugCategorizationHandler implements TaskCategoryHandler {
    @Override
    public void categorize(List<Task> tasks, TaskCategory taskCategory) {
        for (Task task : tasks) {
            if (task.isYourType(TaskType.BUG)) {
                taskCategory.getBugs().add((Bug) task);
            }
        }
    }
}
