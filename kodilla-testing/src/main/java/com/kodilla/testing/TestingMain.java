package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;


public class TestingMain {
    public static void main(String[] args){
        //System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        /*SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        } */


        Calculator test1 = new Calculator();

        int sum = test1.add(4, 6);
        int dif = test1.substract(10, 2);

        if(sum==(10)) {
            System.out.println("Dodawanie działa!");
        } else {
            System.out.println("Error!");
        }

        if(dif==(8)) {
            System.out.println("Odejmowanie działa!");
        } else {
            System.out.println("Error!");
        }
    }
}
