package ChainOfResponsibility.TaskCategorization;

import ChainOfResponsibility.TaskCategorization.chain.*;
import ChainOfResponsibility.TaskCategorization.domain.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskCategoryChain taskCategoryChain = new TaskCategoryChain();

        taskCategoryChain.getHandlers().add(new BugCategorizationHandler());
        taskCategoryChain.getHandlers().add(new SuggestionCategorizationHandler());
        taskCategoryChain.getHandlers().add(new ImprovementCategorizationHandler());

        List<Task> taskList = new ArrayList<>();
        taskList.add(new Bug("Bug1"));
        taskList.add(new Bug("Bug2"));
        taskList.add(new Bug("Bug3"));
        taskList.add(new Bug("Bug4"));
        taskList.add(new Suggestion("Suggestion1"));
        taskList.add(new Suggestion("Suggestion2"));
        taskList.add(new Suggestion("Suggestion3"));
        taskList.add(new Suggestion("Suggestion4"));
        taskList.add(new Improvement("Improvement1"));
        taskList.add(new Improvement("Improvement2"));
        taskList.add(new Improvement("Improvement3"));
        taskList.add(new Improvement("Improvement4"));

        TaskCategory taskCategory = new TaskCategory();

        for (TaskCategoryHandler handler : taskCategoryChain.getHandlers()) {
            handler.categorize(taskList,taskCategory);
        }

    }
}
