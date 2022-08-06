package ru.netology.sqr;

public class SQRService {
    public int countSqrAmount(int x, int y) {
        int result = 0;
        for (int i = 10; i < 100; i++) {
            int q = i * i;
            if (x <= q && q <= y) {
                result++;
            }
        }
        return result;
    }
}
