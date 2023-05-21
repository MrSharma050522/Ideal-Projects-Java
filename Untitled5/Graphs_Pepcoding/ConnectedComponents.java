package Graphs_Pepcoding;

import java.util.ArrayList;
import java.util.Scanner;

public class ConnectedComponents {
    static class Edge{
        int u ;
        int v ;
        int w ;

        Edge(int u, int v, int w ){
            this.u = u ;
            this.v = v ;
            this.w = w ;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vertices = s.nextInt();
        ArrayList<Edge>[] graphs = new ArrayList[vertices];
        for (int i=0 ;i<vertices;i++){
            graphs[i] = new ArrayList<>();
        }
        int edges = s.nextInt();
        for(int i=0 ;i<edges;i++){

            int u = s.nextInt();
            int v = s.nextInt();
            int w = s.nextInt();

            graphs[u].add(new Edge(u,v,w));
            graphs[v].add(new Edge(v,u,w));
        }
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean[] visited = new boolean[vertices];
        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                ArrayList<Integer> comp = new ArrayList<>();
                findConnectedComponents(graphs,i,comp,visited);
                comps.add(comp);
            }
        }
        System.out.println(comps);
        System.out.println(comps.size());
        System.out.println(comps.size() == 1); // This means the graph is connected .
    }
    public static void findConnectedComponents(ArrayList<Edge>[] graphs , int src,ArrayList<Integer> comp , boolean[] visited){
        visited[src] = true;
        comp.add(src);
        for(Edge edge:graphs[src]){
            if(!visited[edge.v]){
                findConnectedComponents(graphs,edge.v,comp,visited);
            }
        }
    }
}
/*
7
5
0 1 10
2 3 10
4 5 10
5 6 10
4 6 10
 */
