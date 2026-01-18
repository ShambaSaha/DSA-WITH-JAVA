// // //find duplicate number in an array containing n + 1 integers where each integer is between 1 and n (inclusive).
// // //no extra space allowed and the array is read-only.
// // class Solution3 {
// //     public int findDuplicate(int[] nums) {
// //         int slow = nums[0];
// //         int fast = nums[0];

// //         // Phase 1: Finding the intersection point in the cycle
// //         do {
// //             slow = nums[slow];
// //             fast = nums[nums[fast]];
// //         } while (slow != fast);

// //         // Phase 2: Finding the entrance to the cycle
// //         slow = nums[0];
// //         while (slow != fast) {
// //             slow = nums[slow];
// //             fast = nums[fast];
// //         }

// //         return slow;
// //     }
// // }

// //We use tortoise and hare algorithm to find out the entry point of the cycle which is the duplicate number.
// //first we find out where slow and fast pointers meet in the cycle
// //then we reset slow pointer to the start of the array and move both pointers one step at a time until they meet again
// //the meeting point is the duplicate number

// //Find all duplicates in an array where 1 ≤ a[i] ≤ n (n = size of array)
// import java.util.ArrayList;
// import java.util.List;
// class Solution3 {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> duplicates = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             int index = Math.abs(nums[i]) - 1; // Get the index corresponding to the value

//             if (nums[index] < 0) {
//                 // If the value at this index is negative, it means we've seen this number before
//                 duplicates.add(Math.abs(nums[i]));
//             } else {
//                 // Mark the number as seen by negating the value at this index
//                 nums[index] = -nums[index];
//             }
//         }

//         return duplicates;
//     }
// }
// //We make every number at the index corresponding to the value negative to mark it as seen
// //If we encounter a number whose corresponding index is already negative, it means it's a duplicate

// //Container with most water
// //We find out which container can hold maximum water
// class Solution {
//     public int maxArea(int[] height) {
//         int i=0;int j=height.length-1;int max=0;
//         while(i<j)
//         {
//             int area=Math.min(height[i],height[j])*(j-i);
//             max=Math.max(area,max);
//             if(height[i]<height[j])
//             {
//                 i++;
//             }
//             else j--;
//         }
//         return max;
//     }
// }