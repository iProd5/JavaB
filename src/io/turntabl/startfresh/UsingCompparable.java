package io.turntabl.startfresh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int age,
            rollno;



    public Student(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollno=" + rollno +
                '}';
    }

   @Override
    public int compareTo(Student s) {
//        return age< s.age?1:-1;// will sort in descending order > will sort in ascending order.
       return name.length()>s.name.length()?1:-1; // wil sort according to lenght of name
    }
}
public class UsingCompparable {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("ama",5,4));
        students.add(new Student("amal",2,4));
        students.add(new Student("am",9,4));
        students.add(new Student("a",6,4));
        students.add(new Student("amma",1,4));

//        Collections.sort(students);
        Collections.sort(students,(i,j)-> i.age>j.age?1:-1);// overiding with a comparable object

        for(Student s : students){
            System.out.println(s);
        }
//        but then i want to sort the output based either on the lenght of name , marks or rollno.
//        hence i will need to implent the Comparable interface

    }
}
