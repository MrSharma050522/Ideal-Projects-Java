package Graphs_Pepcoding;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DijkstraAlgorithm {
    static class Edge{
        int u ;
        int v ;
        int w ;

        Edge(int u, int v , int w ){
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
    static class Pair implements Comparable<Pair> {
        int x ;
        String psf ;
        int wsf ;

        Pair(int x, String psf , int wsf){
            this.x = x ;
            this.psf = psf;
            this.wsf = wsf;
        }
        public int compareTo(Pair o){
            return this.wsf - o.wsf;
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
        int src = s.nextInt();

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,src+"",0));
        boolean[] visited = new boolean[vertices];
        while (pq.size() > 0){
            Pair rem = pq.remove();
            if(visited[rem.x] ){
                continue;
            }
            visited[rem.x] = true;
            System.out.println(rem.x +" via " + rem.psf + " @ " + rem.wsf);

            for(Edge edge : graphs[rem.x]){
                if(!visited[edge.v]){
                    pq.add(new Pair(edge.v, rem.psf+edge.v, rem.wsf+edge.w ));
                }
            }
        }
    }
}
/*
7
9
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
2 5 5
0
 */
