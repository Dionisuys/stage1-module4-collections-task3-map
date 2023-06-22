package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> function = calculateFunctionMap(sourceList);
        return function.containsKey(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> function = new HashMap<>();
        for (int key : sourceList) {
            function.put(key, (5 * key + 2));
        }
        return function;
    }
}
