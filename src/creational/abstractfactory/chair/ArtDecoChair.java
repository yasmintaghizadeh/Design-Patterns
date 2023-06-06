package creational.abstractfactory.chair;

import creational.abstractfactory.chair.Chair;

public class ArtDecoChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("ArtDeco Chair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("artDeco Sitting on");
    }
}
