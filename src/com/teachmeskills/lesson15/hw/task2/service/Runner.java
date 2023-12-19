package com.teachmeskills.lesson15.hw.task2.service;

import com.teachmeskills.lesson15.hw.task2.figure.Circle;
import com.teachmeskills.lesson15.hw.task2.figure.Figure;
import com.teachmeskills.lesson15.hw.task2.figure.Rectangle;
import com.teachmeskills.lesson15.hw.task2.figure.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create a collection of shapes.
 * (The classes for the shapes can be taken from previous homework assignments. It is not necessary to use sealed classes)
 * Fill the collection with various shapes.
 * Loop through the collection and call a method to calculate and display the perimeter of each shape.
 */
public class Runner {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        Collections.addAll(figures,new Circle(12),
                                   new Triangle(34,10,12),
                                   new Rectangle(10,12));

        for (Figure figure:figures) {
            System.out.println(figure.printPerimeter());
        }
    }
}
