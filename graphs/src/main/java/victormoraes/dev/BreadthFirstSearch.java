package victormoraes.dev;

import java.util.LinkedList;

public class BreadthFirstSearch {

    public String breadthFirstSearch(Graph graph) {

        if (graph.getVertices() == 1) {
            return "0";
        }

        StringBuilder builder = new StringBuilder();

        LinkedList<Integer>[] adjacencies = graph.getAdjacencies();
        builder.append("0");

        for (int i = 0; i < graph.getVertices() - 1; i++) {
            if (adjacencies[i].size() > 0) {
                for (int j = 0; j < adjacencies[i].size(); j++) {
                    builder.append(adjacencies[i].get(j));
                }
            }
        }
        return builder.toString();
    }
}