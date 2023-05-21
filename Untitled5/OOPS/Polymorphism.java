package OOPS;

class Students {
    String name ;
    int age ;

    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name ){
        System.out.println(name);
    }
    public void printInfo(String name , int age ){
        System.out.println(name+" "+age);
    }
}

/*
Here we are discussing compile time polymorphism
in which we have same name function with different argument and if argument are same we have to choose different
return type and if both argument and return type are same then we have to add different numbers of arguments


 */

public class Polymorphism {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Aman";
        s1.age = 23;
        s1.printInfo(s1.name,s1.age);
    }
}
