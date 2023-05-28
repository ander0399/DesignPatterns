public class Dispatcher {
    private static final Dispatcher instance = new Dispatcher();
    private final List<Store> stores = new ArrayList<>();
    
    private Dispatcher() {
    }
    
    public static Dispatcher getInstance() {
        return instance;
    }
    
    public void registerStore(Store store) {
        stores.add(store);
    }
    
    public void dispatch(Action action) {
        for (Store store : stores) {
            store.handleAction(action);
        }
    }
}