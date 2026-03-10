class Solution {
   
       public int trap(int[] height) {
//         int left = 0;
//         int right = height.length - 1;
//         int leftMax = 0;
//         int rightMax = 0;
//         int water = 0;

//         while (left < right) {
//             if (height[left] < height[right]) {
//                 if (height[left] >= leftMax) {
//                     leftMax = height[left];
//                 } else {
//                     water += leftMax - height[left];
//                 }
//                 left++;
//             } else {
//                 if (height[right] >= rightMax) {
//                     rightMax = height[right];
//                 } else {
//                     water += rightMax - height[right];
//                 }
//                 right--;
//             }
//         }

//         return water;
          
        int n = height.length ; 
        
        int[] Left = new int[n] ;
        int[] Right = new int[n] ;

        Left[0] =  height[0] ;
        for(int i = 1 ; i < n ; i++)
        {
            Left[i] = Math.max(Left[i-1],height[i]) ;
        }

        Right[n-1] = height[n-1] ;
        for(int i = n-2 ; i >= 0 ; i--)
        {
            Right[i] = Math.max(Right[i+1],height[i]) ;
        }

        int Area = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            Area += Math.min(Right[i],Left[i])-height[i] ;
        }
        return Area ;














    }
}