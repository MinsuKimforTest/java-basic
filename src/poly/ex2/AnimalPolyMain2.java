package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Animal[] animalsArr = {dog, cat, cow};
        for (Animal animal : animalsArr) {
            sountAnimal(animal);
        }
    }

    private static void sountAnimal(Animal animal) {
        animal.sound();
    }
}
