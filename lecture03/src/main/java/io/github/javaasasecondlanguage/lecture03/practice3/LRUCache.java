package io.github.javaasasecondlanguage.lecture03.practice3;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Cache that only stores 'capacity' values that were put last
 * keep only n last inserted elements
 */
public class LRUCache extends  LinkedHashMap<String, String> {
    // linked hash map - keeps order of inserted elements
    // herite (=extends) fromLinkedHashMap
    // extends - можно тип-потомок, super -тип-родитель?

    // const capcity
    private final int capacity;


    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    // remove last element if size exceeds capacity
    //@Override
    protected boolean removeEldestEntre(java.util.Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    // comment everything beacause all these methods are already defined
/*    public String get(String key) {
        return cache.get(key);
    }

    public String put(String key, String value) {
        cache.put(key, value);
        return cache.get(key);
    }

    public int size(){
        return cache.size();
    }*/
}
