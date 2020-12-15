package lesson6;

public interface Action {
    int RUN_CAT = 200;
    int RUN_DOG = 500;
    int SWIM_CAT = 0; //коте не может плыть
    int SWIM_DOG = 10;
    int JUMP_CAT = 2;
    double JUMP_DOG = 0.5;

    void run();
}