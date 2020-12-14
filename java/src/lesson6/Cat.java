package lesson6;

public class Cat extends Animal {

    public Cat(int run, int swim, int jump) {
        super(run, swim, jump);
    }

    public void printCatArray(){
        System.out.println(this);
    }
}
