// // // // //linear search is used when the element is at the first position
// // // // //time complexity is O(n) for worst case
// // // // // Linear Search in Java
// // // // import java.util.Scanner;
// // // // public class searchoperations {
// // // //     public static int linearSearch(int[] arr, int target) {
// // // //         for (int i = 0; i < arr.length; i++) {
// // // //             if (arr[i] == target) {
// // // //                 return i; // Return index if found
// // // //             }
// // // //         }
// // // //         return -1; // Return -1 if not found
// // // //     }
// // // //     public static void main(String[] args) {
// // // //         int n,target;
// // // //         Scanner sc=new Scanner(System.in);
// // // //         System.out.println("Enter the number of elements in the array:");
// // // //         n=sc.nextInt();
// // // //         int arr1[] = new int[n];
// // // //         System.out.println("Enter the elements of the array:");
// // // //         for(int i = 0; i < n; i++) {
// // // //            arr1[i] = sc.nextInt();
// // // //         }
// // // //         System.out.println("Enter the target element:");
// // // //         target = sc.nextInt();
// // // //         int result = linearSearch(arr1, target);
        
// // // //         if (result != -1) {
// // // //             System.out.println("Element found at index: " + result);
// // // //         } else {
// // // //             System.out.println("Element not found");
// // // //         }
// // // //     }
// // // // }

// // // //binary search 
// // // //time complexity is O(log n)
// // // //O(log n) because it divides the array into halves
// // // //works on sorted arrays
// // // import java.util.Scanner;
// // // public class searchoperation{
// // //     public static int binarysearch(int arr[],int target,int left, int right)
// // // {
// // //     int mid=arr[left+right/2];
// // //     if(arr.length==0)
// // //     {
// // //         return -1; // Return -1 if the array is empty
// // //     }
// // //     if(target==arr[mid])
// // //     {
// // //         return mid; // Return index if target is found
// // //     }
// // //     else if(target<arr[mid])
// // //     {
// // //         return binarysearch(arr, target, left, mid-1); // Search in the left half
// // //     }
// // //     else
// // //     {
// // //         return binarysearch(arr, target, mid+1, right); // Search in the right half
// // //     }
// // // }
// // // public static void main(String[] args) {
// // //     int n,target;
// // //     Scanner sc=new Scanner(System.in);
// // //     System.out.println("Enter the number of elements in the array:");
// // //     n=sc.nextInt();
// // //     int arr1[] = new int[n];
// // //     System.out.println("Enter the elements of the array (sorted):");
// // //     for(int i = 0; i < n; i++) {
// // //        arr1[i] = sc.nextInt();
// // //     }
// // //     System.out.println("Enter the target element:");
// // //     target = sc.nextInt();
// // //     int result = binarysearch(arr1, target, 0, n-1);
// // //     if (result != -1) {
// // //         System.out.println("Element found at index: " + result);
// // //     } else {
// // //         System.out.println("Element not found");
// // //     }

// // // }
// // // }
// // //ternary search
// // //time complexity is O(log n)
// // //works on sorted arrays
// // //mid1= left + floor((right - left) / 3);
// // //mid2= right - floor((right - left) / 3);
// // //now split the array into parts : left to mid1,mid1+1 to mid2,mid2+1 to right
// // //check if target is (greater than mid1,[less than mid2] or [greater than mid2]) or (less than mid1)
// // //then left and right will be adjusted accordingly
// // //if target is less than mid1, search in left part and left remains same but right will be mid1-1
// // //if target is greater than mid2, search in right part and left will be mid2+1 but right remains same
// // //if target is between mid1 and mid2, search in middle part and left will be mid1+1 and right will be mid2-1
// // //recalculate mid1 and mid2 in each iteration
// // //when left is greater than right, return -1
// // import java.util.Scanner;
// // public class searchoperation{
// //     public static int ternarySearch(int arr[],int left,int right,int target){
// //         int mid1=left + (right - left) / 3;
// //         int mid2=right - (right - left) / 3;
// //         if(left>right){
// //             return -1;
// //         }
// //         else if (target == arr[mid1]){
// //             return mid1;
// //         }
// //         else if(target == arr[mid2]){
// //             return mid2;
// //         }
// //         else if(target < arr[mid1]){
// //             return ternarySearch(arr,left,mid1-1,target);
// //         }
// //         else if(target > arr[mid2]){
// //             return ternarySearch(arr,mid2+1,right,target);
// //         }
// //     else
// //         {
// //             return ternarySearch(arr,mid1+1,mid2-1,target);
// //         }
// //     }
// //     public static void main(String[] args) {
// //         int n,target;
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter the number of elements in the array:");
// //         n=sc.nextInt();
// //         int arr1[] = new int[n];
// //         System.out.println("Enter the elements of the array (sorted):");
// //         for(int i = 0; i < n; i++) {
// //            arr1[i] = sc.nextInt();
// //         }
// //         System.out.println("Enter the target element:");
// //         target = sc.nextInt();
// //         int result = ternarySearch(arr1, 0, n-1, target);
// //         if (result != -1) {
// //             System.out.println("Element found at index: " + result);
// //         } else {
// //             System.out.println("Element not found");
// //         }
// //     }
// // }
// // Exponential Search
// // Time complexity is O(log n)
// // first searches for 1 range then range increases with power of 2
// //works on sorted array
// //after range found,binary search performed on that range
// import java.util.Scanner;
// public class searchoperation {
//     public static int binarySearch(int arr[], int left, int right, int target) {
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (arr[mid] == target) {
//                 return mid; // Return index if target is found
//             } else if (arr[mid] < target) {
//                 left = mid + 1; // Search in the right half
//             } else {
//                 right = mid - 1; // Search in the left half
//             }
//         }
//         return -1; // Return -1 if not found
//     }
//     public static int exponentialSearch(int arr[], int target) {
//         if(arr[0]==target) {
//             return 0; // If the first element is the target
//         }
//         int i=1;//range variable which starts from 1
//         // Finding the range for binary search
//         while(i<arr.length && arr[i] <= target) {
//             i *= 2; // Increase the range exponentially
//         }
//         return binarySearch(arr, i / 2, Math.min(i, arr.length - 1), target); // Perform binary search in the found range


// }
// public static void main(String[] args) {
//     int n, target;
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the number of elements in the array:");
//     n = sc.nextInt();
//     int arr1[] = new int[n];
//     System.out.println("Enter the elements of the array (sorted):");
//     for (int i = 0; i < n; i++) {
//         arr1[i] = sc.nextInt();
//     }
//     System.out.println("Enter the target element:");
//     target = sc.nextInt();
//     int result = exponentialSearch(arr1, target);
//     if (result != -1) {
//         System.out.println("Element found at index: " + result);
//     } else {
//         System.out.println("Element not found");
//     }
// }
// }
