package lesson1;

public class main {
    public static void main(String[] args) {
        variableTest();
    }


    private static void variableTest() {
        int a = 5;
        double b = 25.0;
        long c = 50L;
        byte d = 100;

        int result = (int) (a * (b + (c / d)));
        System.out.println(result);
    }
    }
