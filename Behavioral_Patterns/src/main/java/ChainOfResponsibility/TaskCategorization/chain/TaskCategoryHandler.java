package ChainOfResponsibility.TaskCategorization.chain;

import ChainOfResponsibility.TaskCategorization.domain.Task;
import ChainOfResponsibility.TaskCategorization.domain.TaskCategory;

import java.util.List;

public interface TaskCategoryHandler {
    void categorize(List<Task> tasks, TaskCategory taskCategory);
}