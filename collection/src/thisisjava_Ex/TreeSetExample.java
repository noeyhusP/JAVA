package thisisjava_Ex;

// 이것이자바다 p703 10번

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student2> treeSet = new TreeSet<Student2>();
        treeSet.add(new Student2("blue", 96));
        treeSet.add(new Student2("hong", 86));
        treeSet.add(new Student2("white", 92));
        
        Student2 student = treeSet.last();
        System.out.println("최고 점수: " + student.score);
        System.out.println("최고 점수 받은 아이디: " + student.id);
    }
}
