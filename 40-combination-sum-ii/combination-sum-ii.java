class Solution {
        void fun(List<List<Integer>> cs, List<Integer> l, int[] arr, int i, int sum){
            int n = arr.length;
        if(sum == 0){
            cs.add(new ArrayList<>(l));
            return;
        }
        if(sum < 0) return;
        if(i>= n) return;
        
        for(int j=i;j<n;j++){

            if(j>i && arr[j] == arr[j-1]) continue;

            if(arr[j] > sum) break;
        
        l.add(arr[j]);
        fun(cs,l,arr,j+1,sum-arr[j]);

        l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> cs = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        Arrays.sort(candidates);

        fun(cs,l,candidates,0,target);
        return cs;
    }
}