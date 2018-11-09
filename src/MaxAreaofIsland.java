/**
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

 Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
 */
class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int[][] visited = new int[grid.length][grid[0].length];
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 0) {
                    continue;
                }
                int result = find(grid,i,j,visited);
                if(max < result){
                    max = result;
                }
            }
        }
        return max;
    }
    public int find(int[][] grid ,int x,int y, int[][] visited){
        if(grid[x][y] == 0 || visited[x][y] == 1){ //边界溢出。
            return 0;
        }
        int result = 1;
        visited[x][y] = 1;
        if(x + 1 < grid.length){
            result += find(grid, x+1, y, visited);
        }
        if(x -1 >= 0){
            result += find(grid, x-1, y, visited);
        }
        if(y + 1 < grid[0].length){
            result += find(grid,x,y+1,visited);
        }
        if(y -1 >= 0){
            result += find(grid,x,y-1,visited);
        }
        return result;
    }
}