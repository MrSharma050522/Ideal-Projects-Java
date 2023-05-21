package Graphs_Pepcoding;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectFriends {
    static class Edge{
        int u ;
        int v ;

        Edge(int u, int v){
            this.u = u ;
            this.v = v ;
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

            graphs[u].add(new Edge(u,v));
            graphs[v].add(new Edge(v,u));
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

        int pairs = 0 ;
        for(int i =0 ;i<comps.size();i++){
            for(int j=i+1;j< comps.size();j++){
                int count = comps.get(i).size() * comps.get(j).size();
                pairs += count;
            }
        }
        System.out.println(pairs);
    }
    public static void findConnectedComponents(ArrayList<Edge>[] graphs , int src, ArrayList<Integer> comp , boolean[] visited){
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
0 1
2 3
4 5
5 6
4 6

 */