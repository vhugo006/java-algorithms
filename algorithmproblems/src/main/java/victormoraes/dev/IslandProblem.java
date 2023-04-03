package victormoraes.dev;

import java.util.LinkedList;
import java.util.Queue;

public class IslandProblem {

    public int getIslands(int grid[][]) {

        int island = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 1) {
                    continue;
                } else {
                    bfsVisit(grid, new int[]{i, j});
                    island++;
                }
            }
        }
        return island;
    }

    private void bfsVisit(int[][] grid, int[] vertexPositions) {
        if (vertexPositions != null) {
            int i = vertexPositions[0], j = vertexPositions[1];
            int[] leftNeighbor = {i, j - 1};
            int[] rightNeighbor = {i, j + 1};
            int[] upNeighbor = {i - 1, j};
            int[] downNeighbor = {i + 1, j};

            Queue<int[]> queue = new LinkedList<>();
            queue.add(vertexPositions);
            grid[i][j] = 0;

            while (!queue.isEmpty()) {
                //Checking left neighbor
                if (isValidIndexPair(grid, leftNeighbor) && grid[leftNeighbor[0]][leftNeighbor[1]] == 1) {
                    queue.add(new int[]{leftNeighbor[0], leftNeighbor[1]});
                    grid[leftNeighbor[0]][leftNeighbor[1]] = 0;
                }

                //Checking right neighbor
                if (isValidIndexPair(grid, rightNeighbor) && grid[rightNeighbor[0]][rightNeighbor[1]] == 1) {
                    queue.add(new int[]{rightNeighbor[0], rightNeighbor[1]});
                    grid[rightNeighbor[0]][rightNeighbor[1]] = 0;
                }

                //Checking up neighbor
                if (isValidIndexPair(grid, upNeighbor) && grid[upNeighbor[0]][upNeighbor[1]] == 1) {
                    queue.add(new int[]{upNeighbor[0], upNeighbor[1]});
                    grid[upNeighbor[0]][upNeighbor[1]] = 0;
                }

                //Checking up neighbor
                if (isValidIndexPair(grid, downNeighbor) && grid[downNeighbor[0]][downNeighbor[1]] == 1) {
                    queue.add(new int[]{downNeighbor[0], downNeighbor[1]});
                    grid[downNeighbor[0]][downNeighbor[1]] = 0;
                }
                queue.poll();
                bfsVisit(grid, queue.poll());
            }
        }
    }

    private boolean isValidIndexPair(int[][] grid, int[] indexPair) {
        return indexPair[0] >= 0 && indexPair[0] < grid.length
                && indexPair[1] >= 0 && indexPair[1] < grid[0].length;
    }
}
