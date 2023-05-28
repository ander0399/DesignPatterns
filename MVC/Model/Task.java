public class Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean completed;
    
    // Constructor, getters y setters
    
    public void markCompleted() {
        completed = true;
    }
}