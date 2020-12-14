package lesson6;

import java.util.Arrays;

import static lesson6.Runner.RUN_CAT;


public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat(150, 0, 200);
        Cat cat2 = new Cat(500, 0, 200);
        Cat cat3 = new Cat(5, 0, 200);

        Animal[] catArray = {cat1, cat2, cat3};

        for (Animal animal : catArray) {
           if (animal.catRun() > RUN_CAT) {
               cat1.printCatArray();
               cat2.printCatArray();
            System.out.print(animal.catRun() +  " --> Масимальная длина (метров) " + (RUN_CAT) + " --> ");
               System.out.println(false);
            } else {
               System.out.print(animal.catRun() + " -->  ");
               System.out.println(true);
           }
        }
    }
}

