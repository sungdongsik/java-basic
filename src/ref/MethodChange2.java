package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("a = " + dataA.value);
        changePrimitive(dataA);
        System.out.println("a = " + dataA.value);

    }

    public static void changePrimitive(Data dataA){
        dataA.value  = 20;
    }
}
