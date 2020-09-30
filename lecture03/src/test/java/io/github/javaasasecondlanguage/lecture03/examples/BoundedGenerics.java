package io.github.javaasasecondlanguage.lecture03.examples;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BoundedGenerics {
    void unboundedGeneric(List<Number> numbers){
        numbers.add(1);
        Number number = numbers.get(0);
    }


    void extendsGeneric(List<? extends Number> numbers){
        // add Integer - compiler converts it to Number (boxing/ unboxing)
        // can put only list heritating from Number - double
        //numbers.add(1); // does not compile
        numbers.add(null);//you can only add null
        //Integer number = numbers.get(0);//does not compile
        Object object = numbers.get(0);
        Number number = numbers.get(0);
    }

    void superGeneric(List<? super Number> numbers){
        numbers.add(1);
        //Number object = numbers.get(0); //does not compile
        //Integer object = numbers.get(0); //does not compile
        Object object = numbers.get(0); //does not compile
    }

    void wildcardGeneric(List<?> numbers){
        // <?> wild card to extend types - dont know anything about types
        // cannot use specific methods or add nothing but Object type
        //numbers.add(1); // does not compile
        numbers.add(null);//you can only add null
        Object o = numbers.get(0);
    }

    @Test
    void boundedGenerics(){
        // Object <- NUmber <- Integer
        // define arraylist of Number - but it will not work with Integer, Object - need bounds to extends
        //unboundedGeneric(new ArrayList<Integer>()); // does not compile
        unboundedGeneric(new ArrayList<Number>()); // does not compile
        //unboundedGeneric(new ArrayList<Object>()); // does not compile

        extendsGeneric(new ArrayList<Integer>());
        extendsGeneric(new ArrayList<Number>());
        //extendsGeneric(new ArrayList<Object>()); // does not compile

        //superGeneric(new ArrayList<Integer>()); // does not compile
        superGeneric(new ArrayList<Number>());
        superGeneric(new ArrayList<Object>());

        wildcardGeneric(new ArrayList<Number>());
        wildcardGeneric(new ArrayList<Integer>());
        wildcardGeneric(new ArrayList<Object>());
    }
}
