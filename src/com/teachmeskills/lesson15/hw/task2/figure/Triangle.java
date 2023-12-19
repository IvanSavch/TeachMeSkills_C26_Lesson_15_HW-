package com.teachmeskills.lesson15.hw.task2.figure;

public class Triangle extends Figure{
    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public int printPerimeter() {
        if ((sideA < 0) || (sideB < 0) || (sideC < 0)) {
            return -1;
        }
        return sideA + sideB + sideC;
    }
}
