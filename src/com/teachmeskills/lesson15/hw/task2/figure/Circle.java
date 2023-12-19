package com.teachmeskills.lesson15.hw.task2.figure;

public class Circle extends Figure{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int printPerimeter() {
        if (radius < 0) {
            return -1;
        }
        double P = 2 * Math.PI * radius;
        return (int) P;
    }
}
