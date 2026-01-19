package ChainOfResponsibility.TaskCategorization.chain;

import ChainOfResponsibility.TaskCategorization.domain.Improvement;
import ChainOfResponsibility.TaskCategorization.domain.Task;
import ChainOfResponsibility.TaskCategorization.domain.TaskCategory;
import ChainOfResponsibility.TaskCategorization.domain.TaskType;

import java.util.List;

public class ImprovementCategorizationHandler implements TaskCategoryHandler {

    @Override
    public void categorize(List<Task> tasks, TaskCategory taskCategory) {
        for (Task task : tasks) {
            if (task.isYourType(TaskType.IMPROVEMENT)) {
                taskCategory.getImprovements().add((Improvement) task);
            }
        }
    }
}
