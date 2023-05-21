package OOPS;

class  Person{
    String name ;
    int age ;

    void saysHii(){
        System.out.println(this.name +" whose age is  " +  this.age+ " says Hii ");
    }
}
public class ObjectClassPepCoding {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Sandeep";
        p1.age = 22;
//        p1.saysHii();

        Person p2 = new Person();
        p2.name = "Sachin";
        p2.age = 50;
//        p2.saysHii();

//        Person p3 = p1;
//        p3.age = 34;
//        p3.saysHii();
//        p1.saysHii();
        // Here instance are 2 only p1 and p2 but the reference is 3
        // since p3 is referencing to same address of p1;



        p1.saysHii();
        p2.saysHii();
        swap1(p1,p2);
        p1.saysHii();
        p2.saysHii();


    }
    // Swap Game 1 :
    public static void  swap1(Person psn1 , Person psn2){
        Person temp = psn1;
        psn1 = psn2;
        psn2 = temp;
    }


    // Swap Game 2 :
    public static void swap2(Person ps1 , Person ps2){
        int age = ps1.age ;
        ps1.age = ps2.age ;
        ps2.age = age ;

        String name = ps1.name ;
        ps1.name = ps2.name ;
        ps2.name = name ;
    }
    // Swap Game 3 :
    public static void swap3(Person ps1 , Person ps2){
//        ps1 = new Person();


        int age = ps1.age ;
        ps1.age = ps2.age ;
        ps2.age = age ;


//        ps2 = new Person();


        String name = ps1.name ;
        ps1.name = ps2.name ;
        ps2.name = name ;
    }

}
