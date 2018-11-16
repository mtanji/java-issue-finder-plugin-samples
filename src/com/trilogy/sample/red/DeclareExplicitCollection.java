package com.trilogy.sample.red;

import java.util.*;

public class DeclareExplicitCollection {
    public void methodName() {

        // detect explicit ArrayList collection
        ArrayList<String> list = new ArrayList<>();
        list.add("");

        // detect explicit HashSet collection
        HashSet<String> set = new HashSet<>();
        set.add("");

        // detect explicit TreeSet collection
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("");

        // detect explicit TreeMap collection
        HashMap<String, String> map = new HashMap<>();
        map.put("", "");

        // detect explicit TreeMap collection
        TreeMap<String, String> map2 = new TreeMap<>();
        map2.put("", "");
    }
}
