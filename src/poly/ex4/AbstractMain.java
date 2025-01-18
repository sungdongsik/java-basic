package poly.ex4;


public class AbstractMain {
    public static void main(String[] args) {

        //AbstractAnimal animal = new AbstractAnimal() // 에러
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        cat.sound();
        cat.move();

        extracted(cat);
        extractedMove(cat);

    }

    private static void extracted(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void extractedMove(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
