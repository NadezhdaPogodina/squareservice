package ru.netology.javaqa.services;

public class SquareService {
    public int calculate(int min, int max) {
        int first = min;
        int second = max;
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            if ((i * i >= min) & (i * i <= max)) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}

