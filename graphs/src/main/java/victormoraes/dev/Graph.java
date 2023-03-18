package victormoraes.dev;

import java.util.LinkedList;

/*
* This is a class definition for a simple directed graph data structure, where the edges only go in one direction
* from a source vertex to a destination vertex.
* */
public class Graph {

    private final int vertices;

    /*
    * An array of linked lists to represent the adjacencies for each vertex
    * */
    private final LinkedList<Integer>[] adjacencyList;

    public Graph(int vertices) {
        if(vertices < 1){
            throw new IllegalArgumentException("A graph must have at least one vertex");
        }

        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public int getVertices() {
        return this.vertices;
    }

    public LinkedList<Integer>[] getAdjacencies() {
        return this.adjacencyList;
    }


}
