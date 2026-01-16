//lower bound using binary search(smallest element >=given element)
//search for element >=given element,if found then search in left as smallest asked else search in right
// int low=0;int high=n-1;int ans=n;
// while(low<=high)
// {
//     int mid=(low+high)/2;
//     if(arr[mid]>=x)
//     {
//         ans=mid;
//         high=mid-1
//     }
//     else {
//         low=mid+1;
//     }
// }
// return ans;
//upper bound using binary search(smallest element > given element)
//only difference is > which was >=for lower bound
// // // // // // //first and last occurence of an element in a sorted array
// // // // // // import java.util.*;
// // // // // // class Solution2{
// // // // // //     public static void firstindex(int nums[],int target)
// // // // // //     {
// // // // // //         int n=nums.length;
// // // // // //         int low=0,high=n-1,first=-1;
// // // // // //         int mid;
// // // // // //         while(low<=high)
// // // // // //         {
// // // // // //             mid=(low+high)/2;
// // // // // //             if(nums[mid]==target)
// // // // // //             {
// // // // // //                 first=mid;
// // // // // //                 high=mid-1;
// // // // // //             }
// // // // // //             else if(nums[mid]<target)
// // // // // //             {
// // // // // //                 low=mid+1;
// // // // // //             }
// // // // // //             else
// // // // // //             {
// // // // // //                 high=mid-1;
// // // // // //             }
// // // // // //         }
// // // // // //         System.out.println("First Occurence: " + first);
// // // // // //     }
// // // // // //     public static void lastindex(int nums[],int target)
// // // // // //     {
// // // // // //         int n=nums.length;
// // // // // //         int low=0,high=n-1,last=-1;
// // // // // //         int mid;
// // // // // //         while(low<=high)
// // // // // //         {
// // // // // //             mid=(low+high)/2;
// // // // // //             if(nums[mid]==target)
// // // // // //             {
// // // // // //                 last=mid;
// // // // // //                 low=mid+1;
// // // // // //             }
// // // // // //             else if(nums[mid]<target)
// // // // // //             {
// // // // // //                 low=mid+1;
// // // // // //             }
// // // // // //             else
// // // // // //             {
// // // // // //                 high=mid-1;
// // // // // //             }
// // // // // //         }
// // // // // //         System.out.println("Last Occurence: " + last);
// // // // // //     }
// // // // // //     public static void main(String args[])
// // // // // //     {
// // // // // //         Scanner sc=new Scanner(System.in);
// // // // // //         System.out.println("Enter the size of array:");
// // // // // //         int n=sc.nextInt();
// // // // // //         int nums[]=new int[n];
// // // // // //         System.out.println("Enter the elements of array:");
// // // // // //         for(int i=0;i<n;i++)
// // // // // //         {
// // // // // //             nums[i]=sc.nextInt();
// // // // // //         }
// // // // // //         System.out.println("Enter the target element:");
// // // // // //         int target=sc.nextInt();
// // // // // //         firstindex(nums,target);
// // // // // //         lastindex(nums,target);
// // // // // //     }
// // // // // // }
//number of occurences in sorted array is last occurence-first occurence+1
//search in rotated sorted array(unique)
//in normal binary search we can divide parts and eliminate the not needed part
//but because this is rotated we cant be sure of it so 1st we need to know which part is sorted then we can perform the check to see if it falls in this part or the other part
//int low=0,high=n-1;
// while(low<=high)
// {
//     int mid=(low+high)/2;
//     if(mid==target) return mid;
//     if(arr[low]<=arr[mid])
//     {
//         if(arr[low]<=target && target<=arr[mid])
//         {
//             high=mid-1;
//         }
//         else {
//             low=mid+1;
//         }
//     }
//     else
//     {
//         if(arr[mid]<=target && target<=arr[high])
//         {
//             low=mid+1;
//         }
//         else {
//             high=mid-1;
//         }
//     }
// }
// return -1; //if no element found
//search in rotated sorted array(duplicate)
//same algo just add another condition which says if low mid and high are all equal then reduce the search space by doing low+1 and high-1 and then continuing
//int low=0,high=n-1;
// while(low<=high)
// {
//     int mid=(low+high)/2;
//     if(mid==target) return mid;
// (if arr[mid]==arr[low] && arr[mid]==arr[high])
// {
//     low=low+1;
//     high=high-1;
//     continue;
// }
//     if(arr[low]<=arr[mid])
//     {
//         if(arr[low]<=target && target<=arr[mid])
//         {
//             high=mid-1;
//         }
//         else {
//             low=mid+1;
//         }
//     }
//     else
//     {
//         if(arr[mid]<=target && target<=arr[high])
//         {
//             low=mid+1;
//         }
//         else {
//             high=mid-1;
//         }
//     }
// }
// return -1; //if no element found

// // // // // //minimum in rotated sorted array
// // // // // // import java.util.*;
// // // // // // class Solution2{
// // // // // //     public static void min(int nums[])
// // // // // //     {
// // // // // //         int low=0,high=nums.length-1,min=nums[0];
// // // // // //         int mid;
// // // // // //         while(low<=high)
// // // // // //         {
// // // // // //             mid=(low+high)/2;
// // // // // //             if(nums[low]<=nums[mid])
// // // // // //             {
// // // // // //                 min=Math.min(min, nums[low]);
// // // // // //                 low=mid+1;
// // // // // //             }
// // // // // //             else 
// // // // // //             {
// // // // // //                 min=Math.min(min, nums[mid]);
// // // // // //                 high=mid-1;
// // // // // //             }
// // // // // //         }
// // // // // //         System.out.println("Minimum Element: " + min);
// // // // // //     }
// // // // // //     public static void main(String args[])
// // // // // //     {
// // // // // //         Scanner sc=new Scanner(System.in);
// // // // // //         System.out.println("Enter the size of array:");
// // // // // //         int n=sc.nextInt();
// // // // // //         int nums[]=new int[n];
// // // // // //         System.out.println("Enter the elements of array:");
// // // // // //         for(int i=0;i<n;i++)
// // // // // //         {
// // // // // //             nums[i]=sc.nextInt();
// // // // // //         }
// // // // // //         min(nums);
// // // // // //     }
// // // // // // }


// // // // // //find how many times array is rotated
// // // // // //use the code for minimum in rotated sorted array and return the index of the minimum element

// // // // // //peak element in an array
// // // // // //peak element is an element which is greater than or equal to its neighbours
// // // // // import java.util.*;
// // // // // class Solution2{
// // // // //     public static int peak(int nums[])
// // // // //     {
// // // // //         int n=nums.length;
// // // // //         if(n==1) return nums[0];
// // // // //         if(nums[0]>nums[1]) return nums[0];
// // // // //         if(nums[n-1]>nums[n-2]) return nums[n-1];
// // // // //         int low=1,high=n-2;
// // // // //         int mid;
// // // // //         while(low<=high)
// // // // //         {
// // // // //             mid=(low+high)/2;
// // // // //             if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
// // // // //             {
// // // // //                 return nums[mid];
// // // // //             }
// // // // //             else if(nums[mid]<nums[mid-1])
// // // // //             {
// // // // //                 high=mid-1;
// // // // //             }
// // // // //             else
// // // // //             {
// // // // //                 low=mid+1;
// // // // //             }
// // // // //         }

        
// // // // //     }
// // // // //     public static void main(String args[])
// // // // //     {
// // // // //         Scanner sc=new Scanner(System.in);
// // // // //         System.out.println("Enter the size of array:");
// // // // //         int n=sc.nextInt();
// // // // //         int nums[]=new int[n];
// // // // //         System.out.println("Enter the elements of array:");
// // // // //         for(int i=0;i<n;i++)
// // // // //         {
// // // // //             nums[i]=sc.nextInt();
// // // // //         }
// // // // //         int peakElement = peak(nums);
// // // // //         System.out.println("Peak Element: " + peakElement);
// // // // //     }
// // // // }

//square root of a number
//brute force way is to use for loop till number and check whose square is <= that number which leads to O(n) time complexity
// ans=1;
// for(int i=1;i<=n;i++)
// {
//     if(i*i<=n)
//     {
//         ans=i;
//     }
//     else break;
// }

// // // // //nth root of integer
// // // // import java.util.*;
// // // // class Solution2{
// // // //     public static int func(int mid,int n,int m)
// // // //     {
// // // //        long ans=1;
// // // //        for(int i=1;i<=n;i++)
// // // //        {
// // // //         ans=ans*mid;
// // // //         if(ans>m) return 2;
// // // //        }
// // // //        if (ans==m) return 1;
// // // //        return 0;
// // // //     }
// // // //     public static int root(int nums[],int n,int m)
// // // //     {
// // // //         int low=1,high=m;
// // // //         while(low<=high)
// // // //         {
// // // //             int mid=(low+high)/2;
// // // //             int midN=func(mid,n,m);
// // // //             if(midN==1)
// // // //             {
// // // //                 return mid;
// // // //             }
// // // //             else if(midN==0) low=mid+1;
// // // //             else high=mid-1;
// // // //         }
// // // //         return -1; // If no nth root found
// // // //     }
// // // //     public static void main(String args[])
// // // //     {
// // // //         Scanner sc=new Scanner(System.in);
// // // //         System.out.println("Enter the number to find nth root:");
// // // //         int n=sc.nextInt();
// // // //         System.out.println("Enter the value of n:");
// // // //         int m=sc.nextInt();
// // // //         int result = root(new int[]{}, m, n);
// // // //         if(result != -1) {
// // // //             System.out.println("The " + m + "th root of " + n + " is: " + result);
// // // //         } else {
// // // //             System.out.println("No " + m + "th root found for " + n);
// // // //         }
// // // //     }
// // // // }

// // // //banana eating based on hourly rate
// // // import java.util.*;
// // // class Solution2{
// // //     public static int max(int nums[])
// // //     {
// // //         int max=0;
// // //         for(int i=0;i<nums.length;i++)
// // //         {
// // //             max=Math.max(max, nums[i]);
// // //         }
// // //         return max;
// // //     }
// // //     public static int time(int nums[],int h)
// // //     {
// // //         int total=0;
// // //         int n=nums.length;
// // //         for(int i=0;i<n;i++)
// // //         {
// // //             total+=Math.ceil((double)nums[i]/h);
// // //         }
// // //         return total;

// // //     }
// // //     public static int minEat(int nums[],int h)
// // //     {
// // //         int low=0,high=max(nums);
// // //         int mid;
// // //         while(low<=high)
// // //         {
// // //             mid=(low+high)/2;
// // //             int totalTime=time(nums,mid);
// // //             if(totalTime<=h)
// // //             {
// // //                 high=mid-1;
// // //             }
// // //             else
// // //             {
// // //                 low=mid+1;
// // //             }
// // //     }
// // //     return low;
// // //     }
// // //     public static void main(String args[])
// // //     {
// // //         Scanner sc=new Scanner(System.in);
// // //         System.out.println("Enter the number of piles:");
// // //         int n=sc.nextInt();
// // //         int nums[]=new int[n];
// // //         System.out.println("Enter the number of bananas in each pile:");
// // //         for(int i=0;i<n;i++)
// // //         {
// // //             nums[i]=sc.nextInt();
// // //         }
// // //         System.out.println("Enter the number of hours available:");
// // //         int h=sc.nextInt();
// // //         int result = minEat(nums, h);
// // //         System.out.println("Minimum eating speed to finish in " + h + " hours: "+ result);
// // //     }
// // // }

// // //rose garden problem
// // //find the minimum time to bloom all roses to accomodate m bouquets with k adjacent flowers
// // import java.util.*;
// // class Solution2 {
// //     public static boolean isPossible(int nums[],int day, int m, int k) {
// //         int count=0;
// //         int n=nums.length;
// //         int currentBouquet=0;
// //         for(int i=0;i<n;i++)
// //         {
// //             if(nums[i]<=day)
// //             {
// //                 count++;
// //             }
// //             else
// //             {
// //                 currentBouquet += count / k;
// //                 count = 0; // reset count for the next segment
// //             }
// //         }
// //         currentBouquet += count / k; // add the last segment
// //         if(currentBouquet >=m) return true;
// //         else return false;
// //     }
// //     public static int  count(int nums[],int m,int k)
// //     {
// //         int low=min(nums);
// //         int high=max(nums);
// //         int mid;
// //         while(low<=high)
// //         {
// //             mid=(low+high)/2;
// //             if(isPossible(nums,low,m,k)==true)
// //             {
// //                 high=mid-1;
// //             }
// //             else
// //             {
// //                 low=mid+1;
// //             }
// //         }
// //         return low;
// //     }
// //     public static int min(int nums[]) {
// //         int min=nums[0];
// //         for(int i=1;i<nums.length;i++)
// //         {
// //             min=Math.min(min, nums[i]);
// //         }
// //         return min;
// //     }
// //     public static int max(int nums[]) {
// //         int max=nums[0];
// //         for(int i=1;i<nums.length;i++)
// //         {
// //             max=Math.max(max, nums[i]);
// //         }
// //         return max;
// //     }
// //     public static void main(String args[]) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter the number of flowers in the garden:");
// //         int n = sc.nextInt();
// //         int nums[] = new int[n];
// //         System.out.println("Enter the blooming days for each flower:");
// //         for (int i = 0; i < n; i++) {
// //             nums[i] = sc.nextInt();
// //         }
// //         System.out.println("Enter the number of bouquets required:");
// //         int m = sc.nextInt();
// //         System.out.println("Enter the number of adjacent flowers in each bouquet:");
// //         int k = sc.nextInt();
// //         int result = count(nums, m, k);
// //         System.out.println("Minimum time to bloom all roses to accommodate " + m + " bouquets with " + k + " adjacent flowers: " + result);

// //     }
// // }


// //rotate a array
// import java.util.*;
// class Solution2 {
//     public static void rotate(int nums[], int k) {
//         int n = nums.length;
//         int start=0;
//         int end=k;
//         int nums1[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             if(k<n){
//             nums1[i]=nums[k];
//             k++;
//             }
//             else if(start<end)
//             {
//                 nums1[i]=nums[start];
//                 start++;
//             }
//         }
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(nums1[i] + " ");
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int n = sc.nextInt();
//         int nums[] = new int[n];
//         System.out.println("Enter the elements of array:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }
//         System.out.println("Enter the number of positions to rotate:");
//         int k = sc.nextInt();
//         rotate(nums, k);
//     }
// }


//find missing number
//brute force way is to operate with 2 loops where 1st loop runs from 1 to the number 
//second loop runs for the array index 0 to n-1
//it checks if a[j]==i then turns flag 1 and breaks out
//if after complete iteration of loop j it sees flag 0 it can identify that the number was absent
//bettter approach will be to have a hash array whose each position will increase to 1 if that particular element is present
//if any element is absent that particular element index of hash array will be 0
//optimal solution can be of 2 types
//1.sum of n natural numbers 
// //finding the sum of n natural numbers and finding the sum of array elements than finding their difference will lead us to the missing number
// s1=n*(n+1)/2;
// for(int i=0;i<n-1;i++)
// {
//     s2+=arr[i]
// }
// return s1-s2;

//2.use bit manipulation using xor
//xor of 2 same number leads to 0
//so if we have a xor mapping of all numbser till n and another number of all xor mapping of array elements
//the only number which will be there will be the number which will not be there in the array
//the remaining numbers will turn 0 because of xor^xor
// xor1=0,xor2=0;
// for(int i=0;i<n-1;i++)
// {
    
//     xor2^=arr[i];
//     xor1^=i+1;
// }
//xor1^=n;
// return xor1^xor2;

//in an array all are repeated twice just one element is not repeated,find that
//brute force is to have 2 loops and pick each element and iterate in another loop,if found move to next element
//better approach is to use hashing and store number of times an element occurs in another hash array,the index with count 1 will represent the element which wasnt repeated
//optimal approach is to use xor as xor of 2 same elements will be 0 so only the non repeated element will remain
// int xor1=0;
// for(int i=0;i<arr.length;i++)
// {
//     xor1^=arr[i]
// }
// return xor1;


//find consecutive 1s
// int c=0;
// for(int i=0;i<a.length;i++)
// {
//     if(a[i]==1)
//     {
//         c++;
//         maxi=max(maxi,c);
//     }
//     else{
//         c=0;
//     }
// }
// return max;

//set matrix to 0
//if any element is 0 then that particular row and column will be set 0
//brute force way is to use loops which takes around n^3 time complexity
//better approach is to use two extra arrays to store 1 if any of the element of that particular row or column is 0 otherwise store 0
//optimal approach is to use this metyhod but to not use seperate arrays and use the 1st row and column of that matrix as that and for the common a[0][0] element have a seperate variable
// int col0=1;
// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++)
//     {
//         if(a[i][j]==0)
//         {
//             a[i][0]=0; //setting the 1st row element of i index 0 to identify which row to turn 0
//             if(j!=0)
//                 a[0][j]=0; //to set 1st column elements except the a[0][0] element 0 on getting any 0
//             else
//                 col0=0;//if it is 1st column then set the 1st element 0 seperately
//         }
//     }
// }
// for(int i=1;i<n;i++)
// {
//     for(int j=1;j<m;j++)
//     {
//         if(a[i][j]!=0)
//         {
//         if(a[i][0]==0 || a[0][j]==0)
//             a[i][j]=0;
//         }
//     }
// }
// if(a[0][0]==0){
//     for(int j=0;j<m;j++)
//     {
//         a[0][j]=0;
//     }
// }
// if(col0==0)
// {
//     for(int i=0;i<n;i++)
//     {
//         a[i][0]=0;
//     }
// }
// return a;

//merge overlapping intervals
//ex:
//(1,3),(2,4),(8,9),(8,10),(9,11),(15,18),(16,17)
//this list is sorted so first task is to sort the input list
//among this [1,2,3,4,6] is one, [ 8,9,10,11] is another and [15,16,17,18] is another
// to see if interval is merged or not we check the first element of the next array
//if that is less than the last element of the 1st element then it falls in the same interval
//ex: 2 is less than 3 so 2,4 is in the interval and the maximum of last item of element and last item of 2nd element becomes the end range
//like here 4 is more than 3 so it becomes the end point
//brute approach is to iterate through,check for conditions and insert in List

// sort(a.begin(),a.end());
// List <Integer> ans;
// for(int i=0;i<a.length;i++)
// {
//     int start=a[i][0]; 
//     int end=a[i][1]; //last item of the element
//     if(!ans.empty() && end <=ans.back()[1]) //if the 2nd item of next element is less than the 2nd item of prev element then range wont change 
//     {
//         continue;
//     }
//     for(int j=i+1;j<a.length;j++) //checking with next element
//     {
//         if(a[j][0] <=end) //check if 1st item of 2nd element is less than 2nd item of 1st element
//         {
//             end=max(end,a[j][1]);
//         }
//         else break;
//     }
//ans.add({start,end})
// }
//return add;

//optimal way is similar just we will not iterate the entire array for each turn
//if range is not satisfying with conditions then make it new range
//  List <Integer> ans;
//  for(int i=0;i<a.length;i++)
//  {
//     if(!ans.empty() || a[i][0] > ans.back()[i])
//     {
//         ans.add(a[i]); // if the new range doesnt fall in the prev range make a new range
//     }
//     else
//     {
//         ans.back()[1]=max(ans.back()[1],arr[i][1]); //else add in the prev range with the max value
//     }
//  }
//  return ans;

