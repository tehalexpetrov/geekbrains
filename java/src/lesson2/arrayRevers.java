package lesson2;

public class arrayRevers {
    public static void main(String[] args) {
        int n = 0;

        int[] arrayRevers = new int[5];

        arrayRevers[0] = 1;
        arrayRevers[1] = 2;
        arrayRevers[2] = 3;
        arrayRevers[3] = 4;
        arrayRevers[4] = 5;


    }


    private static void printRevers(int[] arrayRevers, int n) {
        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = arrayRevers[arrayRevers.length - 1];
                if (arrayRevers.length - 1 >= 0)
                    System.arraycopy(arrayRevers, 0, arrayRevers, 1, arrayRevers.length - 1);
                arrayRevers[0] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arrayRevers) System.out.print(i + " ");
                System.out.println();
            }
        }

        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = arrayRevers[0];
                System.arraycopy(arrayRevers, 1, arrayRevers, 0, arrayRevers.length - 1);
                arrayRevers[arrayRevers.length - 1] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arrayRevers) System.out.print(i + " ");
                System.out.print("\r\n");
            }

        }
    }
}
