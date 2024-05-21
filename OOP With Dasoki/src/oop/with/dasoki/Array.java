package oop.with.dasoki;

import java.util.ArrayList;

public class Array {
    public void array_examples() {
        ArrayList<String> list = new ArrayList<String>(5);
        list.add("ahmed");
        list.add("muhmmed");
        list.add("alind");

        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(2));

        list.add(1,"samir");
        System.out.println(list);
        System.out.println(list.size());

        list.set(0, "hayan");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        
    }
}

class test extends Array  {}