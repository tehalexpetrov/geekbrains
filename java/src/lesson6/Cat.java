package lesson6;

public class Cat extends Animal implements Action {

    public Cat(String name, int run, int swim, int jump, int stop_run, int stop_swim, int stop_jump) {
        super(name, run, swim, jump, stop_run, stop_swim, stop_jump);
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
