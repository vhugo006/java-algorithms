package victormoraes.dev;

/*
 * This is a class definition for a simple directed graph data structure, where the edges only go in one direction
 * from a source vertex to a destination vertex.
 * */
public class Graph {

    private final int vertices;

    /*
     * An array of linked lists to represent the adjacencies for each vertex
     * */
    private final DoublyLinkedList<Integer>[] adjacencyList;

    public Graph(int vertices) {
        if (vertices < 1) {
            throw new IllegalArgumentException("A graph must have at least one vertex");
        }

        this.vertices = vertices;
        adjacencyList = new DoublyLinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new DoublyLinkedList<>();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int source, int destination) {
        if (destination >= vertices) {
            throw new IllegalArgumentException("The destination parameter must be smaller than graph vertices number");
        }
        adjacencyList[source].insertAtEnd(destination);
    }

    public int getVertices() {
        return this.vertices;
    }

    public DoublyLinkedList<Integer>[] getAdjacencies() {
        return this.adjacencyList;
    }


}
