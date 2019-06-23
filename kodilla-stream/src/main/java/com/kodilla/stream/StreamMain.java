package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Processor processor2 = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor2.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\nCalculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier beautifierObject = new PoemBeautifier();

        System.out.println("\nChanging some strings...");
        beautifierObject.beautify("string", (string) -> "ABC" + string + "ABC");
        beautifierObject.beautify("dom", (string) -> string.toUpperCase());
        beautifierObject.beautify("sZaFa", (string) -> string.toLowerCase());
        beautifierObject.beautify("samochód", (string) -> string.substring(4,8));

        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
