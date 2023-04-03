package victormoraes.dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandProblemTest {

    private final IslandProblem islandProblem = new IslandProblem();
    @Test
    public void givenAGridWithOneIslandVerticeShouldReturnOne(){
        int[][] grid = {
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        int islands = islandProblem.getIslands(grid);
        assertEquals(1, islands);
    }

    @Test
    public void givenAGridWithTwoNeighborsVerticesShouldReturnOneIsland(){
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        int islands = islandProblem.getIslands(grid);
        assertEquals(1, islands);
    }

    @Test
    public void givenAGridWithTwoVerticesAtSameRowShouldReturnTwoIslands(){
        int[][] grid = {
                {1, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        int islands = islandProblem.getIslands(grid);
        assertEquals(2, islands);
    }

    @Test
    public void givenAGridWithTwoOppositeVerticesShouldReturnTwoIslands(){
        int[][] grid = {
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1}};

        int islands = islandProblem.getIslands(grid);
        assertEquals(2, islands);
    }

    @Test
    public void givenAGridWithThreeVerticesShouldReturnThreeIslands(){
        int[][] grid = {
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1}};

        int islands = islandProblem.getIslands(grid);
        assertEquals(3, islands);
    }

    @Test
    public void givenAGridWithThreeGroupOfVerticesShouldReturnThreeIslands(){
        int[][] grid = {
                {1, 1, 0, 1, 1},
                {1, 0, 0, 0, 1},
                {0, 1, 1, 0, 0},
                {0, 1, 1, 0, 0}};

        int islands = islandProblem.getIslands(grid);
        assertEquals(3, islands);
    }

    @Test
    public void givenAGridWithFourGroupOfVerticesShouldReturnFourIslands(){
        int[][] grid = {
                {1, 1, 0, 1, 1},
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 1, 1}};

        int islands = islandProblem.getIslands(grid);
        assertEquals(4, islands);
    }

    @Test
    public void givenAGridWithAlternateOnesAndZerosShouldReturnTenIslands(){
        int[][] grid = {
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0}};

        int islands = islandProblem.getIslands(grid);
        assertEquals(10, islands);
    }
}