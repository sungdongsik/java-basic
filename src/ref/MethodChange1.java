package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        changePrimitive(a);
        System.out.println("a = " + a);
    }

    public static void changePrimitive(int a){
        a  = 20;
    }
}
