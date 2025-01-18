package poly.ex2;

public class AnimalMain3 {

    public static void main(String[] args) {

        Animal[] animalsArr = {new Dog(), new Cat(), new Caw(), new Pig()};

        // 변하지 않는 부분
        for (Animal animal : animalsArr) {
            extracted(animal);
        }
    }

    private static void extracted(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
