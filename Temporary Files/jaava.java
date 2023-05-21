import java.util.HashSet;

public class jaava {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(54);
        hs.add(12);
        hs.add(156);
        hs.add(14);
        hs.add(17);
        if(!hs.contains(13)){
            System.out.println("lukesh ka taka bhida h usske sath ");
        } else {
            System.out.println("Mai to single hi marunga");
        }
        if(!hs.contains(12)){
            System.out.println("lukesh ka taka bhida h usske sath ");
        } else {
            System.out.println("Mai to single hi marunga");
        }
    }
}
