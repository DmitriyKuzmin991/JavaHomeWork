package org.example.HomeWorkFour;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class HomeWorkFour {
    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> result = new LinkedList<>();
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            result.add(listIterator.previous());
        }
        return result;
    }

    public static int sumValueLinkedList(List<Integer> list) {
        int result = 0;
        for (Integer integer : list) {
            result += integer;
        }
        return result;
    }


}
