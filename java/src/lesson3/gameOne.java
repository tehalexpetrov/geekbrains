package lesson3;

import java.util.Scanner;

public class gameOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа загадала число от 1 до 10");
        System.out.println("Попробуйте угадать число. У Вас 3 попытки");

        int multiple = (int) Math.ceil(Math.random() * 10);
        System.out.println(multiple);

        System.out.println("Введите число от 1 до 10: ");


        int maxCount = 3;
        int count = 0;

        for (int i =0; i <= maxCount; i++){
            int userAnswer = scanner.nextInt();

               if (userAnswer == multiple){
                   System.out.println("Поздравляю! Вы угадали число.");
                   break;

               } else if (userAnswer < multiple){
                   System.out.println("Число меньше ответа");

               } else if (userAnswer > multiple){
                   System.out.println("Число больше ответа");
               } else {

               }
        }
    }
}






