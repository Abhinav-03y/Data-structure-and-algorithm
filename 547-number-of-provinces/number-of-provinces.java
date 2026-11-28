class Solution {
    void fun(int[][] connected , boolean[] visited , int start){

        visited[start] = true;
        for(int i =0 ; i < connected.length; i++){
            if(connected[start][i]  == 1 && !visited[i]){
                fun(connected , visited , i);
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
       boolean[] visited = new boolean[n]; 

       int count =0;
       for(int i=0 ; i < n; i++){
        if(!visited[i]){
            count++;
            fun(isConnected ,visited , i);

        }
       }
       return count;
    }
}