package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chhotelal.gupta
 */
public class JavaTest2 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        
        names.forEach(System.out::println);
        
    }
}
