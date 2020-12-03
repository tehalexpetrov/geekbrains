package lesson3;

import java.util.Scanner;

public class gameOne {

    static Scanner in = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        while (true) {
            System.out.println("Программа загадала число от 1 до 10");
            System.out.println("Попробуйте угадать число. У Вас 3 попытки");

            int multiple = (int) Math.round(Math.random() * 9);
            System.out.println(multiple);

            System.out.println("Введите число от 1 до 10: ");


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
                    continue;
                case  0 :
                    doExit();
                default:
                    System.out.println("Попробуйте еще раз");
            }

        }
    }


    private static void doExit() {
        System.exit(0);
    }
}







