package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        singleton.doSomething();


        Instance instance=Instance.INSTANCE;
        instance.doSomething();

    }
}
