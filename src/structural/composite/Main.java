package structural.composite;

public class Main {
    public static void main(String[] args) {
        Component hdd=new Leaf("hdd",50000L);
        Component ram=new Leaf("ram",12000L);
        Component cpu=new Leaf("cpu",25000L);
        Component mouse=new Leaf("mouse",250000L);
        Component monitor=new Leaf("monitor",200000L);

        Composite computer=new Composite("computer");
        Composite motherBoard=new Composite("mb");
        Composite cabinet=new Composite("cabinet");
        Composite ph=new Composite("peri");

        computer.addComponent(cabinet);
        computer.addComponent(ph);
        cabinet.addComponent(motherBoard);
        motherBoard.addComponent(hdd);
        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);
        ph.addComponent(mouse);
        ph.addComponent(monitor);
        motherBoard.showPrice();

    }
}
