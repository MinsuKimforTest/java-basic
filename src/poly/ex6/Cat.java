package poly.ex6;

public class Cat extends AbstractAnimal{
    @Override
    public void sound() {
        System.out.println("야용");
    }

    @Override
    public void move() {
        System.out.println("고양이가 이동합니다.");
    }
}
