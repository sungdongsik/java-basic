package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("퍼블릭 호출: " + publicField);
    }

    public void defaultFieldMethod(){
        System.out.println("퍼블릭 호출: " + defaultField);
    }

    public void privateFieldMethod(){
        System.out.println("퍼블릭 호출: " + privateField);
    }

    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 100;
        privateField = 100;
        publicMethod();
        defaultFieldMethod();
        privateFieldMethod();
    }
}
