package victormoraes.dev;

import java.util.Objects;

import static java.util.Objects.nonNull;

public class DepthFirstSearch {

    public String dfs(Graph graph) {

        StringBuilder resultBuilder = new StringBuilder();

        if (graph.getVertices() < 1) {
            return resultBuilder.toString();
        }

        boolean[] visited = new boolean[graph.getVertices()];

        for (int i = 0; i < graph.getVertices(); i++) {
            if (!visited[i]) {
                resultBuilder.append(dfsVisit(graph, i, visited));
            }
        }
        return resultBuilder.toString();
    }

    public String dfsVisit(Graph graph, int source, boolean[] visited) {

        Stack<Integer> stack = new Stack<>(graph.getVertices());
        stack.push(source);
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {

            int vertice = stack.pop();
            result.append(vertice);

            DoublyLinkedList<Integer>.Node node = graph.getAdjacencies()[vertice].getHeadNode();

            while (nonNull(node)){
                stack.push(node.data);
                node = node.nextNode;
            }
            visited[vertice] = true;
        }
        return result.toString();
    }

}
