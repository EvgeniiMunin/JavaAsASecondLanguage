package io.github.javaasasecondlanguage.lecture03.practice1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;

/**
 * Classic LIFO stack
 * @param <E> the type of elements in stack
 */
public class Stack<E> {

    // use arraylist as field locally
    ArrayList<E> stack = new ArrayList<E>(); // ok

    public void push(E e) {
        // append
        stack.add(e); // ok
    }

    public E pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        var temp = stack.get(stack.size() - 1); // ok
        stack.remove(stack.size() - 1); // ok
        return temp;
    }

    public boolean isEmpty() {
        return stack.isEmpty(); //ok
    }

    // type safe - can do pushAll, popAll to do operations to every element type
    public void popAll(Collection<? super E> dst) {//make it type safe
        // pop all from stack and add to collection dst. Iterate over all elements
        // super  - everything above (super for every type is Object)
        // extends - everything below
        while (!stack.isEmpty()) {
            dst.add(pop());
        }
    }

    public void pushAll(Iterable<? extends  E> src) {//make it type safe
        // define type of elem Number and give Integer - fix boundaries for generics
        for (E e: src) {
            push(e);
        }
    }
}