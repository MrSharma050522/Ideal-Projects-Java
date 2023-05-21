package Strings;

public class StringBuilders {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Tony");
//        System.out.println(sb);
//
//        // char At index 0
//        System.out.println(sb.charAt(0));
//
//        // set char at index 0
//        sb.setCharAt(0,'P');
//        System.out.println(sb);
//
//        // inserting character
//        sb.insert(0,'S');
//        System.out.println(sb);
//
//        // deleting char
//        sb.delete(2,3);
//        System.out.println(sb);

//        StringBuilder sb = new StringBuilder("h");
//
//        //append means last me jod dena
//        sb.append("e"); // str = str+"e";
//        sb.append("l"); // str = str + "l";
//        sb.append("l");
//        sb.append("o");
//        System.out.println(sb);
//
//        // length of string in string builder
//        System.out.println(sb.length());

        // Reversing a string
        StringBuilder sb = new StringBuilder("sandeep sharma ");
        for (int i = 0; i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);

        String s1 ="Geeks";
        String s2 =" for Geeks";
        String output = s1.concat(s2);
        System.out.println(output);



    }
}
