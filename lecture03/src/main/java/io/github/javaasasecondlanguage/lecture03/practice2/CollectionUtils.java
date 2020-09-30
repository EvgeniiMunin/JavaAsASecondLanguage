package io.github.javaasasecondlanguage.lecture03.practice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CollectionUtils {
    /**
     * Find common elements for specified sets. Null elements can not be common
     * Change signature
     * @param s1 set
     * @param s2 set
     * @return common elements for given sets
     */
    public static Set<Object> intersect(Set<?> s1, Set<?> s2) { //change method signature to make it type safe
        /*// undistructive way to et intersect
        var result = new HashSet<>(s1);
        result.retainAll(s2);

        // take into account
        // remove if - get predicat (bool function) which will filter elements
        result.removeIf(Objects::isNull);
*/
        // But want to work sets with generics to be type safe
        // wild cards - we dont know about anything about - return Set<Object>
        var result = new HashSet<Object>(s1);
        result.retainAll(s2);
        result.removeIf(Objects::isNull);

        return result;
    }
}
