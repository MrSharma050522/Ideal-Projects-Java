package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Comparators {
    static class UserInfo{
        int userId;
        String userName ;
        public UserInfo(int userId,String userName){
            this.userId = userId;
            this.userName = userName;
        }
        public String getName(){
            return this.userName;
        }
        public int getUserID(){
            return this.userId;
        }
        @Override public String toString(){
            return "ID:"+this.userId+"\nName:"+this.userName;
        }
    }
    static class SortByID implements Comparator<UserInfo> {
        @Override public int compare(UserInfo user1, UserInfo user2){
            return user1.getName().charAt(0) - user2.getName().charAt(0) == 0 ? user1.getUserID() - user2.getUserID() : user1.getName().charAt(0) - user2.getName().charAt(0);
        }

    }
    public static void main(String[] args) {
        ArrayList<UserInfo> userDetails = new ArrayList<>();
        userDetails.add(new UserInfo(7,"Himanshu"));
        userDetails.add(new UserInfo(5,"Sandeep"));
        userDetails.add(new UserInfo(8,"Rahul"));
        userDetails.add(new UserInfo(6,"Raj"));
        userDetails.add(new UserInfo(9,"Mohit"));
        userDetails.add(new UserInfo(1,"Kailash"));
        userDetails.add(new UserInfo(4,"Suresh"));
        userDetails.add(new UserInfo(3,"Kamlesh"));

        Iterator<UserInfo> userDetailsITR = userDetails.iterator();
        System.out.println("Before sort :");
        while(userDetailsITR.hasNext()){
            System.out.println(userDetailsITR.next());
        }

        Collections.sort(userDetails,new SortByID());

        userDetailsITR = userDetails.iterator();
        System.out.println("After sort : ");
        while(userDetailsITR.hasNext()){
            System.out.println(userDetailsITR.next());
        }
    }
}
