package Graphs_Pepcoding;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AllPathsGraphs {
    static  class Edge{
        int u ;
        int v ;
        int w ;

        Edge(int u , int v , int w ){
            this.u = u ;
            this.v = v ;
            this.w = w ;
        }
    }
    static class Pair implements Comparable<Pair> {
        int wsf ;
        String psf ;

        Pair (int wsf, String psf){
            this.wsf = wsf;
            this.psf = psf;
        }
        public  int compareTo(Pair o){
            return this.wsf - o.wsf;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vertices = s.nextInt();
        ArrayList<Edge>[] graphs = new ArrayList[vertices];

        for(int i=0 ;i<vertices;i++){
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
        int dest = s.nextInt();
        int criteria = s.nextInt();
        int k = s.nextInt();

        boolean[] visited = new boolean[vertices];
        multiSolver(graphs,src,dest,visited,criteria,k,src+"",0);
        System.out.println("Smallest Path "+sPath+" @ "+sPathW);
        System.out.println("Largest Path "+lPath+" @ "+lPathW);
        System.out.println("Just Larger Path than "+criteria+" = "+cPath+" @ "+ cPathW);
        System.out.println("Just Smaller Path than "+criteria+" = "+fPath+" @ "+ fPathW);
        System.out.println(k + "th largest Path = "+pq.peek().psf +" @ "+pq.peek().wsf);

    }
    static String sPath;
    static int sPathW = Integer.MAX_VALUE;
    static String lPath;
    static int lPathW = Integer.MIN_VALUE;
    static String cPath;
    static int cPathW = Integer.MAX_VALUE;
    static String fPath;
    static int fPathW = Integer.MIN_VALUE;
    static PriorityQueue<Pair> pq = new PriorityQueue<Pair>();

    public static void multiSolver(ArrayList<Edge>[] graphs , int src , int dest ,
                                   boolean[] visited , int criteria, int k , String psf , int wsf){
        if(src == dest){
            if(wsf < sPathW){
                sPath = psf;
                sPathW = wsf;
            }
            if(wsf > lPathW){
                lPath = psf;
                lPathW = wsf;
            }
            if(wsf > criteria && wsf < cPathW){
                cPath = psf;
                cPathW = wsf;
            }
            if(wsf < criteria && wsf >  fPathW){
                fPath = psf;
                fPathW = wsf;
            }

            if(pq.size() < k ){
                pq.add(new Pair(wsf,psf));

            }else {
                if(wsf < pq.peek().wsf){
                    pq.remove();
                    pq.add(new Pair(wsf,psf));
                }
            }
            return ;
        }

        visited[src] = true ;
        for( Edge edge : graphs[src]){
            if(!visited[edge.v]){
                multiSolver(graphs,edge.v,dest,visited,criteria,k,psf+edge.v,wsf+edge.w);
            }
        }
        visited[src] = false ;
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
0
6
40
3
 */
