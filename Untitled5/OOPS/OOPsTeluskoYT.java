package OOPS;
interface Movable{
    void show();
    void move();
}
class Movable1 implements Movable {
    @Override
    public void show() {}
    @Override
    public void move() {}
}
class  Computer{
    public static Computer getComputer(){
        return new Desktop();
    }
    public void show(){}
}
class Laptop extends Computer {
    public  void show(){
        System.out.println("In laptop, you can carry me ");
    }
    public String show(String overloading){
        return "This is called method overloading where method have same name but" +
                " differ in terms of parameters " +
                "also called the static polymorphism";
    }
}
class Desktop extends Computer{
    public void show(){
        System.out.println("In desktop, you can't carry me ");
    }
}
class Developer{
    private String name;
    private String tech ;
    private int exp;
    private String laptop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    public Developer(String name, String tech, int exp, String laptop) {
        this.name = name;
        this.tech = tech;
        this.exp = exp;
        this.laptop = laptop;
    }

    public void buildProject(){
        System.out.println("In the method "+this.name+" is a developer having knowledge in "+
                this.tech+" uses laptop of "+this.laptop+" with a experience of "+this.exp+" years");
    }

    public String toString(){ // This method will be Overriding the method of parent class - Polymorphism
//        also called dynamic polymorphism
        return "My toString method is called";
    }
}

public class OOPsTeluskoYT {
    public static void main(String[] args) {
//        Developer d1 = new Developer("Sachin","Javascript",2,"Dell");
//        d1.buildProject();
//        Developer d1 = new Developer();
//        d1.setName("Sandeep");
//        d1.setTech("Java");
//        d1.setLaptop("HP");
//        d1.setExp(1);
//        d1.buildProject();
//        System.out.println(d1);
//        System.out.println(d1.getExp());
//        System.out.println(d1.getLaptop());
//        System.out.println(d1.getTech());

//        Computer com = Computer.getComputer();
//        Computer com = new Laptop();
//        com.show();

        final int value  = 7;
//        value++;
        /* Cannot assign a value to final variable "value";
            Making a class final will prohibit other classes to inherit from it
            Making a method final will prohibit other classes to override it
            Making a variable final will prohibit to change its value (it is like constants in javascript*/


        // EXCEPTION HANDLING . . . . .
        // Compile Time Error -> Syntax
        // Runtime Error ->
        // Logical Error -> Where logic is wrong

        String name = null;
        try{
            System.out.println(name.length());
            System.out.println(8/0);
        }catch(ArithmeticException err){
            System.out.print(err+" You can't divide a number by zero");
        }catch (NullPointerException e){
            System.out.println(e+" Null Object");
        }catch (RuntimeException e){
            System.out.println(e);
        }finally {
            System.out.println("Bye");
        }
    }
}
