package com.webcode.FunctionalInterfaces;


@FunctionalInterface // optioanl if it has only one method
interface Student{
    void name(String name); // by default abstarct method
    default boolean valid(int age) { // default method
        return age> 21;
    }
}
public class FunctionalInterfaceAnonymusWay {

    // instead of using implements, we can use anonymous function to implement interface methods
    Student s = new Student() {
        @Override
        public void name(String name) {
            System.out.println("hello! "+ name);
        }
    };

    public void getGreeting(String name){
        s.name("jeevan "+ name);
    }

    public static void main(String[] args) {
        FunctionalInterfaceAnonymusWay s = new FunctionalInterfaceAnonymusWay();
        s.getGreeting("reddy");

    }
}
