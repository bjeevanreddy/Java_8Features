package com.webcode.FunctionalInterfaces.FItypes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class PredicateClassDemo{
    static boolean getAge(int age){
        return age>21;
    }
}

public class PredicateDemo {
    public static void main(String[] args) {
    //Predicate take input and return boolean
        // boolean test<T>


        //Anonymous implementation of predicate
//        Predicate<String> p = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() >9;
//            }
//        };


        //  Lambda Implementation of predicate
        /*
            Predicate<String> p= (name)-> name.toUpperCase().equals("JEEVAN");
            System.out.println(p.test("jeevan"));
        */

        // Method reference implementation of Predciate
        Predicate<Integer> p1=PredicateClassDemo::getAge;
        System.out.println(p1.test(22));

        // we have certain methods in collections which accepts predicate as input
        // removeIf accepts repdicate and removes all strings greater than 5 length
        // there can be another methods as well,
        List<String>  list = new ArrayList<>();
        list.add("jeevan");
        list.add("reddy");
        list.add("ama");
        list.removeIf((name)-> name.length()>5);
        System.out.println(list);

    }
}
