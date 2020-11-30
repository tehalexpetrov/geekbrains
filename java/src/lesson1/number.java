package lesson1;

public class number {
    public static void main(String[] args) {
        int number = -5;
        int resultNumber = checkNumberResult(number);
        System.out.println(resultNumber);
    }

    private static int checkNumberResult(int number) {
        if (number >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        return number;
    }
}
