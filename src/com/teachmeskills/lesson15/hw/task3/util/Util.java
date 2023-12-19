package com.teachmeskills.lesson15.hw.task3.util;

import com.teachmeskills.lesson15.hw.task3.exception.LengthException;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Util {
    public static int length (String length)throws LengthException {
        int len = 0;
        try {
            len = Integer.parseInt(length);
        }catch (NumberFormatException e) {
            System.out.println("invalid format int");
        }

        if (len<0) {
            throw new LengthException("wrong length");
        }

        return len;
    }
    public static int arithmetic(List<Integer> integers) {
        int sum = 0;
        int arithmetic = 0;
        for (int i = 0; i < integers.size(); i++) {
            sum += integers.get(i);
        }
        try {
            arithmetic = sum /integers.size();
        }catch (ArithmeticException e) {
            System.out.println("cannot be divided by zero");
        }
        return  arithmetic;
    }
    public static void fillingTheArray (List<Integer> list,int len) {
        for (int i = 0; i < len; i++) {
            list.add((int) (Math.random() * 100));
        }

    }
}
