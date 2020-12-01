package lesson2;

public class checkBalance {
    public static void main(String[] args) {
        System.out.println("****************Задание6***************");
    /*Мы получили массив из чисел произвольно*/
//        arrayNumberCheck(); //получили числа для массива
        int [] arrayToSum = new int[6];

        arrayToSum[0] = 1;
        arrayToSum[1] = 1;
        arrayToSum[2] = 1;
        arrayToSum[3] = 1;
        arrayToSum[4] = 1;
        arrayToSum[5] = 1;

        boolean checkBalnceRusult = checkBalance(arrayToSum);
        System.out.println(checkBalnceRusult);

    }

    private static boolean checkBalance(int[] arrayToSum) {

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arrayToSum.length + 1; i++){

            for (int j = 0; j < i; j++){
                leftSum += arrayToSum[j];
            }

            for (int j = i; j < arrayToSum.length; j++) {
                rightSum += arrayToSum[j];
            }

            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }




}
