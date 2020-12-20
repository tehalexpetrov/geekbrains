package lesson7;

public class Test {
    public static void main(String[] args) {

        Cat[] cats = {new Cat("Мартин", 50), new Cat("Барсик", 50), new Cat("Снежок", 25), new Cat("Борис Николаевич", 5), new Cat("Коте", 1)};
        Plate plate = new Plate( 80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
