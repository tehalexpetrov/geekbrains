package lesson6;

public class Cat extends Animal implements Action {

    public Cat(String name, int run, int swim, int jump) {
        super(name, run, swim, jump);
    }

    public void printCatArray(){
        System.out.println(this.name);
    }

    @Override
    public String toString() {
        return "Cat(" + name +
                "run=" + run +
                ')';
    }

    @Override
    public void run() {

    }
}
