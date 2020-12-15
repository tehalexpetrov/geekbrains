package lesson6;

import static lesson6.Action.*;


public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мартин", 150, 0, 1);
        Cat cat2 = new Cat("Снежок", 500, 5, 5);
        Cat cat3 = new Cat("Барсик", 100, 2, 2);

        Dog dog1 = new Dog("Шарик", 800, 11, 1);
        Dog dog2 = new Dog("Бобик", 100, 5, 2);
        Dog dog3 = new Dog("Тузик", 499, 10, 9);

        Animal[] catArray = {cat1, cat2, cat3};

        /* Перебираем массив и получаем результат бега котов */

        for (Animal animal : catArray) {
            if (animal.getRun() > RUN_CAT) {
                System.out.print(animal.printAnimal() + " пробежал " + animal.getRun() + " метров " + " --> Масимальная длина " + (RUN_CAT) + " метров " + " --> ");
                System.out.println(false);
            } else {
                System.out.print(animal.printAnimal() + " пробежал " + animal.getRun() + " метров " + " -->  ");
                System.out.println(true);
            }
        }

        System.out.println("\n***********Заплыв котов**************\n");

        /* Получаем результат заплыва котов */

        for (Animal animal : catArray) {
            if (animal.getSwim() > SWIM_CAT) {
                System.out.print(animal.printAnimal() + " проплыл " + animal.getSwim() + " метров " + " Супер кот -->  ");
                System.out.println(true);
            } else {
                System.out.print(animal.printAnimal() + " проплыл " + animal.getSwim() + " метров " + " Конечно. Котики не любят воду " + " --> ");
                System.out.println(false);
            }
        }

        /* Проверим как прыгают котики */

        System.out.println("\n*********** Прыжки котов **************\n");

        for (Animal animal : catArray) {
            if (animal.getJump() > JUMP_CAT) {
                System.out.print(animal.printAnimal() + " прыгнул на " + animal.getJump() + " метра(ов) " + " Сверх кот -->  ");
                System.out.println(false);
            } else {
                System.out.print(animal.printAnimal() + " прыгнул на " + animal.getJump() + " метра(ов) " + " Супер кот -->  ");
                System.out.println(true);
            }
        }
        /* Массив собачек */

        Animal[] dogArray = {dog1, dog2, dog3};

        /* Посмотрим на собачек может они лучше котиков. Смотрим как они бегают */

        System.out.println("\n*********** Бег собак **************\n");

        for (Animal animal : dogArray) {
            animalRunDog(animal, " пробежал ");
        }

        /* Заплыв собак */
        System.out.println("\n*********** Заплыв собак **************\n");

        for (Animal animal : dogArray) {
            animalSwimDog(animal, " проплыл ");
        }

        System.out.println("\n*********** Прыжки собак **************\n");

        for (Animal animal : dogArray) {
            animalJumpDog(animal, " прыгнул ");
        }

    }

    private static void animalRunDog(Animal animal, String s) {
        if (animal.getRun() > RUN_DOG) {
            System.out.print(animal.printAnimal() + s + animal.getRun() + " метров " + "Это очень много " + " --> ");
            System.out.println(false);
        } else if (animal.getRun() < RUN_DOG - 200) {
            System.out.print(animal.printAnimal() + " пробежал " + animal.getRun() + " метров " + " Можно лучше --> ");
            System.out.println(true);
        } else {
            System.out.print(animal.printAnimal() + " пробежал " + animal.getRun() + " метров " + " Молодец --> ");
            System.out.println(true);
        }
    }

    private static void animalSwimDog(Animal animal, String s) {
        if (animal.getSwim() > SWIM_DOG) {
            System.out.print(animal.printAnimal() + s + animal.getSwim() + " метров " + "Это очень много " + " --> ");
            System.out.println(false);
        } else if (animal.getSwim() < SWIM_DOG - 4) {
            System.out.print(animal.printAnimal() + " проплыл " + animal.getSwim() + " метров " + " Можно лучше --> ");
            System.out.println(true);
        } else {
            System.out.print(animal.printAnimal() + " проплыл " + animal.getSwim() + " метров " + " Молодец --> ");
            System.out.println(true);
        }
    }
    private static void animalJumpDog(Animal animal, String s) {
        if (animal.getJump() > JUMP_DOG) {
            System.out.print(animal.printAnimal() + s + animal.getJump() + " метров " + "Это очень много " + " --> ");
            System.out.println(false);
        } else if (animal.getJump() < JUMP_DOG) {
            System.out.print(animal.printAnimal() + " прыгнул " + animal.getJump() + " метров " + " Можно лучше --> ");
            System.out.println(true);
        } else {
            System.out.print(animal.printAnimal() + " прыгнул " + animal.getJump() + " метров " + " Молодец --> ");
            System.out.println(true);
        }
    }
}

