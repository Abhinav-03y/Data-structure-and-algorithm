class Solution {

    void fun(List<Integer> input, List<Integer> output,List<List<Integer>> ans) {
        
        if (input.size() == 0) {
           ans.add(new ArrayList<>(output));
            return;
        }

        for (int i = 0; i < input.size(); i++) {

            List<Integer> newInput = new ArrayList<>(input);
            List<Integer> newOutput = new ArrayList<>(output);

            newOutput.add(newInput.get(i));
            newInput.remove(i);

            fun(newInput, newOutput, ans);
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        for (int num : nums) {
            input.add(num);
        }

        fun(input, output, ans);

        return ans;
    }
}