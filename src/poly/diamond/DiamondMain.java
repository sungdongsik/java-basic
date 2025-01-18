package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.moethodA();
        a.methjodCommon();

        InterfaceB b = new Child();
        b.moethodB();
        b.methjodCommon();
    }
}
