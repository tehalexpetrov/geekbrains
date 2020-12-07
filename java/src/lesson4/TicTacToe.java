package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int SIZE = 3;
    static final char DOT_POINT = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = '0';

    static final char[][] map = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();

    static final char HEARD_FIRST_SYMBOL = '♥';
    static final String EMPTY = " ";

    static final String USER = "Человек";
    static final String AI = "Компьютер";

    public static void main(String[] args) {

        turnGame(); //метод запуска игры
    }

    private static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static void initMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_POINT;
            }
        }
    }

    private static void printHeaderMap() {
        System.out.print(HEARD_FIRST_SYMBOL + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printMapNumbers(i);
        }
        System.out.println();
    }

    private static void printMapNumbers(int i) {

        System.out.print(i + 1 + EMPTY);
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumbers(i);
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while(true) {

            humanTurn();
            printMap();
//        проверка на окончание игры после человека

//            aiTurn();
            printMap();
//         проверка на окончание игры после человек
        }
    }

    private static void humanTurn() {
        int columNumber;
        int rowNumber;

        System.out.println("Ходит " + USER);

        do {
            rowNumber = 0;
            columNumber = 0;

            System.out.print("Строка = ");
            if (in.hasNextInt()) {
                rowNumber = in.nextInt() - 1;
            } else {
                in.next();
                System.out.print("\nВведите число");
                continue;

            }

            System.out.print("Столбик = ");
            if (in.hasNextInt()) {
                columNumber = in.nextInt() - 1;
            } else {
                in.next();
                System.out.println("\nВведите число");
                continue;
            }

            map[rowNumber][columNumber] = DOT_HUMAN;

        } while(!isHumanValidTurn(rowNumber, columNumber));
    }

    private static boolean isHumanValidTurn(int rowNumber, int columNumber) {
        return isNumberValid(rowNumber, columNumber) && isCeillOcupancy(rowNumber, columNumber);
    }

    private static boolean isNumberValid(int rowNumber, int columNumber) {
        if (rowNumber > SIZE || rowNumber < 0 || columNumber > SIZE || columNumber < 0 ){
            System.out.println("\nПроверьте значение строки и столбца");
            return false;
        }
        return  true;
    }

    private static boolean isCeillOcupancy(int rowNumber, int columNumber) {
        if(map[rowNumber][columNumber] != DOT_POINT){
        System.out.println("\nВы выбрали занятую ячейку\n");
        return true;
    }
        return false;
    }

   /*private static void aiTurn() {
        int columNumber;
        int rowNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columNumber = random.nextInt(SIZE);

        } while (!isHumanValidTurn(rowNumber, columNumber, true));

        map[rowNumber][columNumber] = DOT_AI;
    }*/
}
