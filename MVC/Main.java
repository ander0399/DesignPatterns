
public class Main {
    public static void main(String[] args) {
        TaskView view = new TaskView(new TaskController(view));
        view.showTaskList(); // Mostrar la lista de tareas
        view.addTask(); // Agregar una nueva tarea
        view.completeTask(); // Marcar una tarea como completada
    }
}