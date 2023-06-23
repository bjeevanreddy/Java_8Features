package com.webcode.FunctionalInterfaces.MethodRefernceDemo;


//Might be some helping library or class or a reusable class with helper functions
class ExternalAddition {
    static int add(int a,int b){
        return a+b;
    }
}
@FunctionalInterface
interface Addition{
     int add(int a,int b); // non-static method
}
public class StaticMethodReferenceDemo {
    public static void main(String[] args) {
        Addition a = ExternalAddition::add; // since add is a static method we can reference using class name


        // :: is called reference operator
        System.out.println(a.add(4,5)); // calling method for add in interface, which get referenced from class
        // ExternalAddition
    }
}
