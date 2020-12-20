package lesson7;

class Plate {

    public int food;
    public Plate(int food) {
        this.food = food;
    }


    boolean decreaseFood(int n) {
        int eatDiff = food - n;
        if (eatDiff < 0) {
            return false;
        }
        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("plate: " + food);
    }
}