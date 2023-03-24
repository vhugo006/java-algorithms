package victormoraes.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepthFirstSearchTest {

    private final DepthFirstSearch search = new DepthFirstSearch();

    @Test
    public void givenAGraphWithFiveVerticesAndFourEdgesShouldReturnAValidOutput() {

        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        assertEquals("01234", search.dfs(graph));
    }

    @Test
    public void givenAGraphWithFourVerticesAndOneEdgeShouldReturnAValidOutput() {

        Graph graph = new Graph(4);
        graph.addEdge(0, 3);

        assertEquals("0312", search.dfs(graph));
    }

    @Test
    public void givenAGraphWithFourVerticesAndTwoEdgesShouldReturnAValidOutput() {

        Graph graph = new Graph(4);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);

        assertEquals("0213", search.dfs(graph));
    }

    @Test
    public void givenAGraphWithFiveVerticesAndThreeEdgesShouldReturnAValidOutput() {

        Graph graph = new Graph(5);
        graph.addEdge(0, 2);
        graph.addEdge(0, 1);
        graph.addEdge(2, 4);

        assertEquals("01243", search.dfs(graph));
    }
}