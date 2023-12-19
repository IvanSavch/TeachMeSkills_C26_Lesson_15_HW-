package com.teachmeskills.lesson15.hw.task2.figure;

public class Rectangle extends Figure{
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }
    @Override
    public int printPerimeter() {
        if ((sideA < 0) || (sideB < 0)) {
            return -1;
        }
        return (sideA * 2) + (sideB * 2);
    }
}
