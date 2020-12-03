package lesson3;

import java.util.Scanner;

public class gameOne {

    static Scanner in = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        while (true) {
            System.out.println("Программа загадала число от 0 до 9");
            System.out.println("Попробуйте угадать число. У Вас 3 попытки");

            int num1 = 0;
            int num2 = 9;

            int multiple = num1 + (int) Math.round(Math.random() * num2);
            System.out.println(multiple);

            System.out.println("Введите число от 0 до 9: ");


        int maxCount = 3;
        int count = 0;

        for (int i = 0; i < maxCount; i++) {
            count++;

            int userAnswer = scanner.nextInt();

            if (userAnswer == multiple) {
                System.out.println("Поздравляю! Вы угадали число.");
                break;
            } else if (count >= maxCount) {
                System.out.println("К сожалению, Вы проиграли. Правильный ответ: " + multiple + "\n");
            } else if (userAnswer < multiple) {
                System.out.println("Число меньше ответа");
            } else if (userAnswer > multiple) {
                System.out.println("Число больше ответа");
            }
            System.out.println("У Вас осталось " + (maxCount - count) + " попыток");
        }
            System.out.println("Хотите сыграть еще раз?. Нажмите 1 - да или 0 - нет");

            switch (in.nextInt()){
                case 1 :
                    break;
                case  0 :
                    doExit();
                default:
                    System.out.println("ведите 1 или 0");
           }

        }
    }

    private static void doExit() {
        System.exit(0);
    }
}






