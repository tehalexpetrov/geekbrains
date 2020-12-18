package lesson7;

public class Test {
    public static void main(String[] args) {

    Cat cat = new Cat("Мартин");
    Plate plate = new Plate();


    plate.addFood(10);
    cat.eat(plate);
    plate.printInfo();

    }
}
