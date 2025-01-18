package poly.ex2;

public class AnimalMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();
        Duck duck = new Duck();

        Animal[] animalsArr = {dog, cat, caw, duck};
        // 변하지 않는 부분
        for (Animal animal : animalsArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
