class Solution {
    long fun(int[] start, int[] end, int i, int j) {

        if (i>=start.length)
            return 0;

        if (j >=i) {
            return (i - j) +fun(start, end, i + 1, j);
        }

        if (end[j]< start[i]) {
            return fun(start,end, i, j+ 1);
        }

        return (i - j) +fun(start,end, i+ 1,j);
    }

    public long countIntersectingIntervals(int[][] intervals) {

        int n=intervals.length;

        int[] start= new int[n];
        int[] end=new int[n];

        for (int i =0;i< n;i++) {
            start[i]= intervals[i][0];
            end[i]= intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        return fun(start, end, 0, 0);
    }
}