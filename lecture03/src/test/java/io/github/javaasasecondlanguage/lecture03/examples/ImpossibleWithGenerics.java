package io.github.javaasasecondlanguage.lecture03.examples;

//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

public class ImpossibleWithGenerics {
    @Test
    <T> void instantiate() {
        //T(); // does not compile
    }

    @Test
    <T> boolean instanceOf(Object t) {
        //return t instanceof T; //does not compile - runtime check
        //return t.getClass() == T; //does not compile - runtime check
        throw new RuntimeException();
    }
}
