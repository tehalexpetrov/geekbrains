package lesson6;

public abstract class Animal {

    protected String name;
    protected int run;
    protected int swim;
    protected int jump;
    protected int stop_run; //ограничение на бег
    protected int stop_swim; //ограничение на заплыв
    protected int stop_jump; //ограничение на прыжки

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

    static void animalRun(Animal animal, String s) {
        if (animal.getRun() > animal.getStop_run()) {
            System.out.print(animal.printAnimal() + s + animal.getRun() + " метров " + "Это очень много " + " --> ");
            System.out.println(false);
        } else {
            System.out.print(animal.printAnimal() + " пробежал " + animal.getRun() + " метров " + " Молодец --> ");
            System.out.println(true);
        }
    }

    static void animalSwim(Animal animal, String s) {
        if (animal.getSwim() > animal.getStop_swim()) {
            System.out.print(animal.printAnimal() + s + animal.getSwim() + " метров " + "Это очень много " + " --> ");
            System.out.println(false);
        } else {
            System.out.print(animal.printAnimal() + " проплыл " + animal.getSwim() + " метров " + " Молодец --> ");
            System.out.println(true);
        }
    }
    static void animalJump(Animal animal, String s) {
        if (animal.getJump() > animal.getStop_jump()) {
            System.out.print(animal.printAnimal() + s + animal.getJump() + " метров " + "Это очень много " + " --> ");
            System.out.println(false);
        } else {
            System.out.print(animal.printAnimal() + " прыгнул " + animal.getJump() + " метров " + " Молодец --> ");
            System.out.println(true);
        }
    }
}
