package lesson6;

public abstract class Animal {

    protected String name;
    protected int run;
    protected int swim;
    protected int jump;
    protected int stop_run;
    protected int stop_swim;
    protected int stop_jump;

    public Animal(String name, int run, int swim, int jump, int stop_run, int stop_swim, int stop_jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
        this.stop_run = stop_run;
        this.stop_swim = stop_swim;
        this.stop_jump = stop_jump;
    }

    public int getRun() {
        return run;
    }

    public int getSwim(){
        return swim;
    }

    public int getJump(){ return jump; }

    public int getStop_run() {
        return stop_run;
    }

    public int getStop_swim() {
        return stop_swim;
    }

    public int getStop_jump() {
        return stop_jump;
    }

    public String printAnimal(){
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name +
                "run=" + run +
                ", swim=" + swim +
                ", jump=" + jump +
                '}';
    }
}
