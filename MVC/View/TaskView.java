import java.util.List;
import java.util.Scanner;

public class TaskView {
    private TaskController controller;
    
    public TaskView(TaskController controller) {
        this.controller = controller;
    }
    
    public void showTaskList(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println(task.getTitle() + " - " + task.getDescription() + " - Due: " + task.getDueDate());
        }
    }
    
    public String promptTaskDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dueDate = scanner.nextLine();
        return title + "," + description + "," + dueDate;
    }
    
    public String promptTaskId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task ID: ");
        return scanner.nextLine();
    }
    
    public void showMessage(String message) {
        System.out.println(message);
    }
}