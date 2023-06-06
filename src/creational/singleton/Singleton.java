package creational.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }
    public void doSomething(){
        System.out.println( "something");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {// syncing the singleton for thread safety
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
