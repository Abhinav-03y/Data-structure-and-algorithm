class Solution {
    int[] fun(int r ,int c  , char[][]grid){
        int m = grid.length;
        int n = grid[0].length;

        char dir = grid[r][c];
        grid[r][c] = '*';

        int nr= r,nc =c;
        if(dir == 'L')
        nc--;
        else if(dir =='R')
        nc++;
        else if(dir == 'U')
        nr--;
        else 
        nr++;

        if(nr < 0 || nr >=m || nc <0 || nc >= n){
            return new int[]{r,c};
        }
            if(grid[nr][nc] =='*'){
                return new int[]{r,c};
            }
        return fun(nr ,nc ,grid);
        
    }

    public int[] lastVisitedCell(char[][] grid) {
        return fun(0 ,0 ,grid);
        
    }
}