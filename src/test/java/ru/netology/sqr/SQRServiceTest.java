package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/countsqr.csv")
    public void testCounterOfSqrAmount(int expected, int x, int y, String comment) {
        SQRService service = new SQRService();

        int actual = service.countSqrAmount(x, y);
        System.out.println(comment);

        Assertions.assertEquals(expected, actual);
    }

}
