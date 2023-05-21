package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // String declration

//        String name = "Sandeep ";
//        String fullName = "Sandeep Sharma ";
//        String sentence = "I am big fan of Tony Stark.";
//        // Taking input from the user for String
//        String names = s.nextLine();
//        System.out.println("Your name is :"+names);

        // concatenation  ~ joining two strings
//        String firstName = "Sandeep";
//        String lastName = "Sharma";
//        String fullName = firstName+" "+lastName;
//        System.out.println(fullName);

        // length of string
//        System.out.println(fullName.length());
//        //printing the every single character of string - charAt()
//        for (int i = 0 ;i<fullName.length();i++){
//            System.out.println(fullName.charAt(i)+" ");
//        }

        // comparing the string
        String name1= "tony";
        String name2 = "tony";
        // 1.s1 > s2 : +ve value
        // 2.s1 == s2 : 0
        //3.s1 < s2 : -ve value

//        if (name1.compareTo(name2)==0){
//            System.out.println("Strings are equal ");
//        } else {
//            System.out.println("Strings are not equal");
//        }

//        if (name1==name2){
//            System.out.println("Strings are equal ");
//        } else {
//            System.out.println("Strings are not equal");
//        }

//        if (new String("tony")==new String("tony")){
//            System.out.println("Strings are equal ");
//        } else {
//            System.out.println("Strings are not equal");
//        }

//        String sentence = "TonyStark ";
//        String name = sentence.substring(4);
//        System.out.println(name);

        // Strings are not immutable means you cannot modify the string .

        // Parse int method of integer of class
//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);

        // To String method of integer class
//        int number = 1234;
//        String str = Integer.toString(number);
//        System.out.println(str);
        // ALWAYS REMEMBER : Java Strings are Immutable.

        /*
        1.Take an array of Strings input from the user & find
        the cumulative (combined) length of all those strings.
         */
//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
//        String[] str = new String[size];
//        int totalLength = 0 ;
//        for (int i = 0 ;i<size ;i++){
//            str[i] = s.nextLine();
//            totalLength += str[i].length();
//        }
//        System.out.println(totalLength);

        /*
        2.Input a string from the user. Create a new string called
        ‘result’ in which you will replace the letter ‘e’ in the original
        string with letter ‘i’.
        Example :
        original = “eabcdef’ ; result = “iabcdif”
        Original = “xyz” ; result = “xyz”
         */
//        Scanner s = new Scanner(System.in);
//        String original = s.nextLine();
//        String result = "";
//        System.out.println(original);
//        for (int i =0 ;i<original.length();i++) {
//            if(original.charAt(i)=='e') {
//                result += 'i';
//            } else{
//                result +=original.charAt(i);
//            }
//        }
//        System.out.println(result);

        /*
       3.Input an email from the user. You have to create a
        username from the email by deleting the part that comes after ‘@’.
         Display that username to the user.
        Example :
        email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        email = “helloWorld123@gmail.com”; username = “helloWorld123”
         */
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();
        String userName = "";
        for(int i = 0 ;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);

    }
}
