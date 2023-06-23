package com.webcode.FunctionalInterfaces.MethodRefernceDemo;


class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name= " + name;
    }
}

@FunctionalInterface
interface PersonObject{
    Person getPersonObject(String name); // abstract method which return Person object by taking name
    // in-short it intended to create Person constructor
}
public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        PersonObject po = Person::new;  // constructor reference using new key word

        // calling method from FI which return a person object with name
        Person p = po.getPersonObject("jeevan");

        System.out.println(p.toString()); // calling methods from p object
    }
}
