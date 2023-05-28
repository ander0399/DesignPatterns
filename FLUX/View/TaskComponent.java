public class TaskComponent extends React.Component {
    // Otros métodos y variables del componente
    
    private void addTask(String taskName) {
        Action action = new Action("ADD_TASK", taskName);
        Dispatcher.getInstance().dispatch(action);
    }
    
    // Otros métodos y lógica del componente
}