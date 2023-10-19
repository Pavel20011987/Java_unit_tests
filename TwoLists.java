package com.pivanov.unit_tests.Unit6.two_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TwoLists {


    /*
    .Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
    a. Рассчитывает среднее значение каждого списка
    b. Сравнивает эти средние значения и выводит соответствующее сообщение:
    - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
    - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
    - ""Средние значения равны"", если средние значения списков равны.
     */


    public List<Double> findAverage(Map<Integer, List<Integer>> lists) {
        List<Double> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : lists.entrySet()) {
            List<Integer> list = entry.getValue();
            result.add(list.stream()
                    .mapToDouble(d -> d)
                    .average()
                    .orElse(0.0));
        }
        return result;
    }

    public String comparison(List<Double> toCompare) {
        if (toCompare.size() != 2) {
            throw new IllegalArgumentException("Смотри на длину, мы сравниваем 2 значения");
        }
        if (toCompare.get(0) > toCompare.get(1)) {
            return "Первый список имеет большее среднее значение";
        } else if (toCompare.get(1) > toCompare.get(0)) {
            return "Второй список имеет большее среднее значение";
        } else return "Средние значения равны";
    }

}
