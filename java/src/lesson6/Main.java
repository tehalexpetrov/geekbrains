package lesson6;

import static lesson6.Action.*;


public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мартин", 150, 1, 1, 200, 2,2);
        Cat cat2 = new Cat("Снежок", 500, 5, 5, 400, 4,2);
        Cat cat3 = new Cat("Барсик", 100, 2, 2, 600, 6,2);

        Dog dog1 = new Dog("Шарик", 800, 11, 1, 500, 10,10);
        Dog dog2 = new Dog("Бобик", 100, 5, 2, 800, 10,8);
        Dog dog3 = new Dog("Тузик", 499, 10, 9, 1000, 10,5);

        Animal[] catArray = {cat1, cat2, cat3};

        /* Перебираем массив и получаем результат бега котов */
        System.out.println("\n*********** Забег котов **************\n");

        for (Animal animal : catArray) {
            Animal.animalRun(animal, " пробежал ");
        }

        System.out.println("\n***********Заплыв котов**************\n");

        /* Получаем результат заплыва котов */

        for (Animal animal : catArray) {
            Animal.animalSwim(animal, " проплыл ");
        }

        /* Проверим как прыгают котики */

        System.out.println("\n*********** Прыжки котов **************\n");

        for (Animal animal : catArray) {
            Animal.animalJump(animal, " прыгнул ");
        }
        /* Массив собачек */

        Animal[] dogArray = {dog1, dog2, dog3};

        /* Посмотрим на собачек может они лучше котиков. Смотрим как они бегают */

        System.out.println("\n*********** Бег собак **************\n");

        for (Animal animal : dogArray) {
            Animal.animalRun(animal, " пробежал ");
        }

        /* Заплыв собак */
        System.out.println("\n*********** Заплыв собак **************\n");

        for (Animal animal : dogArray) {
            Animal.animalSwim(animal, " проплыл ");
        }

        System.out.println("\n*********** Прыжки собак **************\n");

        for (Animal animal : dogArray) {
            Animal.animalJump(animal, " прыгнул ");
        }

    }
}

