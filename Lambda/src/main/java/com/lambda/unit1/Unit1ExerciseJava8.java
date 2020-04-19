package com.lambda.unit1;

import com.lambda.common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class Unit1ExerciseJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        // Step 1 : Sort list by last name
        Collections.sort(people,(p1, p2)->p1.getLastName().compareTo(p2.getLastName()));

        // Step 2 : Create a method that prints all elements in the list
        printConditonially(people, p -> true);
        // Step 3 : Create a method that prints all people that have name begining with C
        printLastNameBeginingWithC(people);
        printConditonially(people, p->p.getLastName().startsWith("C"));
        printConditonially(people, p->p.getLastName().startsWith("B"));
        printConditonially(people, p->p.getLastName().startsWith("D"));

    }

    private static void printLastNameBeginingWithC(List<Person> people) {
        System.out.println("printLastNameBeginingWithC");
        for (Person person: people) {
            if(person.getLastName().startsWith("C")) {
                System.out.println(person);
            }
        }
    }

    private static void printConditonially(List<Person> people, Predicate<Person> condition) {
        for (Person person : people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }
}
