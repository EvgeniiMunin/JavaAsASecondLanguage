package io.github.javaasasecondlanguage.lecture03.practice3;

import java.util.Collection;

/**
 * Classic LIFO stack
 * @param <E> the type of elements in stack
 */
public class Stack<E> {
    public void push(E e) {
        throw new RuntimeException("Not implemented");
    }

    public E pop() {
        throw new RuntimeException("Not implemented");
    }

    public boolean isEmpty() {
        throw new RuntimeException("Not implemented");
    }

    public void popAll(Collection dst) {//make it type safe
        throw new RuntimeException("Not implemented");
    }

    public void pushAll(Iterable src) {//make it type safe
        throw new RuntimeException("Not implemented");
    }
}