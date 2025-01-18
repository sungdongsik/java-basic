package poly.diamond;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void moethodA() {
        System.out.println("A");
    }

    @Override
    public void moethodB() {
        System.out.println("B");
    }

    @Override
    public void methjodCommon() {
        System.out.println("child.Common");
    }
}
