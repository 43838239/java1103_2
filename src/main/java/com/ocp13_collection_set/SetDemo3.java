package com.ocp13_collection_set;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        // ���X�P�x��<>
        Set set = new LinkedHashSet();
        while(set.size() < 5) {
            set.add(new Random().nextInt(39) + 1);
        }
        set.add("����");
        System.out.println(set);
        set.remove("����");
        System.out.println(set);
        System.out.println("-----------------------------------------");
        Set<Integer> set2 = new LinkedHashSet<>();
        while(set2.size() < 5) {
            set2.add(new Random().nextInt(39) + 1);
        }
        System.out.println(set2);
        // e -> e.intValue() Integer e �ե� e.intValue() �ন int
        //set2.stream().mapToInt(e -> e.intValue()).sum();
        int sum = set2.stream().mapToInt(e -> e).sum();
        System.out.println(sum);
    }
}