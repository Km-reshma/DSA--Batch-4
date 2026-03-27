class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int i, int[] arr, int target, List<Integer> temp, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (i == arr.length || target < 0) {
            return;
        }

        
        if (arr[i] <= target) {
            temp.add(arr[i]);
            solve(i, arr, target - arr[i], temp, ans);
            temp.remove(temp.size() - 1); 
        }

        
        solve(i + 1, arr, target, temp, ans);
    }
}