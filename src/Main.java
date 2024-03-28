//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("\n");

        Duck modelduck = new ModelDuck();
        modelduck.performFly(); //akan memanggil constructor modelduck(FlyNoWay())
        modelduck.setFlyBehavior(new FlyWithRocketPower());
        modelduck.performFly();
        System.out.println("\n\n");


        //Tugas
        Animal dog = new Dog();
        Animal cat = new Cat();
        SoundStrategy dogSound = new AnimalSound(dog);
        SoundStrategy catSound = new AnimalSound(cat);
        // Mainkan suara anjing
        dogSound.makeSound();
        // Ganti strategi dengan suara kucing
        dogSound = catSound;
        // Mainkan suara kucing
        dogSound.makeSound();
        System.out.println("\n\n");
    }
}
