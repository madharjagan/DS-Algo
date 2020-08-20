package me.learning.educative.dsalgo.graph;

public class CheckBFSClient {

	public static void main(String[] args) {
		Graph g= new Graph(8);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        //g.addEdge(0, 7);
        g.addEdge(1, 3);
        //g.addEdge(1, 6);
        g.addEdge(2, 3);
        //g.addEdge(2, 5);
        g.addEdge(3, 0);
       // g.addEdge(3, 4);

        g.printGraph();
        
        System.out.println(CheckBFS.bfs(g));
	}

}
