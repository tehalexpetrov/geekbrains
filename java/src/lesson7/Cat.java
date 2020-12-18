package lesson7;

import java.util.Random;

public class Cat {

    private String name;
    private Random random = new Random();

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(random.nextInt(4) + 3);
    }
}
