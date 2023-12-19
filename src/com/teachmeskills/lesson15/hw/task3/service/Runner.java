package com.teachmeskills.lesson15.hw.task3.service;

import com.teachmeskills.lesson15.hw.task3.exception.LengthException;
import com.teachmeskills.lesson15.hw.task3.util.Util;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

/**
 * Create a collection of integers.
 * Fill the collection with random numbers.
 * Let the collection size be set from the console.
 * Expect possible errors when retrieving the collection size from the console.
 * Provide a check for validity of the entered collection size.
 * Calculate and display the arithmetic mean of all elements in the collection.
 */
public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;

        try {
            length = Util.length(scanner.nextLine());
        } catch (LengthException e) {
            System.out.println(e.getMessage());
        }
        List<Integer> integers = new ArrayList<>();
        Util.fillingTheArray(integers,length);
        System.out.println(Util.arithmetic(integers));
    }

}
