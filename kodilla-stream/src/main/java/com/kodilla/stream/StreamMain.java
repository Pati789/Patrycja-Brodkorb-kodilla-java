package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
    ExpressionExecutor expressionExecutor = new ExpressionExecutor();

    System.out.println("Calculating expressions with lambdas");
    expressionExecutor.executeExpression(10, 5, (a, b)-> a + b);
    expressionExecutor.executeExpression(10, 5, (a, b)-> a - b);
    expressionExecutor.executeExpression(10, 5, (a, b)-> a * b);
    expressionExecutor.executeExpression(10, 5, (a, b)-> a / b);

    System.out.println("Calculating expressions with method references");
    expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);


    // zadanie 7.1
        System.out.println("Poem Beautifier - 7.1");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("hey there!", (poem) ->"ABC " + poem + " ABC");
        poemBeautifier.beautify("hey there!", (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("HEY THERE !", (poem) ->poem.toLowerCase());

    // NumbersGenerator 7.2
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);





    }
}
