package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Tv tv=new Tv(true,20,22);
        Remote remote=new Remote(tv);
        remote.togglePower();
        remote.volumeDown();
        remote.volumeDown();
        remote.volumeDown();
        remote.volumeDown();
        remote.volumeDown();
        remote.volumeDown();
    }
}
