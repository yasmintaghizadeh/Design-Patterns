package creational.abstractfactory.chair;

import creational.abstractfactory.chair.Chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Modern Chair");
    }

    @Override
    public void sitOn() {
        System.out.println("Modern siting");
    }
}
