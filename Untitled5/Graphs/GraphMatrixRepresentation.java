package Graphs;

public class GraphMatrixRepresentation {
    static class Graph{
        int n ;
        int[][] matrix ;
        Graph(int n ){
            this.n =  n ;
            matrix = new int[n][n];
        }
        public void add(int u , int v){
            matrix[u-1][v-1] = 1;
            matrix[v-1][u-1] = 1;
        }
        public void print(){
            for(int i = 0 ;i<n;i++){
//                System.out.print(i+1+"->");
                for(int j = 0 ;j<n;j++){
                    System.out.print(matrix[i][j]+" ");
                }System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.add(1, 2);
        graph.add(1, 3);
        graph.add(2, 4);
        graph.add(4, 5);
        graph.add(5, 3);
        graph.add(1, 4);

        graph.print();
    }
}
