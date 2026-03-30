import java.util.*;

class Solution {

    public void solve(int start, int[] nums, List<Integer> curr, List<List<Integer>> ans) {
        
        // har step pe current subset add karo
        ans.add(new ArrayList<>(curr));

        for(int i = start; i < nums.length; i++) {

            // duplicate skip
            if(i > start && nums[i] == nums[i - 1]) continue;

            curr.add(nums[i]);              // include
            solve(i + 1, nums, curr, ans); // next index
            curr.remove(curr.size() - 1);  // backtrack
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums); // duplicate handle karne ke liye important
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(0, nums, new ArrayList<>(), ans);
        return ans;
    }
}