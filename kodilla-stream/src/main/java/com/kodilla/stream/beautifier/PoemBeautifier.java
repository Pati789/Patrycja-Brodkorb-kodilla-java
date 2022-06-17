package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    String afterBautify;

    public void beautify(String poem, PoemDecorator poemDecorator) {
        afterBautify =poemDecorator.decorate(poem);
        System.out.println(afterBautify);
    }


}
