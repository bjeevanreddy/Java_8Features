package com.webcode.FunctionalInterfaces;

@FunctionalInterface // optioanl if it has only one method
interface Employee{
    void printName(String name); // by default abstarct method
    default boolean valid(int age) { // default method
        return age> 21;
    }
}
public class FunctionalInterfaceLambda {
    void printNameTakeEmployee(Employee e){
        e.printName("Reddy");
    }
    public static void main(String[] args) {

        // type is optional if there is only one parameter
        // for Lambda expression use -> and inside { } if there are multiple expressions else singe line
        // no return keyword is also required

        // Lambdas will only work on Functional Interfaces
        Employee emp = name -> System.out.println("Hello Employee "+ name);
        emp.printName("Jeevan");


        FunctionalInterfaceLambda fil = new FunctionalInterfaceLambda();

        fil.printNameTakeEmployee(emp); // we can pass lambdas as input also

    }



}
