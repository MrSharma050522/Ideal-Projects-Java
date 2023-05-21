package Graphs_Pepcoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HamiltonianPathAndCycle {
    static class Edge{
        int u ;
        int v ;
        int w ;

        Edge(int u, int v , int w){
            this.u = u;
            this.v = v;
            this.w = w;

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vertices = s.nextInt();
        ArrayList<Edge>[] graphs = new ArrayList[vertices];
        for(int i=0;i<vertices;i++){
            graphs[i] = new ArrayList<>();
        }
        int edge = s.nextInt();
        for(int i=0 ;i<edge;i++){
            int u = s.nextInt();
            int v = s.nextInt();
            int w = s.nextInt();

            graphs[u].add(new Edge(u,v,w));
            graphs[v].add(new Edge(v,u,w));
        }

        int src = s.nextInt();

        HashSet<Integer> visited = new HashSet<>();
        hamiltonian(graphs,src,visited,src+"",src);
    }
    public static void hamiltonian(ArrayList<Edge>[] graphs,int src, HashSet<Integer> visited, String psf , int oSrc){
        if(visited.size() == graphs.length-1 ){
            System.out.print(psf);

            boolean closingEdgeFound = false;
            for(Edge e : graphs[src]){
                if(e.v == oSrc){
                    closingEdgeFound = true;
                    break;
                }
            }
            if(closingEdgeFound){
                System.out.println("*");
            }else{
                System.out.println(".");
            }
            return;
        }
        visited.add(src);
        for(Edge edge : graphs[src]){
            if(!visited.contains(edge.v)){
                hamiltonian(graphs, edge.v,visited,psf+edge.v,oSrc);
            }
        }
        visited.remove(src);
    }
}
/*
7
9
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
2 5 10
0


6 5
1 2 1
2 3 1
3 4 1
2 5 1
5 6 1
0
 */
