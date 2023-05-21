package Graphs_Pepcoding;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class CycleInGraph {
    static class Edge {
        int u ;
        int v ;
        int w ;

        Edge(int u ,int v , int w){
            this.u = u ;
            this.v = v;
            this.w = w;
        }
    }
    static class Pair {
        int x ;
        String psf ;

        Pair (int x, String psf ){
            this.x = x;
            this.psf = psf;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vertices = s.nextInt();
        ArrayList<Edge>[] graphs = new ArrayList[vertices];
        for(int i=0;i<vertices;i++){
            graphs[i] = new ArrayList<>();
        }
        int edges = s.nextInt();
        for(int i=0;i<edges;i++){
            int u = s.nextInt();
            int v = s.nextInt();
            int w = s.nextInt();

            graphs[u].add(new Edge(u,v,w));
            graphs[v].add(new Edge(v,u,w));
        }
        boolean[] visited = new boolean[vertices];
        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                boolean cycle = isCyclic(graphs,i,visited);
                if (cycle) {
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("False");

    }
    public static boolean isCyclic(ArrayList<Edge>[] graph , int src , boolean[] visited){
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src,src+""));

        while(queue.size() > 0 ){
            Pair rem = queue.removeFirst();

            if(visited[rem.x]){
                return true;
            }
            visited[rem.x] = true;

            for(Edge edge:graph[rem.x]){
                if(!visited[edge.v]){
                    queue.add(new Pair(edge.v,rem.psf+edge.v));
                }
            }
        }
        return false;
    }
}
/*
7
6
0 1 10
1 2 10
2 3 10
3 4 10
4 5 10
5 6 10
2

False
 */
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
6

True
 */
