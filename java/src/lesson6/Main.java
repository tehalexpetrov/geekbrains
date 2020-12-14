package lesson6;

import static lesson6.Runner.RUN_CAT;
import static lesson6.Runner.SWIM_CAT;


public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мартин",150, 0, 200);
        Cat cat2 = new Cat("Снежок",500, 5, 200);
        Cat cat3 = new Cat("Барсик",100, 2, 200);

        Animal[] catArray = {cat1, cat2, cat3};

        /* Перебираем массив и получаем результат бега котов */

        for (Animal animal : catArray) {
           if (animal.runAnimal() > RUN_CAT) {
            System.out.print(animal.printAnimal() + " пробежал " + animal.runAnimal() + " метров " + " --> Масимальная длина " + (RUN_CAT) + " метров " + " --> ");
               System.out.println(false);
            } else {
               System.out.print(animal.printAnimal() + " пробежал " + animal.runAnimal() + " метров " + " -->  ");
               System.out.println(true);
           }
        }

        System.out.println("\n***********Заплыв котов**************\n");

        /* Получаем результат заплыва котов */

        for (Animal animal : catArray) {
            if(animal.getSwim() > SWIM_CAT){
                System.out.print(animal.printAnimal() + " проплыл " + animal.getSwim() + " метров " + " Супер кот -->  ");
                System.out.println(true);
            } else {
                System.out.print(animal.printAnimal() + " проплыл " + animal.getSwim() + " метров " + " Конечно. Котики не любят воду " + " --> ");
                System.out.println(false);
            }
        }



    }
}

