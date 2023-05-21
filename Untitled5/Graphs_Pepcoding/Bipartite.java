package Graphs_Pepcoding;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bipartite {
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

        int level ;

        Pair (int x, String psf , int level ){
            this.x = x;
            this.psf = psf;
            this.level = level;
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
        int[] visited = new int[vertices];
        Arrays.fill(visited,-1);
        for(int i=0;i<vertices;i++){
            if(visited[i] != -1){
                boolean isBipartite = checkComponentForBipartite(graphs,i,visited);
                if (!isBipartite) {
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");

    }
    public static boolean checkComponentForBipartite(ArrayList<Edge>[] graph , int src, int[] visited){
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src,src+"",0));

        while (q.size() > 0){
            Pair rem = q.removeFirst();

            if(visited[rem.x] != -1){
                if(rem.level != visited[rem.x]){
                    return false;
                }
            } else{
                visited[rem.x] = rem.level;
            }

            for(Edge edge : graph[rem.x]){
                if(visited[edge.v] != -1){
                    q.add(new Pair(edge.v,rem.psf+edge.v,rem.level+1));
                }
            }
        }
        return true;
    }
}
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
 */
