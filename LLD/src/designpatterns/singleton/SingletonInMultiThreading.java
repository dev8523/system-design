package designpatterns.singleton;

public class SingletonInMultiThreading {
    private static SingletonInMultiThreading instance = null;

    private SingletonInMultiThreading() {
    }

    public static SingletonInMultiThreading getInstance() {
        if (instance == null) {
            synchronized (SingletonInMultiThreading.class) {
                if (instance == null) {
                    instance = new SingletonInMultiThreading();
                }
            }
        }
        return instance;
    }
}
