package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chhotelal.gupta
 */
public class Counter {

    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        list.parallelStream().forEach(System.out::println);
    }
}
