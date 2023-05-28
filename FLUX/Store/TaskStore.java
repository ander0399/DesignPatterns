public class TaskStore {
    private List<Task> tasks = new ArrayList<>();
    private static final TaskStore instance = new TaskStore();
    
    private TaskStore() {
    }
    
    public static TaskStore getInstance() {
        return instance;
    }
    
    public void handleAction(Action action) {
        switch (action.getType()) {
            case ADD_TASK:
                String taskName = (String) action.getData();
                Task task = new Task(taskName);
                tasks.add(task);
                // Realizar cualquier otra lógica necesaria
                break;
            // Manejar otras acciones según sea necesario
        }
    }
    
    // Otros métodos para obtener y manipular los datos del Store
}