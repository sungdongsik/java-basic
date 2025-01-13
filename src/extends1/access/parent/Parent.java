package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected  int pretectedValue;
    int defalutValue;
    private int privateValue;

    public void publicMethod(){
        System.out.println("publicMethod");
    }

    public void protectedMethod(){
        System.out.println("protectedMethod");
    }

    void defalutMethod(){
        System.out.println("defalutMethod");
    }

    private void privateMethod(){
        System.out.println("privateMethod");
    }

    public void prinntParent(){
        System.out.println("===메서드 안");
        System.out.println("p" + publicValue);
        System.out.println("p" + pretectedValue);
        System.out.println("p" + defalutValue);
        System.out.println("p" + privateValue);

        defalutMethod();
        privateMethod();
    }
}
