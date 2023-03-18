package victormoraes.dev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GraphTest {
    private Graph graph;

    @BeforeEach
    public void setUp() {
        graph = new Graph(5);
    }

    @Test
    public void testAddEdge() {
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        assertEquals(1, graph.getAdjacencies()[0].get(0));
        assertEquals(4, graph.getAdjacencies()[0].get(1));
        assertEquals(2, graph.getAdjacencies()[1].get(0));
        assertEquals(3, graph.getAdjacencies()[2].get(0));
        assertEquals(4, graph.getAdjacencies()[3].get(0));
    }

    @Test
    public void testGetVertices() {
        assertEquals(5, graph.getVertices());
    }

    @Test
    public void testGetAdjacencies() {
        assertNotNull(graph.getAdjacencies());
        assertEquals(5, graph.getAdjacencies().length);
    }
}