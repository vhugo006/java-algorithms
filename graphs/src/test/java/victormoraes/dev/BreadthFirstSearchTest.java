package victormoraes.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BreadthFirstSearchTest {

    BreadthFirstSearch searchEngine = new BreadthFirstSearch();

    @Test
    public void givenAGraphWithOneVertexShouldReturnAZeroString() {
        Graph graph = new Graph(1);
        assertEquals("0", searchEngine.bfs(graph));
    }

    @Test
    public void givenAGraphWithTwoVerticesAndAEdgesShouldReturnRightString() {
        Graph graph = new Graph(2);
        graph.addEdge(0, 1);
        assertEquals("01", searchEngine.bfs(graph));
    }

    @Test
    public void givenAGraphWithFiveVerticesShouldReturnRightString() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        assertEquals("0134", searchEngine.bfs(graph));
    }

    @Test
    public void givenAGraphWithTwoVerticesAndTwoEdgesShouldReturnTheRightString() {
        Graph graph = new Graph(2);
        graph.addEdge(0, 1);
        assertEquals("01", searchEngine.bfs(graph));
    }

    @Test
    public void givenAGraphWithThreeVerticesAndTwoEdgesShouldReturnTheRightString() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2,4);
        graph.addEdge(2,3);
        assertEquals("01243", searchEngine.bfs(graph));
    }

    @Test
    public void givenAGraphWithFiveVerticesAndFourEdgesShouldReturnTheRightString() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        assertEquals("01234", searchEngine.bfs(graph));
    }
}