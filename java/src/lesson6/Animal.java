package lesson6;

public abstract class Animal {

    protected String name;
    protected int run;
    protected int swim;
    protected int jump;

    public Animal(String name, int run, int swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public int runAnimal() {
        return run;
    }

    public int getSwim(){
        return swim;
    }

    public int getJump(){
        return jump;
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
