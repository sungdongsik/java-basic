package poly.ex6;

public abstract class AbstractAnimal {
    public abstract void sound(); // 추상

    // 상속
    public void move(){
        System.out.println("동물이 이동합니다.");
    }
}
