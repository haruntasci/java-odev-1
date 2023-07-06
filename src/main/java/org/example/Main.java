package org.example;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> studentList1 = new ArrayList<>();
        studentList1.add("Harun Taşcı");
        studentList1.add("Volkan Özdemir");
        studentList1.add("Hakan Demir");
        studentList1.add("Kaan Murat Özdemir");
        studentList1.add("İlke Demir");

        ArrayList<String> studentList2 = new ArrayList<>();
        studentList2.add("Murat Güneş");
        studentList2.add("Sinan Furkan Birkan Demirci");
        studentList2.add("Metehan Kaya");
        studentList2.add("Ayşe Kayahan");
        studentList1.add("Fatma Çelik");

        ArrayList<String> studentList3 = new ArrayList<>();
        studentList3.add("Emrah Hakan Yılmaz");
        studentList3.add("Tarık Çelik");
        studentList3.add("Yiğit Aydan");
        studentList3.add("Atakan Aydın");
        studentList3.add("Ezgi Yılmaz");

        Map<String, ArrayList<String>> students = new HashMap<>();
        students.put("1A", studentList1);
        students.put("1B", studentList2);
        students.put("1C", studentList3);

        Set<String> studentsClassesSet = students.keySet();
        ArrayList<String> studentsClasses = new ArrayList<String>(studentsClassesSet);

        System.out.println("İsminin sonu 'an' ile biten öğrenciler : ");

        int classIndex = 0;
        for (ArrayList<String> studentNamesList : students.values()) {
            for (String studentName : studentNamesList) {
                String[] checkName = studentName.split(" ");
                for (int i = 0; i < checkName.length - 1; i++) {
                    if (checkName[i].endsWith("an")) {
                        System.out.println(studentsClasses.get(classIndex) + " sınıfından " + studentName);
                        break;
                    }
                }
            }
            classIndex++;
        }


    }
}
