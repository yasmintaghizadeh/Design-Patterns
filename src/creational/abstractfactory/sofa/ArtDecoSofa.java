package creational.abstractfactory.sofa;

public class ArtDecoSofa implements Sofa {
    @Override
    public void hasCushion() {
        System.out.println("Art deco 4 cushion");
    }

    @Override
    public void color() {
        System.out.println("ArtDEco color");
    }
}
