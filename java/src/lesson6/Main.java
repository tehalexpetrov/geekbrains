package lesson6;

import static lesson6.Runner.RUN_CAT;


public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мартин",150, 0, 200);
        Cat cat2 = new Cat("Снежок",500, 5, 200);
        Cat cat3 = new Cat("Барсик",100, 2, 200);

        Animal[] catArray = {cat1, cat2, cat3};

        /* Перебираем массив и получаем результат бега котов */

        for (Animal animal : catArray) {
           if (animal.catRun() > RUN_CAT) {
            System.out.print(animal.printCat() + "  " + animal.catRun() + " метров " + " --> Масимальная длина " + (RUN_CAT) + " метров " + " --> ");
               System.out.println(false);
            } else {
               System.out.print(animal.printCat() + "  " + animal.catRun() + " метров " + " -->  ");
               System.out.println(true);
           }
        }

        /* Посмотрим как коты плавают */


    }
}

