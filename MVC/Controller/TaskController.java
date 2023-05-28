import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private List<Task> tasks;
    private TaskView view;
    
    public TaskController(TaskView view) {
        this.view = view;
        tasks = new ArrayList<>();
    }
    
    public void addTask() {
        String taskDetails = view.promptTaskDetails();
        String[] details = taskDetails.split(",");
        String title = details[0];
        String description = details[1];
        LocalDate dueDate = LocalDate.parse(details[2]);
        Task task = new Task(title, description, dueDate);
        tasks.add(task);
        view.showMessage("Task added successfully.");
    }
    
    public void completeTask() {
        String taskId = view.promptTaskId();
        Task task = findTaskById(taskId);
        if (task != null) {
            task.markCompleted();
            view.showMessage("Task marked as completed.");
        } else {
            view.showMessage("Task not found.");
        }
    }
    
    public void showTaskList() {
        view.showTaskList(tasks);
    }
    
    private Task findTaskById(String taskId) {
        for (Task task : tasks) {
            if (task.getId().equals(taskId)) {
                return task;
            }
        }
        return null;
    }
}