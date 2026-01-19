package ChainOfResponsibility.TaskCategorization.chain;

import ChainOfResponsibility.TaskCategorization.domain.Suggestion;
import ChainOfResponsibility.TaskCategorization.domain.Task;
import ChainOfResponsibility.TaskCategorization.domain.TaskCategory;
import ChainOfResponsibility.TaskCategorization.domain.TaskType;

import java.util.List;

public class SuggestionCategorizationHandler implements TaskCategoryHandler {
    @Override
    public void categorize(List<Task> tasks, TaskCategory taskCategory) {
        for (Task task : tasks) {
            if (task.isYourType(TaskType.SUGGESTION)) {
                taskCategory.getSuggestions().add((Suggestion) task);
            }
        }
    }
}
