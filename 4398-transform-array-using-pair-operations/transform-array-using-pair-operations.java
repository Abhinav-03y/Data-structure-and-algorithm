class Solution {
    public boolean canTransform(int[] source, int[] target) {
      int n = source.length;
        long a=0,b =0;

        int [] r1 = source;

        for(int i=0; i< n; i++){
            a += source[i];
            b += target[i];
            
        }
        return (a ==b);
    }
}