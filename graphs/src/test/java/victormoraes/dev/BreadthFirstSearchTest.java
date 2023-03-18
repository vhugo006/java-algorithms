package victormoraes.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BreadthFirstSearchTest {

    BreadthFirstSearch searchEngine = new BreadthFirstSearch();

    @Test
    public void givenAGraphWithOneVertexShouldReturnAZeroString() {
        Graph graph = new Graph(1);
        assertEquals("0", searchEngine.breadthFirstSearch(graph));
    }

    @Test
    public void givenAGraphWithTwoVerticesAndTwoEdgesShouldReturnTheRightString() {
        Graph graph = new Graph(2);
        graph.addEdge(0, 1);
        assertEquals("01", searchEngine.breadthFirstSearch(graph));
    }

    @Test
    public void givenAGraphWithThreeVerticesAndTwoEdgesShouldReturnTheRightString() {
        Graph graph = new Graph(2);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        assertEquals("012", searchEngine.breadthFirstSearch(graph));
    }

    @Test
    public void givenAGraphWithFiveVerticesAndFourEdgesShouldReturnTheRightString() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        assertEquals("01234", searchEngine.breadthFirstSearch(graph));
    }


}