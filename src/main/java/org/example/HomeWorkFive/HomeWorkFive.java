package org.example.HomeWorkFive;

import java.util.*;

public class HomeWorkFive {
    public static void findDuplicateEmployees() {
        List<String> list = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова",
                "Кристина Белова", "Анна Мусина", "Анна Крутова","Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников","Иван Мечников",
                "Петр Петин", "Иван Ежов","Иван Ежов","Иван Ежов","Петр Петин"
        ));
        Map<String, Integer> nameMap = new HashMap<>();
        for (var name : list) {
            nameMap.put(name,nameMap.getOrDefault(name,0) + 1);
        }
        Map<Integer, List<String>> sortedNameMap = new TreeMap<>(Comparator.reverseOrder());
        for (var name : nameMap.keySet()) {
            int countDuplicateName = nameMap.get(name);
            if (sortedNameMap.containsKey(countDuplicateName)) {
                sortedNameMap.get(countDuplicateName).add(name + " ");
            } else {
                List<String> nameList = new LinkedList<>();
                nameList.add(name);
                sortedNameMap.put(countDuplicateName, nameList);
            }
        }
        System.out.println(sortedNameMap);
    }


}
