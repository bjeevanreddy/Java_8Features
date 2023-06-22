package com.webcode.FunctionalInterfaces;


@FunctionalInterface // optioanl if it has only one method
interface Customer{
    void name(String name); // by default abstarct method
    default boolean valid(int age) { // default method
        return age> 21;
    }
}
public class FunctionalInterfaceDemo implements Customer {

    //Implementing interface in traditional way
    @Override
    public void name(String name) {
        System.out.println("hello "+ name);
    }


    public static void main(String[] args) {
        Customer fi = new FunctionalInterfaceDemo();
        fi.name("jeevan");
    }
}
