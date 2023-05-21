package Graphs_Pepcoding;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/*
TOPOLOGICAL SORT :
    A permutation of vertices for a directed acyclic graph is called topological sort if all directed
    edges uv, u appears before v in the graphs

    0->3<-4
       ^
    |  |  |\
    v  |  v v
    1->2  5 6

 */

public class TopologicalSort {
    static class Edge{
        int u ;
        int v ;

        Edge(int u, int v ){
            this.u = u ;
            this.v = v;
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
            graphs[u].add(new Edge(u,v));
        }
        boolean[] visited = new boolean[vertices];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                topologicalSort(graphs,i,visited,st);
            }
        }

        while (!st.isEmpty()){
            System.out.println(st.pop());
        }

    }
    public static void topologicalSort(ArrayList<Edge>[] graph , int src , boolean[] visited , Stack<Integer> st ){

        visited[src] = true;
        for(Edge edge : graph[src]){
            if(!visited[edge.v]){
                topologicalSort(graph,edge.v,visited,st);

            }

        }
        st.add(src);
    }
}
/*
7
7
0 1
1 2
2 3
0 3
4 5
5 6
4 6
 */
