class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
            {
                first = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        left = 0;
        right = nums.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
            {
                last = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return new int[]{first, last};
    }
}
// class Solution {
//     public int[] searchRange(int[] nums, int target) 
//     {
//         int[] arr={-1,-1};
//         int count=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==target)
//             {
//                 arr[0]=i;
//                 break;
//             }
//             count++;
//         }
//         for(int i=nums.length-1;i>count;i--)
//         {
//             if(nums[i]==target)
//             {
//                 arr[1]=i;
//             }
//         }
//         return arr;
//     }
// }
