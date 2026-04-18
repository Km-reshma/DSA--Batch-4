class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int CurrSum= 0;
        int count =0;

        for(int i = 0; i < nums.length; i++){
            CurrSum += nums[i];


            if(map.containsKey(CurrSum - k)){
                count += map.get(CurrSum - k);
            }
            map.put(CurrSum, map.getOrDefault(CurrSum, 0) + 1);
        }
        return count;

    }
}

//  int i = 0 , j = 0 , curr_Sum = 0 , Zero_Count = 0 , count = 0 ;
//         int n = nums.length ;
//         while(j < n)
//         {
//             curr_Sum += nums[j] ;
//             while(i < j && (curr_Sum > k || nums[i] == 0))    //usimg sliding window 
//             {
//                 if(nums[i] == 0)
//                 {
//                     Zero_Count += 1 ;
//                 }
//                 else
//                 {
//                     Zero_Count = 0 ;
//                 }
//                 curr_Sum -= nums[i] ;
//                 i++ ;
//             }

//             if(curr_Sum == k)
//             {
//                 count += 1 + Zero_Count ;
//             }
//             j++ ;
//         }

//         return count  ;

//     }
// }