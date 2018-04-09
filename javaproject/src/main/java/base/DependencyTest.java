package base;

import com.google.common.collect.ImmutableBiMap;

public class DependencyTest {

    public static void main (String[] args) {
        ImmutableBiMap.Builder<Object, Object> builder = ImmutableBiMap.builder();

        builder.put("Key 1", "Value 1");
        builder.put("Key 2", "Value 2");
        builder.put("Key 3", "Value 3");

        ImmutableBiMap<Object, Object> build = builder.build();

        build.entrySet().forEach(System.out::println);
    }
}
