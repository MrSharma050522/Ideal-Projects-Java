package Graphs_Pepcoding;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrimsAlgorithm {
    static class Edge {
        int u ;
        int v ;
        int w ;

        Edge (int u , int v , int w ){
            this.u = u ;
            this.v = v ;
            this.w = w ;
        }
    }
    static class Pair implements Comparable<Pair>{
        int x ;
        int av ;
        int wt ;
        Pair (int x , int av , int wt ){
            this.x = x ;
            this.av = av;
            this.wt = wt;
        }
        public int compareTo(Pair o ){
            return this.wt - o.wt;
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

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,-1,0) );
        boolean[]  visited = new boolean[vertices];

        while(pq.size() > 0){
            Pair rem = pq.remove();

            if(visited[rem.x]){
                continue;
            }
            visited[rem.x] = true;

            if(rem.av != -1){
                System.out.println("["+ rem.av+" - "+rem.x+" @ "+rem.wt +"]");
            }
            for(Edge edge : graphs[rem.x]){
                if(!visited[edge.v]){
                    pq.add(new Pair(edge.v, rem.x, edge.w));
                }
            }
        }
    }
}
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
 */
/*
7
8
0 1 10
1 2 10
2 3 10
0 3 5
3 4 2
4 5 3
5 6 3
4 6 8
 */
