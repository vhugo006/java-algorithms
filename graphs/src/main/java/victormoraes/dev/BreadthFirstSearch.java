package victormoraes.dev;

import static java.util.Objects.nonNull;

/**
 * Breadth First Search (BFS) is a graph traversal algorithm that visits all the vertices of a graph in
 * breadth-first order, i.e., it visits all the nodes at each level of a graph before moving on to the next level.
 * <p>
 * The BFS algorithm starts at a given vertex and explores all the vertices that can be reached from that vertex.
 * It uses a queue data structure to keep track of the vertices that need to be explored next.
 */
public class BreadthFirstSearch {

    /**
     * The algorithm works as follows:
     * 1. Start by putting the starting vertex into a queue.
     * 2. While the queue is not empty, do the following:
     * 2.1. Take the next vertex from the queue.
     * 2.2. Visit the vertex (i.e., process it in some way, e.g., print its value).
     * 2.3. Add all the adjacent vertices that have not been visited yet to the queue.
     * 3. Continue until the queue is empty.
     */
    public String bfs(Graph graph) {

        StringBuilder resultBuilder = new StringBuilder();

        if (graph.getVertices() < 1) {
            return resultBuilder.toString();
        }

        boolean[] visited = new boolean[graph.getVertices()];

        for (int i = 0; i < graph.getVertices(); i++) {

            if (!visited[i]) {
                resultBuilder.append(bfsVisit(graph, i, visited));
            }
        }
        return resultBuilder.toString();
    }

    private String bfsVisit(Graph graph, int source, boolean[] visited) {

        StringBuilder result = new StringBuilder();

        Queue<Integer> queue = new Queue<>(graph.getVertices());
        queue.enqueue(source);
        visited[source] = true;

        while (!queue.isEmpty()) {

            int currentVertice = queue.dequeue();
            result.append(currentVertice);

            DoublyLinkedList<Integer>.Node tmpNode = null;
            if (nonNull(graph.getAdjacencies()[currentVertice])) {
                tmpNode = graph.getAdjacencies()[currentVertice].headNode;
            }

            while (nonNull(tmpNode)) {

                if (!visited[tmpNode.data]) {
                    queue.enqueue(tmpNode.data);
                    visited[tmpNode.data] = true;
                }

                tmpNode = tmpNode.nextNode;
            }
        }
        return result.toString();
    }
}