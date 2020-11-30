package lesson1;

public class main {
    public static void main(String[] args) {
        variableTest(); //Задание 2

        int a = 8;
        int b = 9;
        int result = twoNumbers(a, b);
        System.out.println(result);

        boolean resultNumberBoolean = twoNumbersCheck(result);
        System.out.println(resultNumberBoolean);
    }


    private static void variableTest() {
        int a = 5;
        double b = 25.0;
        long c = 50L;
        byte d = 100;

        int result = (int) (a * (b + (c / d)));
        System.out.println(result);

    }

    private static boolean twoNumbersCheck(int result) {
        return (result >=10 && result <=20);
    }

    private static int twoNumbers(int a , int b) {
        return a + b;

    }
    }
