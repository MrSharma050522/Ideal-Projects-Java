import java.util.ArrayList;

public class Sarang {
    static class Pair {
        String fruit;
        int price ;
        int profit;

        Pair (String fruit , int price , int profit){
            this.fruit = fruit;
            this.price = price;
            this.profit = profit;
        }
    }
    static class Profit {
        String str1;
        String str2;
        int profit ;
        Profit (String str1 , String str2,int profit){
            this.str1 = str1;
            this.str2 = str2;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        String [] a = {"banana","mango","apple","pineapple"};
        int[] b = {6,4,7,3};
        int[] c = {8,3,9,1};
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            list.add(new Pair(a[i],b[i],c[i]));
        }

//        for(Pair p : list){
//            System.out.println(p.fruit+" "+p.price+" "+p.profit);
//        }
        ArrayList<Profit>  list2 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                Pair p1 = list.get(i);
                Pair p2= list.get(j);
                if(p1.price + p2.price == 10){
                    list2.add(new Profit(p1.fruit,p2.fruit,p1.profit+p2.profit));
                }
            }
        }
        Profit result = new Profit("","",0);
        for(Profit p : list2){
            if(result.profit < p.profit)
            result = p;

        }
        System.out.println(result.str1+" "+result.str2);

    }

}
