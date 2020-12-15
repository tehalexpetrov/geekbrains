package lesson6;

import static lesson6.Action.*;


public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мартин", 150, 0, 1, 200, 0,2);
        Cat cat2 = new Cat("Снежок", 500, 5, 5, 400, 0,2);
        Cat cat3 = new Cat("Барсик", 100, 2, 2, 600, 0,2);

        Dog dog1 = new Dog("Шарик", 800, 11, 1, 500, 10,10);
        Dog dog2 = new Dog("Бобик", 100, 5, 2, 800, 10,8);
        Dog dog3 = new Dog("Тузик", 499, 10, 9, 1000, 10,5);

        Animal[] catArray = {cat1, cat2, cat3};

        /* Перебираем массив и получаем результат бега котов */
        System.out.println("\n*********** Забег котов **************\n");

        for (Animal animal : catArray) {
            animalRun(animal, " пробежал ");
        }

        System.out.println("\n***********Заплыв котов**************\n");

        /* Получаем результат заплыва котов */

        for (Animal animal : catArray) {
            animalSwim(animal, " проплыл ");
        }

        /* Проверим как прыгают котики */

        System.out.println("\n*********** Прыжки котов **************\n");

        for (Animal animal : catArray) {
            animalJump(animal, " прыгнул ");
        }
        /* Массив собачек */

        Animal[] dogArray = {dog1, dog2, dog3};

        /* Посмотрим на собачек может они лучше котиков. Смотрим как они бегают */

        System.out.println("\n*********** Бег собак **************\n");

        for (Animal animal : dogArray) {
            animalRun(animal, " пробежал ");
        }

        /* Заплыв собак */
        System.out.println("\n*********** Заплыв собак **************\n");

        for (Animal animal : dogArray) {
            animalSwim(animal, " проплыл ");
        }

        System.out.println("\n*********** Прыжки собак **************\n");

        for (Animal animal : dogArray) {
            animalJump(animal, " прыгнул ");
        }

    }

    private static void animalRun(Animal animal, String s) {
        if (animal.getRun() > animal.getStop_run()) {
            System.out.print(animal.printAnimal() + s + animal.getRun() + " метров " + "Это очень много " + " --> ");
            System.out.println(false);
        } else if (animal.getRun() < animal.getStop_run()) {
            System.out.print(animal.printAnimal() + " пробежал " + animal.getRun() + " метров " + " Можно лучше --> ");
            System.out.println(true);
        } else {
            System.out.print(animal.printAnimal() + " пробежал " + animal.getRun() + " метров " + " Молодец --> ");
            System.out.println(true);
        }
    }

    private static void animalSwim(Animal animal, String s) {
        if (animal.getSwim() > animal.getStop_swim()) {
            System.out.print(animal.printAnimal() + s + animal.getSwim() + " метров " + "Это очень много " + " --> ");
            System.out.println(false);
        } else if (animal.getSwim() < animal.getStop_swim()) {
            System.out.print(animal.printAnimal() + " проплыл " + animal.getSwim() + " метров " + " Можно лучше --> ");
            System.out.println(true);
        } else {
            System.out.print(animal.printAnimal() + " проплыл " + animal.getSwim() + " метров " + " Молодец --> ");
            System.out.println(true);
        }
    }
    private static void animalJump(Animal animal, String s) {
        if (animal.getJump() > animal.getStop_jump()) {
            System.out.print(animal.printAnimal() + s + animal.getJump() + " метров " + "Это очень много " + " --> ");
            System.out.println(false);
        } else if (animal.getJump() < animal.getStop_jump()) {
            System.out.print(animal.printAnimal() + " прыгнул " + animal.getJump() + " метров " + " Можно лучше --> ");
            System.out.println(true);
        } else {
            System.out.print(animal.printAnimal() + " прыгнул " + animal.getJump() + " метров " + " Молодец --> ");
            System.out.println(true);
        }
    }
}

