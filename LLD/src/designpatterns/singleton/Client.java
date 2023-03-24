package designpatterns.singleton;

public class Client {
    public static void main(String[] args) {
        // Below s1, s2, s3 would have same ref address
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
    }
}
