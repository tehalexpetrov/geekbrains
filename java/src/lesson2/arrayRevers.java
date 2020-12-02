package lesson2;

import java.util.Arrays;

public class arrayRevers {
    public static void main(String[] args) {
       /*Если n = 0. То никаких изменений в массиве не происходит*/

        int n = 1;

        int[] arrayRevers = new int[5];

        arrayRevers[0] = 1;
        arrayRevers[1] = 2;
        arrayRevers[2] = 3;
        arrayRevers[3] = 4;
        arrayRevers[4] = 5;

        System.out.println("Массив до изменений " + Arrays.toString(arrayRevers));


        if (n > 0) {
            for (int j = 0; j < n; j++) {
                int arr = arrayRevers[arrayRevers.length - 1];
                if (arrayRevers.length - 1 >= 0)
                    System.arraycopy(arrayRevers, 0, arrayRevers, 1, arrayRevers.length - 1);
                arrayRevers[0] = arr;

                                for (int i : arrayRevers) System.out.print(i + " ");
                System.out.println();
            }
        }

        if (n < 0) {
            for (int j = 0; j > n; j--) {
                int arr = arrayRevers[0];

                System.arraycopy(arrayRevers, 1, arrayRevers, 0, arrayRevers.length - 1);
                arrayRevers[arrayRevers.length - 1] = arr;

                for (int i : arrayRevers) {
                    System.out.print(i + " ");
                }
                System.out.print("\r\n");

            }
        }
    }
}
