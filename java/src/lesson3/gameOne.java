package lesson3;

import java.util.Scanner;

public class gameOne {

     static Scanner in = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    final static  int NUM1 = 0;
    final static  int NUM2 = 9;

    public static void main(String[] args) {


        while (true) {
            System.out.println("Программа загадала число от 1 до 10");
            System.out.println("Попробуйте угадать число. У Вас 3 попытки");

            int multiple = NUM1 + (int) Math.round(Math.random() * NUM2);

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

                userAnswer = checkUserAnswer(scanner);
            }

            System.out.println("Хотите сыграть еще раз?. Нажмите 1 - да или 0 - нет");

            int inputUser = scanner.nextInt();
            checkUserInput(inputUser);
        }
    }



    private static int checkUserAnswer(Scanner scanner) {
        int inputUserAnswer = NUM2 +1;
        do{

            int value = scanner.nextInt();
            if(value < NUM1 || value > NUM2){
                System.out.println("Но но! Введите числа от " + NUM1 + " до " + NUM2);
                continue;
            } else {
                System.out.println("Вы ввели не число");
                continue;
            }
        } while (inputUserAnswer == NUM2 +1);
        return inputUserAnswer;
    }

    private static void checkUserInput(int inputUser) {
        do{
            if (inputUser == 1) {
                continue;
            } else if (inputUser == 0) {
                doExit();
            } else {
                System.out.println("Введите числа 1 или 0");
                continue;
            }
        } while (inputUser == scanner.nextInt());
    }

    private static void doExit() {
        System.exit(0);
    }
}







