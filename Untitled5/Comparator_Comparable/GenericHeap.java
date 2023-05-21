package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


// Comparable vs Comparator
// When a class implements an interface it provides body of all function of interface . It does not have body .
// Comparable has only one function -> int compareTo ()
public class GenericHeap {
    static class Student implements Comparable<Student>{
        int RollNo;
        int Height;
        int Weight;

        Student(int RollNo,int Height ,int Weight){
            this.RollNo = RollNo;
            this.Height  = Height;
            this.Weight = Weight;
        }
        public int compareTo(Student o ){
            return this.RollNo - o.RollNo;  // this will give high priority to smaller roll no for priority to greater rollno use this :
//            return o.RollNo - this.RollNo;    // this will give high priority to greater roll no ;
        }
        public String toString(){
            return "RollNo = " + this.RollNo + ", Height = " + this.Height + ", Weight = " + this.Weight  ;
        }
    }
    static class StudentHeightComparator implements Comparator<Student> {
        //In ascending order
//        public int compare(Student s1 , Student s2 ){
//            return s1.Height - s2.Height;
//        }

        // In descending order
        public int compare(Student s1 , Student s2 ){
            return s2.Height - s1.Height;
        }
    }
    static class StudentWeightComparator implements Comparator<Student> {
        // In ascending order
//        public int compare(Student s1 , Student s2 ){
//            return s1.Weight - s2.Weight;
//        }

        // In descending order
        public int compare(Student s1 , Student s2 ){
            return s2.Weight - s1.Weight;
        }
    }
    public static void main(String[] args) {
        int [] arr = {10, 2, 17, 3, 18, 9 , 22};
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentHeightComparator());

        pq.add(new Student(10,180,81));
        pq.add(new Student(2,185,85));
        pq.add(new Student(12,170,84));
        pq.add(new Student(18,179,88));
        pq.add(new Student(7,182,82));



        while(pq.size() > 0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
    public static class PriorityQueue <T>{
        ArrayList<T> data;
        Comparator comp;
        public PriorityQueue() {
            data = new ArrayList<>();
            comp = null;
        }

        public PriorityQueue(Comparator comp) {
            data = new ArrayList<>();
            this.comp = comp;
        }

        private boolean isSmaller(int i ,int j){

            if(comp == null){
                Comparable ith = (Comparable) data.get(i);
                Comparable jth = (Comparable) data.get(j);

                if (ith.compareTo(jth) < 0) {
                    return true ;
                } else {
                    return false;
                }
            } else {
                T ith =  data.get(i);
                T jth =  data.get(j);
                if (comp.compare(ith,jth) < 0) {
                    return true ;
                } else {
                    return false;
                }
            }

        }


        public void add(T val) {
            // write your code here
            data.add(val);
            upheapify(data.size()-1);
        }

        private void upheapify(int i ){
            if(i==0){
                return ;
            }
            int pi = (i-1)/2;
            if(isSmaller(i,pi) == true){
                swap(i,pi);
                upheapify(pi);
            }
        }

        private void swap(int i , int j ){
            T ith = data.get(i);
            T jth = data.get(j);
            data.set(i,jth);
            data.set(j,ith);
        }


        public T remove() {
            // write your code here
            if(this.size() == 0 ){
                System.out.println("Underflow");
                return null;
            }
            swap(0,data.size()-1);
            T val = data.remove(data.size()-1);
            downheapify(0);
            return val;
        }

        private void downheapify(int pi){
            int mini = pi;
            int li = (2 * pi) + 1;
            if(li < data.size() && isSmaller(li,mini) == true){
                mini = li ;
            }
            int ri = (2 * pi) + 2;
            if(ri < data.size() && isSmaller(ri,mini) == true){
                mini = ri ;
            }
            if(mini != pi){
                swap(pi,mini);
                downheapify(mini);
            }

        }


        public T peek() {
            // write your code here
            if(this.size() == 0){
                System.out.println("Underflow");
                return null;
            } return data.get(0);
        }


        public int size() {
            // write your code here
            return data.size();
        }
    }
}
