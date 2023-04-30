package org.example;

import org.example.HomeWorkFive.HomeWorkFive;
import org.example.HomeWorkFive.PhoneBook;

public class Main {
    public static void main(String[] args) {

        HomeWorkFive.findDuplicateEmployees();
        PhoneBook book = new PhoneBook();
        book.addContact("Vasy", 1234567);
        book.addContact("Lena", 4242131);
        book.addContact("Ivan", 5343434);
        book.addContact("Ivan", 223233345);
        book.addContact("Tolya", 88888888);
        book.addContact("Tolya", 442356);
        book.addContact("Dima", 33355);
        book.addContact("Liza", 33355);
        book.addContact("Dima", 233232);
        System.out.println(book.getContact(33355));
        System.out.println(book.getContact("Liza"));
        System.out.println(book.getContact("Vasy"));
        System.out.println(book.getContact("Zayr"));
        book.print();
        System.out.println(book.removeContact("Vasy"));
        System.out.println(book.removeContact("Liza"));
        book.print();


    }
}




