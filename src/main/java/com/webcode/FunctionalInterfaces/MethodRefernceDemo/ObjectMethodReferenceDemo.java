package com.webcode.FunctionalInterfaces.MethodRefernceDemo;

// External Library or helper class which provide common functionalities
class InterestCalc{
    // method return salary * total months
    double getMonthlySalary(int m,int s){
        return m*s;
    }

    // Method returns salary after deduction
    double getSalaryAfterDed(int s,int percent){
        return s*(100-percent)/100.0;
    }
}

@FunctionalInterface
interface Interest{
    double monthlySalary(int months,int salary); // single method which can be referenced to any no of methods
}
public class ObjectMethodReferenceDemo {
    public static void main(String[] args) {
        InterestCalc ic1= new InterestCalc(); // for object reference we need to create Object for helper/Library class

        Interest I= ic1::getMonthlySalary; // reference method interested from class or external lib
         // now call the FI method which refers to method getMonthlySalary using ic1
        System.out.println(I.monthlySalary(10000,6));


        InterestCalc ic2 = new InterestCalc();
        Interest I1= ic2::getSalaryAfterDed;  // reference method from class or external lib
        // now call the FI method which refers to method getSalaryAfterDed using ic2
        System.out.println(I1.monthlySalary(10000,30));


        //Points to notice:
        /*
            -   FI can have only one method , it can reference to any no of methods until the return type and no of
            - parameters are same.
            - if you see, I and I1 are invoking same abstract method monthlySalary(a,b)
            - But the actually it is referring to specific methods from specific objects ic1 and ic2
         */
    }
}
