package ru.netology.javapackage.services;

public class SQRService {

    public int calculate(int start, int end) {
        int result = 0;
        for (int i = 10; i < 100; i++) {
            int sqroot = i * i;
            if (sqroot > start && sqroot < end) {
                result++;
            }
        }
        return result;
    }
}
