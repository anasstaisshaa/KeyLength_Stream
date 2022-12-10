package edu.AnastasiiaTkachuk;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "key1" , 87,
                "keykeykey4", 23,
                "jdifdjiff", 34,
                "key2", 12,
                "key3", 23
        );
        int result = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(result);
    }
}
