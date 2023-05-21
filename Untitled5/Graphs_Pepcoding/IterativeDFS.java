package Graphs_Pepcoding;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class IterativeDFS {
    static class Edge{
        int u ;
        int v;
        int w;

        Edge(int u, int v, int w ){
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
    static class Pair {
        int x ;
        String psf ;

        Pair(int x, String psf ){
            this.x = x ;
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
        for (int i=0;i<edges;i++){
            int u = s.nextInt();
            int v = s.nextInt();
            int w= s.nextInt();

            graphs[u].add(new Edge(u,v,w));
            graphs[v].add(new Edge(v,u,w));
        }
        int src = s.nextInt();
        boolean[] visited = new boolean[vertices];
        Stack<Pair> st = new Stack<>();
        st.add(new Pair(src,src+""));
        while(st.size() > 0 ){
            Pair rem = st.pop();

            if(visited[rem.x]){
                continue;
            }
            visited[rem.x] = true;
            System.out.println(rem.x +" @ " + rem.psf);

            for(Edge edge:graphs[rem.x]){
                if(!visited[edge.v]){
                    st.add(new Pair(edge.v,rem.psf+edge.v));
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
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
2
 */
