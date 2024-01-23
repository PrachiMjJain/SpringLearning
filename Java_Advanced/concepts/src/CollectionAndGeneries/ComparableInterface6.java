// Making our Objects
package CollectionAndGeneries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements  Comparable<Student>{
    int rollno, marks;
    String name;

    public Student(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        return name.length() > o.name.length() ? 1 : -1;
    }
}

class ComparableInterface {
    public static void main(String[] args){
        List<Student> student = new ArrayList<>();
        student.add(new Student(1 ,67, "Prachi"));
        student.add(new Student(2 ,37, "Arpit"));
        student.add(new Student(3 ,97, "Lucky"));
        student.add(new Student(4 ,29, "Aji"));

        // to sort elements we need to implements Comparable interface
        //Collections.sort(student);

        // for later change we can use
        Collections.sort(student,(i,j)->i.marks>j.marks ? 1 : -1);


        for(Student s:student){
            System.out.println(s);
        }

    }
}
