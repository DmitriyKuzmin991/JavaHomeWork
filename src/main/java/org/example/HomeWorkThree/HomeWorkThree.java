package org.example.HomeWorkThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HomeWorkThree {
    public static void removeOddNumber(List<Integer> list) {
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public static List<Integer> createIntegerList(int size) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int value = (int) (Math.random() * 50);
            list.add(value);
        }
        return list;
    }

    public static int findMaxFromList(List<Integer> list) {
        return Collections.max(list);
    }

    public static int findMinFromList(List<Integer> list) {
        return Collections.min(list);
    }

    public static double findAvgFromList(List<Integer> list) {
        int result = 0;
        int count = 0;
        for (var item : list) {
            result += item;
            count++;
        }
        return (double) result / count;
    }

    public static List<String> crateListOfPlanet(int size) {
        List<String> list = new ArrayList<>(size);
        var planets = List.of("Earth", "Mars", "Mercury","Venus","Jupiter","Saturn","Uranus","Neptune");
        for (int i = 0; i < size; i++) {
            int index = (int)(Math.random() * 8);
            list.add(planets.get(index));
        }
        return list;
    }
    public static List<String> countPlanetOnList(List<String> planets) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        List<String> result = new ArrayList<>();
        Collections.sort(planets);
        for (int i = 0; i < planets.size() - 1; i++) {
            if (planets.get(i).equals(planets.get(i+1))) {
                count++;
            } else {
                sb.append(planets.get(i)).append("=").append(count);
                result.add(sb.toString());
                sb.setLength(0);
                count = 1;
            }
        }
        if (count > 1) {
            sb.append(planets.get(planets.size() - 1)).append("=").append(count);
            result.add(sb.toString());
        } else {
            sb.append(planets.get(planets.size() - 1)).append("=").append(1);
            result.add(sb.toString());
        }
        return result;
    }
}




//
//        *Реализовать алгоритм сортировки слиянием
