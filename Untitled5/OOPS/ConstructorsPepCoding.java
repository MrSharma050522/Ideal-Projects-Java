package OOPS;

class  Person1{
    String name ;
    int age ;

    void saysHii(){
        System.out.println(this.name +" whose age is  " +  this.age+ " says Hii ");
    }
    // if we forget, java provides our class a default constructor ;
    Person1(){
        // constructor
        // which java provides is a non parametrized constructor
    }
    // parametrized
    Person1(int age , String name ){
        this.name = name ;
        this.age =  age;
    }
    // When we provide our own parametrized constructor then java removes its default constructor
    // and we have to provide the default by ourselves like in line 12
    // otherwise it will show error for person p1

    // 1. when we do use new keyword first work is memory allocation
    // 2. parsing - the code which is outside the function in the person class is fires and
    //    the value are set default as 0 for int and null for string
    // 3. constructor fires - same name as class
    //                      - called by new keyword OR fires when a new keyword is used
    //                      - default is used when we forget to add constructor
    //                      - and this "this.age"  is fired automatically and in this memory address is stored
    //                        and at that address our parameter is set
    //                      - since constructor does not return anything this keyword return the address to person p2
    //                        at which address our parameter is set


}
public class ConstructorsPepCoding {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "Shubham";
        p1.age = 27;
        p1.saysHii();

        Person1 p2 = new Person1(30,"Abhishek");
        p2.saysHii();
    }
}
