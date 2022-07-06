package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.stream.Collectors;
import com.kodilla.stream.book.Book;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;
import java.util.Map;

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

        //People 7.3

        People.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);


        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<",">>"));

                System.out.println(theResultStringOfBooks);



                //zadanie 7.3
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getList().stream()
                .filter(forumuser -> forumuser.getSex() == 'M')
                .filter(forumuser -> 2022 - forumuser.getDateOfBirth().getYear() >= 20)
                .filter(forumuser -> forumuser.getNumberOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));


        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
        .map(entry -> entry.getKey() + "; " + entry.getValue())
        .forEach(System.out::println);
    }

}
