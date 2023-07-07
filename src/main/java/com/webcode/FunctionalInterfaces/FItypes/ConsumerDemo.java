package com.webcode.FunctionalInterfaces.FItypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


class ConsumerClassDemo{
    static void validateAge(int age){
        System.out.println( age>21 ? "Can buy Alcohol": "Kid dont give him alcohol");
    }
}
public class ConsumerDemo {
    public static void main(String[] args) {


        //Consumer take input and return nothing
        // vod test<T>

        //Anonymous implementation of Consumer
//        Consumer<String> p = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s.toUpperCase());
//            }
//        };


        //  Lambda Implementation of Consumer
//
//            Consumer<String> p= (name)-> System.out.println(name.substring(1));
//            p.accept("Bodigam");


        // Method reference implementation of Consumer
        Consumer<Integer> c1=ConsumerClassDemo::validateAge;
        c1.accept(21);

        // we have certain methods in collections which accepts predicate as input
        // forEach accepts consumer and prints all substrings from 1
        // there can be another methods as well,
        List<String> list = new ArrayList<>();
        list.add("jeevan");
        list.add("reddy");
        list.add("ama");
        list.forEach( e -> System.out.println(e.substring(1)));


        //Similar to void Consumer<T>, we have void BiConsumer<T,R> which takes 2 params and returns nothing
        Map<Integer, String> map = new HashMap<>();

        //Similar to foreach in list which accepts one input, we have BiConsumer for map to access key and value

        map.put(1,"jeevan");
        map.put(2,"reddy");
        map.put(3,"Bodigam");

        //BiConsumer using anonymous implementation
        BiConsumer<Integer,String> bic = new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer +"-"+s);
            }
        };

        map.forEach(bic);

        //BiConsumer using lambda function
//        map.forEach((k,v) -> System.out.println(k+ ":"+v));

    }
}
