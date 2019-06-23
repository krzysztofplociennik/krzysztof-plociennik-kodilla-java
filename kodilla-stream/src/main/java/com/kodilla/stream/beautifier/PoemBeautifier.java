package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String string, PoemDecorator poemDecoratorObject) {
        String result = poemDecoratorObject.decorate(string);
        System.out.println("Result equals: " + result);
    }
}
