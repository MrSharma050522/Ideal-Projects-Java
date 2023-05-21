package Graphs_Pepcoding;

import java.util.ArrayList;

public class Graph {
    static class Edge{
        int u ;
        int v ;
        int w ;

        Edge(int u , int v , int w ){
            this.u = u ;
            this.v = v ;
            this.w = w ;
        }
    }
    public  static void print(ArrayList[] arr){
        for (int i=0 ;i<arr.length;i++){
            for(int j = 0 ;j<arr[i].size();j++){
                System.out.println(arr[i].get(j));
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 7;
        ArrayList<Edge>[] graphs = new ArrayList[vertices];
        for(int i = 0 ;i<vertices;i++){
            graphs[i] = new ArrayList<>();
        }
        graphs[0].add(new Edge(0,3,40));
        graphs[0].add(new Edge(0,1,10));

        graphs[1].add(new Edge(1,0,10));
        graphs[1].add(new Edge(1,2,10));

        graphs[2].add(new Edge(2,1,10));
        graphs[2].add(new Edge(2,3,10));

        graphs[3].add(new Edge(3,0,40));
        graphs[3].add(new Edge(3,2,10));
        graphs[3].add(new Edge(3,4,2));

        graphs[4].add(new Edge(4,3,2));
        graphs[4].add(new Edge(4,5,3));
        graphs[4].add(new Edge(4,6,8));

        graphs[5].add(new Edge(5,4,3));
        graphs[5].add(new Edge(5,6,3));

        graphs[6].add(new Edge(6,5,3));
        graphs[6].add(new Edge(6,4,8));

        print(graphs);
    }
}
