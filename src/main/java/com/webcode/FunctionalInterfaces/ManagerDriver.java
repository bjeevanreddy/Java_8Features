package com.webcode.FunctionalInterfaces;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagerDriver {

   static void sortManager(List<Manager> c){

       // sort function takes a lambda expression which prints in descending order
//        c.sort((x, y) -> {
//            if (x.getSalary() < y.getSalary()) {
//                return 1;
//            }
//            return -1;
//        });

       // we can also use Integer.compare method to sort
        c.sort( (x,y) -> Integer.compare(y.getSalary(), x.getSalary()));

        System.out.println(c);
        // [name='Bodigm', salary=3600, name='Jeevan', salary=1550, name='Reddy', salary=1200]
    }
    public static void main(String[] args) {
        List<Manager> list=new ArrayList<>();
        Manager m2= new Manager("Reddy", 1200);
        Manager m1= new Manager("Jeevan", 1550);
        Manager m3= new Manager("Bodigm", 3600);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        sortManager(list);


    }
}
