package Graphs;

import java.util.ArrayList;

class Graph {
    int n;
    ArrayList<Integer> adjList[];

    Graph(int n) {
        this.n = n;
        adjList = new ArrayList[n];

        for(int i = 0; i < n; ++i) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void add(int u, int v) {
        adjList[u-1].add(v-1);
        adjList[v-1].add(u-1);
    }

    public void doDFS(int ind) {
        boolean vis[] = new boolean[n];

        dfs(ind-1, vis);
    }

    private void dfs(int u, boolean vis[]) {
        if(vis[u])
            return;

        System.out.println("Visiting node " + (u+1));

        vis[u] = true;

        for(Integer v: adjList[u])
            if(!vis[v])
                dfs(v, vis);
    }

    public void print() {
        for(int i = 0; i < n; ++i) {
            System.out.print(i+1 + " -> ");

            for(Integer x: adjList[i])
                System.out.print(x+1 + " ");

            System.out.println();
        }
    }
}


public class GraphDFS {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.add(1, 2);
        g.add(1, 3);
        g.add(2, 4);
        g.add(4, 5);
        g.add(5, 3);
        g.add(1, 4);

        g.print();

        g.doDFS(2);
    }
}
