package poly.ex1;

public class AnimalSOundMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        // Caw[] cawArr = {dog, caw, cat}; 타입 달라 에러


        dog.sound();

        soundCat(cat);
        sound(caw);

    }

    private static void sound(Caw caw){
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void soundCat(Cat cat){
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
