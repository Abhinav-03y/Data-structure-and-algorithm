class Solution {

    int fun(int[][] intervals, int i, int j){
        if(i >= intervals.length) 
        return 0;

        if(j >= intervals.length) 
        return fun(intervals, i+1, i+2);

        int count =0;

        if(intervals[i][0] <= intervals[j][1] && 
           intervals[j][0] <= intervals[i][1]){
            count = 1;
        }
        return count + fun(intervals, i, j+1);
    }
    public int countIntersectingIntervals(int[][] intervals) {
        
        return fun(intervals,0,1);
    }
}