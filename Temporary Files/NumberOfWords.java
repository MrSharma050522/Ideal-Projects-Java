public class NumberOfWords {

    public static void main(String[] args) {
        String str = "tiramisplayinginthehouseoftiramwiththetramram";
        String str1 = "Ram";
        int i = 0;
        int count = 0 ;
        while(i < str.length()){
            if( Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(str1.charAt(0))){
                i++;
                boolean check = true;
                for(int k=1;k<str1.length();k++){
                    if(Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(str1.charAt(k))){
                        i++;
                    }else {
                        i++;
                        check = false;
                    }
                }
                if(check){
                    count++;
                }
            }else {
                i++;
            }
        }
        System.out.println(count);

    }
}
