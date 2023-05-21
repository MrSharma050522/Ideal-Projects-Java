package Graphs_Pepcoding;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class SpreadOfInfection {
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
        int time;

        Pair (int x, int time ){
            this.x = x;
            this.time = time;
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
        int time = s.nextInt();
        int[] visited = new int[vertices];
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src,1));
        int count = 0;

        while (q.size() > 0 ){
            Pair rem = q.removeFirst();
            if(visited[rem.x] > 0){
                continue;
            }
            visited[rem.x] = rem.time;
            if(rem.time > time){
                break;
            }
            count++;
            for(Edge edge : graphs[rem.x]){
                if(visited[edge.v] == 0){
                    q.add(new Pair(edge.v,rem.time+1));
                }
            }
        }
        System.out.println(count);


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
6
3
 */
