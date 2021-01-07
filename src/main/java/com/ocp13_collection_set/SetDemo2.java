package com.ocp13_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
    public static void main(String[] args) {
        Set set = new TreeSet(); //LinkedHashSet(); // HashSet();
        // ���m539, 1~39����5�Ӥ����ƪ��Ʀr
        // �q���︹
        while (set.size() < 5) {            
            // ���ͤ@�� 1~39 ���H����
            int n = new Random().nextInt(39)+1;
            set.add(n);
            System.out.println("�[�J ==> " + n);
        }
        
        System.out.println(set);
        // �m�y�����X�`�M ?
        // Java 7 for-loop
        int sum = 0;
        for(Object obj : set) {
            if(obj instanceof Integer) {
                sum += (Integer)obj;
            }
        }
        System.out.println(sum);
        // Java 8
        int sum2 = set.stream().mapToInt(e -> ((Integer)e).intValue()).sum();
        System.out.println(sum2);
        int sum3 = set.stream().mapToInt(e -> (Integer)e).sum(); // Java 5 ����i�H�ٲ� intValue() ���ե�
        System.out.println(sum3);
    }
}
