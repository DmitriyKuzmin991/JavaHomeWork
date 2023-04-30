package org.example.HomeWorkFive;

import java.util.*;

public class PhoneBook {
    private Map<String, List<Integer>> phoneBook = new HashMap<>();

    public void addContact(String name, Integer phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<Integer> temp = phoneBook.get(name);
            temp.add(phoneNumber);
        } else {
            List<Integer> list = new LinkedList<>();
            list.add(phoneNumber);
            phoneBook.put(name, list);
        }
    }
    public String getContact (String name) {
        if (!phoneBook.containsKey(name)) return  "Нет контактов с именем " + name;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(" has number: ");
        for (var number: phoneBook.get(name)) {
            stringBuilder.append(number);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
    public String getContact (int number) {
        StringBuilder stringBuilder = new StringBuilder();
       for (Map.Entry<String, List<Integer>> book : phoneBook.entrySet()) {
           if (book.getValue().contains(number)) {
               stringBuilder.append(book.getKey());
               stringBuilder.append(" has number ");
               stringBuilder.append(number);
               stringBuilder.append("\n");
           }
       }
       return stringBuilder.toString();
    }
    public void print() {
        for (Map.Entry<String, List<Integer>> book : phoneBook.entrySet()) {
            System.out.println(book.getKey() + " " + book.getValue());
        }
    }
    public boolean removeContact(String name) {
        if (!phoneBook.containsKey(name)) return false;
        phoneBook.remove(name);
        return true;
    }




}
