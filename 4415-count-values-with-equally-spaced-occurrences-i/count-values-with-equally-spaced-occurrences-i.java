class Solution {
    boolean fun(int[] arr,int x){
    int count =0;
    int i1=-1,i2=-1,i3=-1;

     for(int i=0;i<arr.length;i++){
         if(arr[i] ==x){
         count++;

             if(count ==1)
             i1=i;
             else  if(count == 2)
             i2 =i;
             else if (count ==3)
             i3 =i;
             
         }
         
     }
        if(count == 3 && i2 -i1 == i3 - i2)
        return true;
    return false;

}

    public int countSpecialIntegers(int[] nums) {
        int ans =0;

        for(int x=0;x<=100;x++)
        {
            if(fun(nums,x)){
                ans++;
            }
        }   
            return ans;
    }
}