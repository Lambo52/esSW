package Observer;

import java.util.ArrayList;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}
