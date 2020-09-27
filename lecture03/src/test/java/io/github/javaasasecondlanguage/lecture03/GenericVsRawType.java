package io.github.javaasasecondlanguage.lecture03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GenericVsRawType {

    @Test
    public void rawTypesLeadToExceptionsInRuntime() {
        var strings = new ArrayList<String>();
        unsafeAdd(strings, 42);
        //strings.add(42); does not compile (GOOD)
        assertThrows(java.lang.ClassCastException.class, () -> {
            String s = strings.get(0); // unsafe add leads to exception in runtime (BAD)
        });
    }

    private void unsafeAdd(List list, Object o) { //use raw types and ignore that strings is ArrayList<String>
        list.add(o); //you can add anything into raw List
    }

    @Test
    void unboundedWildCardAdd(List<?> list, Object o){
        //list.add(o); //this does not compile, that would break type invariant of collection
        list.add(null); //you can only add null
    }
}