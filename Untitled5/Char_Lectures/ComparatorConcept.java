package Char_Lectures;

/*
arr : {4, 5, 1, 3, 2}
Arrays.sort(arr) : {1, 2, 3, 4, 5}.

Students :
student1 : rollNo = 1, name = Ayush
student1 : rollNo = 2, name = Abhisek
student1 : rollNo = 3, name = Abhilasha
student1 : rollNo = 4, name = Gaurav
student1 : rollNo = 5, name = Bhuvesh

sort this student array.

int[] arr = {4, 5, 1, 3, 2}
Student[] arr = {{3, Abhilasha}, {1, Ayush}, {4, Gaurav}, {2, Abhisek}, {5, Bhuvesh}}
sort(arr) : {{1, Ayush}, {2, Abhisek}, {3, Abhilasha}, {4, Gaurav}, {5, Bhuvesh}}
sort(arr) : {{3, Abhilasha}, {2, Abhisek}, {1, Ayush}, {5, Bhuvesh}, {4, Gaurav}}
1. sort the arr on the basis of rollNo {{1, Ayush}, {2, Abhisek}, {3, Abhilasha}, {4, Gaurav}, {5, Bhuvesh}}
2. sort the arr on the basis of names.{{3, Abhilasha}, {2, Abhisek}, {1, Ayush}, {5, Bhuvesh}, {4, Gaurav}}

Compartor/ Comparable

Comparable : It ensures or gives the flexibilty to sort an array on the basis of some property.

Input :
3 Abhilasha
1 Ayush
4 Gaurav
2 Abhishek
5 Bhuvesh
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
This indicates to the current object. This is a keyword.
Student : student1, student2, student3, student4.

Comparable help us in these type of problem.

implements : to use the property of any other classes
Comparable.
 */
class Student implements Comparable<Student>{
    int rollNo;
    String name;

    // Constructor is a function without any return type
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    /*
    return a negative value(-1) -> a = 1, b = 2,   a < b
    return a positive value(1) -> a = 2, b = 1, a > b,
    return 0; a = 1, b = 1, return 0
     */

    // 9829356177
    public int compareTo(Student student) {
        if (this.rollNo < student.rollNo) {
            return -1;
        } else if (this.rollNo > student.rollNo) {
            return 1;
        }
        return 0;
    }
}

/*
Array : fixed size.
ArrayAndLinkedLists : dynamic size.
 */


public class ComparatorConcept {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int rollNo = s.nextInt();
            String name = s.next();
            // Create an object from a class.
            Student student = new Student(rollNo, name);
            studentList.add(student);
        }
        // We are sorting on the basis of roll no.
        Collections.sort(studentList);
        for (int i = 0; i < 5; i++) {
            System.out.println(studentList.get(i).rollNo + " " + studentList.get(i).name);
        }
    }


}
