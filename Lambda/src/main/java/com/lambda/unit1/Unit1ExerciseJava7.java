package com.lambda.unit1;

import com.lambda.common.Condition;
import com.lambda.common.Person;

import java.util.*;

public class Unit1ExerciseJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        // Step 1 : Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        // Step 2 : Create a method that prints all elements in the list
        printAll(people);
        // Step 3 : Create a method that prints all people that have name begining with C
        printLastNameBeginingWithC(people);
        printConditonially(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });
        printConditonially(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("B");
            }
        });
        printConditonially(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("D");
            }
        });



    }

    private static void printLastNameBeginingWithC(List<Person> people) {
        System.out.println("printLastNameBeginingWithC");
        for (Person person: people) {
            if(person.getLastName().startsWith("C")) {
                System.out.println(person);
            }
        }
    }

    private static void printAll(List<Person> people) {
        System.out.println("printAll");
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
    private static void printConditonially(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }
}
