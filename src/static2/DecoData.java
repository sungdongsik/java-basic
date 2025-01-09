package static2;

public class DecoData {

    private int instanceValue;

    private static int staticValue;

    public static void staticCall(){
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall(){
        instanceValue++; // 인스터스 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

    }

    private void instanceMethod(){
        System.out.println("instanceMethod: " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue: " + staticValue);
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceCall();
    }
}
