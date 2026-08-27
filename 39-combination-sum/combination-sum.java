class Solution {
     private void solve(List<List<Integer>> ls, List<Integer> l, int[] arr, int index, int sum){
        if(sum == 0){
            ls.add(new ArrayList(l));
            return;
        }
        if(sum < 0) return;
        if(index >= arr.length) return;

        l.add(arr[index]);
        solve(ls,l,arr,index,sum-arr[index]);

        l.remove(l.size()-1);
        solve(ls,l,arr,index+1,sum);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        solve(ls,l,candidates,0,target);
        return ls;
    }
}