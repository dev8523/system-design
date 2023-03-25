package designpatterns.singleton;

public class Client {
    public static void main(String[] args) {
        // Below s1, s2, s3 would have same ref address
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println("s1 address: " + s1);
        System.out.println("s2 address: " + s2);
        System.out.println("s3 address: " + s3);

        System.out.println("-----------------------------");

        // Below sm1, sm2, sm3 would have same ref address
        SingletonInMultiThreading sm1 = SingletonInMultiThreading.getInstance();
        SingletonInMultiThreading sm2 = SingletonInMultiThreading.getInstance();
        SingletonInMultiThreading sm3 = SingletonInMultiThreading.getInstance();
        System.out.println("sm1 address: " + sm1);
        System.out.println("sm2 address: " + sm2);
        System.out.println("sm3 address: " + sm3);
    }
}
