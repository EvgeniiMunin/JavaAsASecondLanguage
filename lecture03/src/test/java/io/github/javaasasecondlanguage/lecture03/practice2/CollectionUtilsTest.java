package io.github.javaasasecondlanguage.lecture03.practice2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Collections.*;
import static org.junit.jupiter.api.Assertions.*;

class CollectionUtilsTest {
    @Test
    void nOfCommonElements1() {
        assertEquals(emptySet(), CollectionUtils.intersect(emptySet(), emptySet()));
    }

    @Test
    void nOfCommonElements2() {
        assertEquals(Set.of("a", "b", "c"), CollectionUtils.intersect(Set.of("a", "b", "c"), Set.of("a", "b", "c")));
    }

    @Test
    void nOfCommonElements3() {
        assertEquals(Set.of("a", 1), CollectionUtils.intersect(Set.of(1, "a"), Set.of("a", "b", 1)));
    }

    @Test
    void nOfCommonElements4() {
        assertEquals(Set.of(1), CollectionUtils.intersect(Set.of(new Object(), "b", 1), Set.of(1)));
    }

    @Test
    void nOfCommonElements5() {
        assertEquals(Set.of(42), CollectionUtils.intersect(Set.of(4, 8, 15, 16, 23, 42), Set.of("l", "o", 42, "s", "t")));
    }

    @Test
    void noNullElementIsEqualToAnotherNullElement() {
        assertEquals(Collections.emptySet(), CollectionUtils.intersect(new HashSet<>(Arrays.asList(null, null)), new HashSet<>(Arrays.asList(null, null))));
    }
    /*
    void testUsability() {
        Set<? super Object> intersection = CollectionUtils.intersect()
    }*/
}