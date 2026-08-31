class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sr = source[0];
        int sc = source[1];

        int tr = target[0];
        int tc = target[1];

        if( SD(sr,sc,tr,tc)){
            return 1;
        }
        for(int r=1;r<=8 ; r++){
            for(int c=1;c<=8;c++){
                
                boolean first =SD(sr,sc,r,c);
                boolean second =SD(r,c,tr,tc);

                if(first && second ){
                    return 2;
            }
        }
    }
    return -1;
}
        private boolean SD(int r1,int c1,int r2,int c2){
            return Math.abs(r1-r2)==Math.abs(c1-c2);
       
    }
}