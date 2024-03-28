public abstract class Animal{
    public abstract void makeSound();
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
interface SoundStrategy {
    void makeSound();
}
class AnimalSound implements SoundStrategy {
    private Animal animal;

    public AnimalSound(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void makeSound() {
        animal.makeSound();
    }
}

