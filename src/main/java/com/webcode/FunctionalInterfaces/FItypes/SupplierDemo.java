package com.webcode.FunctionalInterfaces.FItypes;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


class WithNoSupplier{

    String name;
    LocalDate dob;
    LocalDate currentDate;

    public WithNoSupplier(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
        this.currentDate = LocalDate.now();
    }

    long getAge(){
        return ChronoUnit.DAYS.between(dob,currentDate);
    }
}
class WithSupplier{

}
public class SupplierDemo {
    public static void main(String[] args) {
        // Supplier method take nothing as input but returns something
        // T get()

        WithNoSupplier wns = new WithNoSupplier("jeevan",LocalDate.parse("2022-05-07"));

        System.out.println( wns.getAge()); // this returned 413 now,
        // here cdate in wns is always same, if this deluayed and my current date chnaged to tomorrow, then also
        // we will get same 413 as answer, but logically we should get 414 since day is changed,

       // all basic implementation of supplier can be used,
        // find some methods that take supplier as input
        // didn't find any in List and Map
        // can do like examples in Consumer and Predicate
        // we can use Supplier we want certain value on demand
        // consider setting a value using constructor for person current date,
        // if we set cdate in constructor once for all subsequent operations same value is used,
        // lets say a thread or another process is injected in middle or it is waiting for sometime , this wait is 1 hour
        // and our current date might go from today to tomorrow, in that case we get unambiguos results
        // so we can set current date as supplier in constructor, then it will alwyas ensure we are getting latest current date
    }
}
