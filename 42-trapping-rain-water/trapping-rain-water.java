class Solution {

    public int trap(int[] height) {

        int n = height.length;

        int i = 0;
        int j = n - 1;

        int leftMax = 0;
        int rightMax = 0;

        int area = 0;

        while (i < j) {

            if (height[i] > leftMax) {
                leftMax = height[i];
            }

            if (height[j] > rightMax) {
                rightMax = height[j];
            }

            if (leftMax < rightMax) {
                area += leftMax - height[i];
                i++;
            } 
            else {
                area += rightMax - height[j];
                j--;
            }
        }

        return area;
    }
}