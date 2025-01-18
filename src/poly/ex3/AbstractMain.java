package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {

        //AbstractAnimal animal = new AbstractAnimal() // 에러
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        cat.sound();
        cat.move();

        extracted(cat);


    }

    private static void extracted(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
