package ChainOfResponsibility.TaskCategorization.domain;

import java.util.ArrayList;
import java.util.List;

public class TaskCategory {
    private List<Bug> bugs = new ArrayList<>();
    private List<Suggestion> suggestions = new ArrayList<>();
    private List<Improvement> improvements = new ArrayList<>();

    public List<Bug> getBugs() {
        return bugs;
    }

    public void setBugs(List<Bug> bugs) {
        this.bugs = bugs;
    }

    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }

    public List<Improvement> getImprovements() {
        return improvements;
    }

    public void setImprovements(List<Improvement> improvements) {
        this.improvements = improvements;
    }
}
