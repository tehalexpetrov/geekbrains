package lesson1;

public class main {
    public static void main(String[] args) {
        //Проверка задания 2
        variableTest();

// Задание 4. На вход два числа и проверка результата
        int a = 8;
        int b = 9;
        int result = twoNumbers(a, b);
        System.out.println(result);

        boolean resultNumberBoolean = twoNumbersCheck(result);
        System.out.println(resultNumberBoolean);

// Задание 5
        int number = 0;
        int resultNumber = checkNumberResult(number);
        System.out.println(resultNumber);

// Задание 6
        int anyNumber = -5;
        boolean resultAnyNumber = checkAnyNumber(number);
        System.out.println(resultAnyNumber);

// Задание 7
        checkNameString();

// Задание 8
        int year = 2020;
        int leapYear = checkYear(year);
    }


// Задаиние 2 и Задание 3. Примитивные типы и их вычисление

    private static void variableTest() {
        int a = 5;
        double b = 25.0;
        long c = 50L;
        byte d = 100;

        int result = (int) (a * (b + (c / d)));
        System.out.println(result);
    }
// Проверка задания 4

    private static int twoNumbers(int a , int b) {
        return a + b;

    }
    private static boolean twoNumbersCheck(int result) {
        return (result >=10 && result <=20);
    }

// Проверка задания 5

    private static int checkNumberResult(int number) {
        if (number >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        return number;
    }
// Проверка задания 6

    private static boolean checkAnyNumber(int number) {
        return (number < 0);
    }
// Задание 7

    private static void checkNameString(){
        String name = "Alexander";
        System.out.println("Hi, " + name + "!");
    }

    // Проверка задания 8
    private static int checkYear(int year) {
        if(year % 4==0 && year % 100 !=0 || year % 400 == 0) {
            System.out.println(year + " Год высокосный");
        } else {
            System.out.println(year + " Обычный год");
        }
        return year;
    }
}
