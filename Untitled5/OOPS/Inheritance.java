package OOPS;

/*
Inheritance is a process in which one object acquires all the properties and
behaviors amd methods  of its parent object automatically. In such a way, you can reuse,
extend or modify the attributes and behaviors which are defined in other
classes

1. Single level inheritance - derived class acquires the properties of parent class , here derived is Triangle and parent is Shape
                                (When one class inherits another class, it is known as single level inheritance )

2. Multi level  - here parent  class's properties are inherited by other and other's class property are inherited  by derived class
                 ( Multilevel inheritance is a process of deriving a class from another derived class.)

3. Hierarchical inheritance - : Hierarchical inheritance is defined as the process of deriving more than one class from a base class.
 */
class Shape {
    String color ;
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    // This is single level inheritance
    public void area(int l , int h ){
        System.out.println((l*h)/2+" Triangle "+this.color);
    }
}
class Circle {
    String color ;
    public void area(int r ){
        System.out.println((3.14)*r*r+" Circle "+this.color);
    }
}
class EquilateralTriangle extends Triangle{
    // This is multilevel inheritance
    public void printHii(){
        System.out.print(this.color);
    }

    public void area(int l ){
        System.out.println((l*20)/2+" EquilateralTriangle "+this.color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Circle t1 = new Circle();
        t1.color = "red";
        t1.area(2);
        Triangle t2 = new Triangle();
        t2.color = "blue";
        t2.area(5,10);
        EquilateralTriangle t3 = new EquilateralTriangle();
        t3.color = "green";
        t3.area(10,30);
        t3.printHii();
    }
}
