package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a){
        this(a, 0); // 기본 생성자 생략 가능 자바가 자동으로 만들어줌
        System.out.println("ClassB a: " + a);
    }

    public ClassB(int a, int b){
        super();
        System.out.println("ClassB a: " + a + ", B:" + b);
    }
}
