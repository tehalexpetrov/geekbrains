package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class gameTwo {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String [] words ={"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    for (int i = 0; i < words.length; i++){
        Math.round(Math.random() * words.length - 1);
        System.out.println(Arrays.toString(words));

    }


    }
}
