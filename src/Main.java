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
    }
}