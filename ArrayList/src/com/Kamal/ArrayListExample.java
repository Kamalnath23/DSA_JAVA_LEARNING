package com.Kamal;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        //Must add wrapper classes in the List.
        list.add(577);
        list.add(57);
        list.add(577);
        list.add(517);
        list.add(357);
        list.add(557);
        list.add(587);
        list.add(597);
        list.add(517);
        list.add(1517);
        list.add(2517);
        list.add(8518);

        System.out.println(list.contains(517));

        list.set(0,99); //update
        System.out.println(list);
        list.remove(2); //index 2 object will be removed
        System.out.println(list);

    }
}
