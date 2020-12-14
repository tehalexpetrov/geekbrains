package lesson6;

import static lesson6.Runner.RUN_CAT;


public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat(400, 0, 200);
        Cat cat2 = new Cat(500, 0, 200);
        Cat cat3 = new Cat(600, 0, 200);

        Animal[] catArray = {cat1, cat2, cat3};

        for (Animal animal : catArray) {
           if (animal.catRun() > RUN_CAT) {
            System.out.println(catArray[0] + " --> Масимальная длина " + (RUN_CAT));
            }
        }
    }
}

