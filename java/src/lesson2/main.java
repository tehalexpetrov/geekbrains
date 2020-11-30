package lesson2;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int[] points = new int[10];

        points[0] = 1;
        points[1] = 1;
        points[2] = 0;
        points[3] = 0;
        points[4] = 1;
        points[5] = 0;
        points[6] = 1;
        points[7] = 1;
        points[8] = 0;
        points[9] = 0;

        System.out.println("**************Задание 1*****************");
        System.out.println("Массив до преобразования \t" + Arrays.toString(points));
        for (int i = 0; i < points.length; i++) {
            if (points[i] == 1) {
                points[i] = 0;
            } else {
                points[i] = 1;
            }
        }

        System.out.println("Массив после преобразования " + Arrays.toString(points));

//        Задание 2
        int[] arrayOnThree = new int[8];

        for (int i = 0; i < arrayOnThree.length; i++) {
            if (arrayOnThree[i] >= 0) {
                arrayOnThree[i] = i * 3;
            }
        }
        System.out.println("\n**************Задание 2*****************");
        System.out.println("Задание 2. Результат: " + Arrays.toString(arrayOnThree));


//        Задание 3

        int[] arrayThree = new int[12];

        arrayThree[0] = 1;
        arrayThree[1] = 5;
        arrayThree[2] = 3;
        arrayThree[3] = 2;
        arrayThree[4] = 11;
        arrayThree[5] = 4;
        arrayThree[6] = 5;
        arrayThree[7] = 2;
        arrayThree[8] = 4;
        arrayThree[9] = 8;
        arrayThree[10] = 9;
        arrayThree[11] = 1;

        System.out.println("\n**************Задание 3*****************");
        System.out.println("Задание 3. До:\t\t " + Arrays.toString(arrayThree));

        for (int i = 0; i < arrayThree.length; i++) {
            if (arrayThree[i] < 6) {
                arrayThree[i] *= 2;
            }
        }
        System.out.println("Задание 3. Результат " + Arrays.toString(arrayThree));

//        Задание 4

        System.out.println("\n**************Задание 4*****************");


        int[][] arrayFor = new int[4][4];


        for (int i = 0; i < arrayFor.length; i++) {
            for (int j = 0, n = arrayFor[i].length; j < arrayFor[i].length; j++, n--) {
                if (i == j || i == n - 1) {
                    arrayFor[i][j] = 1;
                }
                System.out.printf("%2d", arrayFor[i][j]);
            }
            System.out.println();
        }

//        Задание 5

        int[] arrayFive = new int[6];

        arrayFive[0] = 44;
        arrayFive[1] = 18;
        arrayFive[2] = 7;
        arrayFive[3] = 21;
        arrayFive[4] = 50;
        arrayFive[5] = 5;

        System.out.println("\n**************Задание 5*****************");
        int max = 0;
        int min = 0;

        for (int i = 0; i < arrayFive.length; i++) {
            if (arrayFive[i] > max) {
                max = arrayFive[i];
            } else {
                min = arrayFive[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: \t" + min);

//        Задание 6

    }
}
