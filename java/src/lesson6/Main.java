package lesson6;

import static lesson6.Runner.RUN_CAT;
import static lesson6.Runner.in;


public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat(120,0,2);
        Cat cat2 = new Cat(220, 0, 1);
        Cat cat3 = new Cat(100, 0, 2);

        Animal [] animalArray = {cat1, cat2, cat3};

        for (Animal animal : animalArray) {

        }

        }

        public static boolean checkRunAnimal(){
            int runAnimal;
            System.out.println("Введите расстояние, которая пробежела кошка от 0 до 200м");
            runAnimal = in.nextInt();
            if(runAnimal > RUN_CAT){
                return false;
            }
            return true;
        }
}

