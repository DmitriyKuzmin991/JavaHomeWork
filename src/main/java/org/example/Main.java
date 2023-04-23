package org.example;


import org.example.HomeWorkThree.HomeWorkThree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = HomeWorkThree.createIntegerList(20);
//        System.out.println(list);
//        HomeWorkThree.removeOddNumber(list);
//        System.out.println(list);
//        System.out.println(HomeWorkThree.findMinFromList(list));
//        System.out.println(HomeWorkThree.findMaxFromList(list));
//        System.out.println(HomeWorkThree.findAvgFromList(list));
        List<String> planets = HomeWorkThree.crateListOfPlanet(10);
        System.out.println(planets);
        var countOfPlanets = HomeWorkThree.countPlanetOnList(planets);
        System.out.println(countOfPlanets);





    }

}
//    Пусть дан произвольный список целых чисел, удалить из него четные числа
//    Задан целочисленный список ArrayList. Найти минимальное, максимальное и
//    среднее арифметическое из этого списка. Collections.max()
//        Заполнить список названиями планет Солнечной системы в произвольном
//        порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.
//        *Реализовать алгоритм сортировки слиянием



