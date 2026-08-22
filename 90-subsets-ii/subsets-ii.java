class Solution {
    void fun(List<Integer> input, List<Integer> output, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(output));

        if (input.size() == 0)
            return;

        for (int i = 0; i < input.size(); i++) {

            if (i > 0 && input.get(i).equals(input.get(i - 1)))
                continue;

            List<Integer> newInput = new ArrayList<>(input);
            List<Integer> newOutput = new ArrayList<>(output);

            newOutput.add(newInput.get(i));
            newInput.subList(0, i + 1).clear();

            fun(newInput, newOutput, ans);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            input.add(nums[i]);
        }

        fun(input, output, ans);

        return ans;
    }
}