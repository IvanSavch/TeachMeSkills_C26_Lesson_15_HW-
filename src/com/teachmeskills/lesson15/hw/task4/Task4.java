package com.teachmeskills.lesson15.hw.task4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a collection of unique names of all students in our group + teacher.
 * Display the collection on the screen.
 */
public class Task4 {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        Collections.addAll(name,"Ivan","Andrew","Lisa","Artur","Daniil","Polina","Sergey","Mark");
        System.out.println(name);
    }
}
