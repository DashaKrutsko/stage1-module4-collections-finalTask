package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {

    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> line : sourceMap.entrySet()) {
            if (newMap.containsKey(line.getKey().length())) {
                Set<String> set = new HashSet<>(newMap.get(line.getKey().length()));
                set.add(line.getKey());
                newMap.put(line.getKey().length(), set);
            } else {
                Set<String> set = new HashSet<>();
                set.add(line.getKey());
                newMap.put(line.getKey().length(), set);
            }
        }
        return newMap;
    }
}
