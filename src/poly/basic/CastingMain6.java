package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2  = new Child();
        call(parent2);

    }

    private static void call(Parent parent){
        parent.parentMethod();

        // child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child){
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }else {
            System.out.println("child 인스턴스가 아님");
        }
    }
}
