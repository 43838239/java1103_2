package com.ocp13_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet(); // �S��:�����������\��O����HashCode�ӨM�w, ���������d�ߪ��Ĳv
        set.add("���"); // String
        set.add(100); // ���O int �ӬO Integer
        set.add("�^��"); // String
        set.add(Integer.valueOf("100")); // Integer
        set.add("�ƾ�"); // String
        set.add(new Integer("90")); // Integer
        System.out.println(set);
        // for-loop
        for(Object obj : set) {
            System.out.println(obj);
        }
        // Java 8 foreach
        set.forEach(e -> System.out.println(e));
        set.forEach(System.out::println);
        // ��ƪ���(�����Ӽ�)
        System.out.println(set.size());
    }
}