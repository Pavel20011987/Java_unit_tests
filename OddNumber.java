package com.denisstrykov.unit_tests.Unit3.HW3.odd_number;

public class OddNumber {


    public boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }


    /*
     * Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
     * переданное число в интервал (25;100)
     */
    public boolean numberInInterval(int n) {
        return n >= 25 && n <= 100;
    }

}
