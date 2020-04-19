package com.lambda.unit2;

import com.lambda.common.*;
import jdk.jshell.PersistentSnippet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionInterfaceExamples {

    public static void main(String ...args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        performConditonally(people, p -> true, p -> System.out.println(p));


        performConditonally(people, p -> p.getLastName().startsWith("C"),
                p -> System.out.println("Entry with last name starting with C :\n" + p.getLastName()));


        performConditonally(people, p -> p.getFirstName().startsWith("C"),
                p -> System.out.println("Entry with first name startng with C :\n" + p.getFirstName()));

    }

    private static void performConditonally(List<Person> people, Predicate<Person> predicate,
                                            Consumer<Person> consumer) {
        for (Person person : people) {
            if(predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}
