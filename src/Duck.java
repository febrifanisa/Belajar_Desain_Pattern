interface QuackBehavior{
    void quack();
}
interface FlyBehavior{
    void fly();
}
class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Qwek - Qwek");
    }
}
class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Tidak Bisa Bersuara");
    }
}
class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Terbang");
    }
}
class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Tidak bisa Terbang");
    }
}
class FlyWithRocketPower implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Cool, terbang Menggunakan Rocket");
    }
}
abstract class Duck{
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    abstract void display();
    void swim(){
        System.out.println("Berenang");
    }
    void performQuack(){
        quackBehavior.quack();
    }
    void performFly(){
        flyBehavior.fly();
    }
    void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior  = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("Tampilan MallardDuck");
    }
}
class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("Tampilan ReadHeadDuck");
    }
}
class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    void display(){
        System.out.println("Tampilan RubberDuck");
    }
}
class WoddenDuck extends Duck{
    public WoddenDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    void display(){
        System.out.println("Tampilan WoodenDuck");
    }
}
class ModelDuck extends Duck{
    ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    void display() {
        System.out.println("Tampilan ModelDuck");
    }
}