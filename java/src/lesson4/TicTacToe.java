package lesson4;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int SIZE = 5;
    static final char DOT_POINT = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = '0';

    static final char[][] map = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();
    static int turnCount;

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
        repeatGame();
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
        System.out.println("\n");
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
        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);
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
                System.out.print("Введите число");
                continue;

            }

            System.out.print("Столбик = ");
            if (in.hasNextInt()) {
                columNumber = in.nextInt() - 1;
            } else {
                in.next();
                System.out.println("Введите число");
                continue;
            }
        } while (!isHumanValid(rowNumber, columNumber));

        map[rowNumber][columNumber] = DOT_HUMAN;
    }

    private static boolean isHumanValid(int rowNumber, int columNumber) {
        return isNumberValid(rowNumber, columNumber) && isCeillOcupancy(rowNumber, columNumber, false);
    }

    private static boolean isNumberValid(int rowNumber, int columNumber) {
        if (rowNumber >= SIZE || rowNumber < 0 || columNumber >= SIZE || columNumber < 0) {
            System.out.println("Проверьте значение строки и столбца\n");
            return false;
        }
        return true;
    }

    private static boolean isCeillOcupancy(int rowNumber, int columNumber, boolean isAi) {
        if (map[rowNumber][columNumber] != DOT_POINT) {
            if (!isAi) {
                System.out.println("\nВы выбрали занятую ячейку");
            }
            return false;
        }
        return true;
    }

    private static void checkEnd(char symbol) {
        boolean isEnd = false;

        checkWin(symbol);
        if(checkWin(symbol)){
            isEnd = true;
            String winMessage;

            if(symbol == DOT_HUMAN){
                winMessage = "Ура! Победитель: " + USER ;
            } else {
                winMessage = "Победитель: " + AI;
            }
            System.out.println(winMessage);
        }


        if (isMapFull()){
            System.out.println("Ничья");
            isEnd = true;
        }

        if (isEnd){
            repeatGame();
        }
    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][0] == symbol && map[i][1] == symbol && map[i][2] == symbol && map[i][3] == symbol && map[i][4] == symbol) {
                return true;
            }
            for (int j = 0; j < SIZE; j++) {
                if (map[0][j] == symbol && map[1][j] == symbol && map[2][j] == symbol && map[i][3] == symbol && map[i][4] == symbol) {
                    return true;
                }
            }
        }

        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol && map[3][3] == symbol && map[4][4] == symbol) {
            return true;
        }
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol && map[0][3] == symbol && map[2][2] == symbol && map[3][0] == symbol) {
            return true;
        }

        return false;
    }



    private static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_POINT) {
                        return false;
                    }
                }
            }
            return true;
        }


    private static void aiTurn() {
        int columNumber;
        int rowNumber;

        System.out.println("Ходит " + AI + "\n");
        do {
            rowNumber = random.nextInt(SIZE);
            columNumber = random.nextInt(SIZE);

        } while (!isCeillOcupancy(rowNumber, columNumber, true));

        map[rowNumber][columNumber] = DOT_AI;
    }

    private static void repeatGame() {
        System.out.println("Хотите сыграть еще раз?. Введите 1 или 0");

        switch (in.nextInt()){
            case 1:
                turnGame();
            case 0:
                System.exit(0);
        }
    }
}//