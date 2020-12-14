package lesson6;

public abstract class Animal {

    protected final String SWIM_CAT = null;
    protected final int SWIM_DOG = 10;
    protected final int JUMP_CAT = 2;
    protected final double JUMP_DOG = 0.5;

    protected int run;
    protected int swim;
    protected int jump;

    public Animal(int run, int swim, int jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public int catRun() {
        return run;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "run=" + run +
                ", swim=" + swim +
                ", jump=" + jump +
                '}';
    }
}
