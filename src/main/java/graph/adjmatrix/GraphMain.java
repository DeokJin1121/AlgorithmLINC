package graph.adjmatrix;

import java.util.ArrayList;

public class GraphMain {
    public static void main(String[] args) {
        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.add(new Node("1", 0));
        nodeList.add(new Node("2", 1));
        nodeList.add(new Node("3", 2));
        nodeList.add(new Node("4", 3));
        nodeList.add(new Node("5", 4));


        Graph g = new Graph(nodeList);
        g.directedEdge('1','2');
        g.directedEdge('1','4');
        g.directedEdge('1','5');
        g.directedEdge('2','3');
        g.directedEdge('2','4');
        g.directedEdge('3','4');
        g.directedEdge('4','5');

        System.out.println(g);
    }
}
