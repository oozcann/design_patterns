package ChainOfResponsibility.TaskCategorization.chain;

import java.util.ArrayList;
import java.util.List;

public class TaskCategoryChain {
    private List<TaskCategoryHandler> handlers = new ArrayList<>();

    public List<TaskCategoryHandler> getHandlers() {
        return handlers;
    }

    public void setHandlers(List<TaskCategoryHandler> handlers) {
        this.handlers = handlers;
    }
}
