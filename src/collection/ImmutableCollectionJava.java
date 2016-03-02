package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableCollectionJava {
    private final List<Integer> myList = Collections.unmodifiableList(Arrays.asList(1, 2, 3));
}
