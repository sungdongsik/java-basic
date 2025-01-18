package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Bird bird = new Bird();

        Chicken chicken = new Chicken();

        soundAnimal(bird);
        soundAnimal(chicken);
    }

    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 테스트 시작");
        animal.sound();
        System.out.println("동물 테스트 종료");
    }

    //fly 인터페이스가 있으면 사용 가능
    private static void flyAnimal(Fly fly){
        System.out.println("날개 테스트 시작");
        fly.fly();
        System.out.println("날개 테스트 종료");
    }
}
