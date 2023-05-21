package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphDFS_BFS_Practice {
    static class Graph{
        int n ;
        ArrayList<Integer> adjList[];

        Graph(int  n){
            this.n = n ;
            adjList = new ArrayList[n];

            for(int i =0;i<n;i++){
                adjList[i] = new ArrayList<>();
            }
        }
        public void add(int u , int v){
            adjList[u-1].add(v-1);
            adjList[v-1].add(u-1);
        }
        public void dfs(int idx){
            boolean[] vis = new boolean[n];
            DFS(idx,vis);
        }
        private void DFS(int i , boolean[] vis ){
            if(vis[i])
                return;
            System.out.println("Visiting Node : "+(i+1));
            vis[i] = true;
            for(Integer x : adjList[i])
                if(!vis[x])
                    DFS(x,vis);
        }
        public void BFS(int idx){
            boolean[] vis = new boolean[n];
            LinkedList<Integer> q = new LinkedList<>();
            int a = 0;
            vis[idx] = true;
            q.add(idx);
            while(q.size() != 0){
                idx = q.poll();
                System.out.print("Visiting Node : " +(idx+1));

                for(int i=0;i<adjList[idx].size();i++){
                    a = adjList[idx].get(i);
                    if(!vis[a]){
                        vis[a] = true;
                        q.add(a);
                    }
                }
                System.out.println();
            }

        }

        public void print(){
            for(int i=0;i<n;i++){
                System.out.print(i+1 +"->");
                for(Integer x : adjList[i]){
                    System.out.print(x+1+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.add(1, 2);
        graph.add(1, 3);
        graph.add(2, 4);
        graph.add(4, 5);
        graph.add(5, 3);
        graph.add(1, 4);
        graph.add(1,6);


        graph.print();

//        graph.dfs(2);
        graph.BFS(2);
    }
}
