package com.ocp13_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;
import static java.util.stream.Collectors.toSet;
import java.util.stream.IntStream;

public class SetDemo4 {
    public static void main(String[] args) {
        Set<Exam> exams = new LinkedHashSet<>();
        IntStream.rangeClosed(1, 20).forEach(i -> exams.add(new Exam()));
        System.out.println("���Z���Z: " + exams);
        System.out.println("1. ��奭��");
        // �L�X�Ҧ���妨�Z
        exams.stream()
                .mapToInt(e -> e.getChinese())
                .forEach(score -> System.out.print(score + ", "));
        // �p���奭��
        double avg_chinese = exams.stream()
                .mapToInt(e -> e.getChinese())
                .average()
                .getAsDouble();
        System.out.println("����: " + avg_chinese);
        System.out.println("2. �^�奭��");
        // �L�X�Ҧ��^�妨�Z
        exams.stream()
                .mapToInt(e -> e.getEnglish())
                .forEach(score -> System.out.print(score + ", "));
        // �p��^�奭��
        double avg_english = exams.stream()
                .mapToInt(e -> e.getEnglish())
                .average()
                .getAsDouble();
        System.out.println("����: " + avg_english);
        System.out.println("3. �ƾǥ��� (�ЦP�Ǧۦ漶�g)");
        System.out.print("4. ���̰������� : ");
        int max_chinese = exams.stream()
                .mapToInt(e -> e.getChinese())
                .max()
                .getAsInt();
        System.out.println(max_chinese);
        System.out.print("5. ���̰������H�W���� : ");
        exams.stream()
                .filter(e -> e.getChinese() == max_chinese)
                .forEach(e -> System.out.print(e.getName() + ", "));
        System.out.println();
        System.out.print("6. �`���Z�̰����H�W����?�O�X��? ");
        int max_score = exams.stream()
                .mapToInt(e -> e.getChinese()+e.getEnglish()+e.getMath())
                .max()
                .getAsInt();
        exams.stream()
                .filter(e -> e.getChinese()+e.getEnglish()+e.getMath() == max_score)
                .forEach(e -> System.out.print(e.getName() + ", "));
        System.out.println(max_score);
    }
}