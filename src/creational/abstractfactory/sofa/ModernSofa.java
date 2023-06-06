package creational.abstractfactory.sofa;

public class ModernSofa implements Sofa {
    @Override
    public void hasCushion() {
        System.out.println("4 Modern Cushions");
    }

    @Override
    public void color() {
        System.out.println("Modern sofa Color");
    }
}
