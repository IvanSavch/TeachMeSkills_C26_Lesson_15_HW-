package com.teachmeskills.lesson15.hw.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Create a collection of integers and fill it with value entered from the console.
 * When populating a collection with numbers from the console, you should make type casts.
 * The code to convert a string to a number can be used as follows:
 * int i = Integer.parseInt(str);
 * or
 * int val = Integer.valueOf(str);
 * To end your input, enter the word "exit".
 * When converting a string to a number, you should consider the possibility of exceptions.
 */
public class Task1 {

    public static void main(String[] args) {
        List<Integer> integersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("e")) {
               break;
            }
            try {
                int a = Integer.parseInt(str);
                integersList.add(a);
            }catch (NumberFormatException e) {
                System.out.println("invalid String");
            }
        }

        for (Integer integer : integersList) {
            if (integer % 2 == 0){
                System.out.println(integer);
            }
        }
    }

}
