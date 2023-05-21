package Graphs_Pepcoding;
import java.util.ArrayList;
import java.util.Scanner;

public class HashPath {
    static class Edge {
        int u ;
        int v ;
        int w ;

        Edge(int u , int v , int w ){
            this.u = u ;
            this.v = v ;
            this.w = w ;
        }
    }

    public static void main(String[] args) throws Exception {
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
        int src = s.nextInt();
        int dest = s.nextInt();

        boolean[] visited = new boolean[vertices];
        boolean path = hasPath(graphs,src,dest,visited);
        System.out.println(path);
    }
    public static boolean hasPath(ArrayList<Edge>[] graph , int src , int dest ,boolean[] visited ){
        if( src == dest ){
            return true;
        }
        visited[src] = true ;
        for(Edge edge : graph[src]){
            if(visited[edge.v] == false){
                boolean hasNbrPath = hasPath(graph,edge.v,dest,visited);
                if(hasNbrPath){
                    return true;
                }
            }
        }

        return false;
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
0
 */
