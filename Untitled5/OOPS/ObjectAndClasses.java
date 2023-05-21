package OOPS;

class Pen {
    String color;
    String type ; // ballpoint ; gel

    public void write(){
        System.out.println("Write Something ");
    }
    public void printColorAndType(){
        System.out.println("Color of pen is :" + this.color);
        System.out.println("Type of pen is : " +this.type);
    }
}
class Student {
    String name;
    int age ;

    public void printInfo(){
        System.out.println("Name of student is :"+this.name);
        System.out.println("Age of student is:"+this.age);
    }

    // Here Student is a constructor and it has same name as of the class ,
    // Constructor are special type of function which returns nothing , we can't use int , string , void here
    // Their use is only to construct , and for one object they are called once , unlike other normal function,
    // and we call a constructor when an object is created
    Student(String name , int age){
        this.name=name;
        this.age=age;
    }


}


public class ObjectAndClasses {
    public static void main(String[] args) {
//        Pen pen1 = new Pen();
//        pen1.color = "red";
//        pen1.type = "ballpoint";
//
//        Pen pen2 = new Pen();
//        pen2.color = "blue";
//        pen2.type = "gel";
//
//        pen1.printColorAndType();
//        pen2.printColorAndType();
//        pen1.write();
//        pen2.write();




//        Student s1 = new Student();
//        s1.name = "Sandeep";
//        s1.age = 22;
//        Student s2 = new Student();
//        s2.name = "Tanmay";
//        s2.age = 5;
//        s1.printInfo();
//        s2.printInfo();

        // Now calling through parametrized constructor
        Student ss1 = new Student("Sandeep",23);
        Student sr1 = new Student("Tanishq",2);
        ss1.printInfo();
        sr1.printInfo();






    }

}
