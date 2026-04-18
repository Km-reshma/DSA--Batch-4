
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if (nums.length == 0) 
//         return 0;

//         Arrays.sort(nums);   

//         int longest = 1;
//         int count = 1;

//         for (int i = 1; i < nums.length; i++) {

//             if (nums[i] == nums[i - 1]) {
//                 continue;  
//             }

//             if (nums[i] == nums[i - 1] + 1) {
//                 count++;   
//             } else {
//                 longest = Math.max(longest, count);
//                 count = 1;  
//             }
//         }

//         return Math.max(longest, count);
//     }
// }

// Solve By heap also new solution 

class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>() ;
        int ans = 0 ;

        for(int num : nums)
        {
            set.add(num) ;
        }
        for(int num : set)
        {
            int count = 0 ;
            int temp = num ;
            if(!set.contains(temp-1))
            {
                while(set.contains(temp))
                {
                    count++ ;
                    temp++ ;
                }
            }


            ans = Math.max(ans,count) ;

        }
        return ans ; 
    }
}