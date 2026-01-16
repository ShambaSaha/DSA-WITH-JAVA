// // // // // // // // // // // // // solution for array problems from 100 questions from dsa list
// // // // // // // // // // // // // //1.check if a pair with a given sum exists in an array
// // // // // // // // // // // // // import java.util.Scanner;
// // // // // // // // // // // // // public class Solution1{
// // // // // // // // // // // // //     public static void main(String[] args) {
// // // // // // // // // // // // //         Scanner sc = new Scanner(System.in);
// // // // // // // // // // // // //         int n, target;
// // // // // // // // // // // // //         System.out.println("Enter the number of elements in the array:");
// // // // // // // // // // // // //         n = sc.nextInt();
// // // // // // // // // // // // //         int arr[] = new int[n];
// // // // // // // // // // // // //         System.out.println("Enter the elements of the array:");
// // // // // // // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // // // // // // //             arr[i] = sc.nextInt();
// // // // // // // // // // // // //         }
// // // // // // // // // // // // //         System.out.println("Enter the target element:");
// // // // // // // // // // // // //         target = sc.nextInt();
// // // // // // // // // // // // //         sum(arr, target);
// // // // // // // // // // // // //         }
// // // // // // // // // // // // //     public static void sum(int arr[], int target) {
// // // // // // // // // // // // //         for(int i=0;i<arr.length;i++){
// // // // // // // // // // // // //             for(int j=i+1;j<=arr.length-1;j++){
// // // // // // // // // // // // //                 if(arr[i]+arr[j]==target)
// // // // // // // // // // // // //                 {
// // // // // // // // // // // // //                     System.out.println("Pair found: " + arr[i] + " and " + arr[j]);
// // // // // // // // // // // // //                     return; // Exit after finding the first pair
// // // // // // // // // // // // //                 }
// // // // // // // // // // // // //             }
// // // // // // // // // // // // //         }
// // // // // // // // // // // // //         System.out.println("No pair found with the given sum.");
// // // // // // // // // // // // //     }
// // // // // // // // // // // // // }
// // // // // // // // // // // // //2.buying and selling stock
// // // // // // // // // // // // // import java.util.Scanner;
// // // // // // // // // // // // // public class Solution1 {
// // // // // // // // // // // // //     public static void main(String args[])
// // // // // // // // // // // // //     {
// // // // // // // // // // // // //         int n;
// // // // // // // // // // // // //         Scanner sc=new Scanner(System.in);
// // // // // // // // // // // // //         System.out.println("Enter the number of days:");
// // // // // // // // // // // // //         n = sc.nextInt();
// // // // // // // // // // // // //         int prices[] = new int[n];
// // // // // // // // // // // // //         System.out.println("Enter the stock prices for each day:");
// // // // // // // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // // // // // // //             prices[i] = sc.nextInt();
// // // // // // // // // // // // //         }
// // // // // // // // // // // // //         int max=0,min=prices[0],maxday=0,minday=1;
// // // // // // // // // // // // //         for(int j=0;j<prices.length;j++)
// // // // // // // // // // // // //         {
// // // // // // // // // // // // //             if(prices[j]<min)
// // // // // // // // // // // // //             {
// // // // // // // // // // // // //                 min=prices[j];
// // // // // // // // // // // // //                 minday=j+1; // Store the day of minimum price
// // // // // // // // // // // // //             }
// // // // // // // // // // // // //             else if(prices[j]-min>max)//max profit if selling on that day
// // // // // // // // // // // // //             {
// // // // // // // // // // // // //                 max=prices[j];
// // // // // // // // // // // // //                 maxday=j+1; // Store the day of maximum price
// // // // // // // // // // // // //             }
// // // // // // // // // // // // //         }
// // // // // // // // // // // // //         System.out.println("Maximum profit while selling: " + max +" and day is "+ maxday);
// // // // // // // // // // // // //         System.out.println("Minimum price while buying: " + min + " and day is " + minday);
// // // // // // // // // // // // //         System.out.println("Maximum profit is: " + (max - min));
// // // // // // // // // // // // //     }
// // // // // // // // // // // // //     }

// // // // // // // // // // // // //Maximum subarray
// // // // // // // // // // // // //process to find amximum subarray is first start a loop from starting index till end,then nested loop for ending index which is from start till end
// // // // // // // // // // // // // maxsum=0;
// // // // // // // // // // // // // for(int start=0;start<n;start++)
// // // // // // // // // // // // // {
// // // // // // // // // // // // //     sum=0;
// // // // // // // // // // // // // for(int end=i;end<n;end++)
// // // // // // // // // // // // // {
// // // // // // // // // // // // //     sum+=end; //bruteforce way to get sum of all combinations
// // // // // // // // // // // // //     maxsum=max(sum,maxsum);
// // // // // // // // // // // // // }
// // // // // // // // // // // // // }
// // // // // // // // // // // // //kadanes algo simplifies it by eliminating subarray sums which are  <0 because that will reduce the total sum not increasing it
// // // // // // // // // // // // // sum=0;maxsum=0;
// // // // // // // // // // // // // for(int start=0;i<n;i++)
// // // // // // // // // // // // // {
// // // // // // // // // // // // //     sum+=i;
// // // // // // // // // // // // //     maxsum=max(sum,maxsum);
// // // // // // // // // // // // //     if(sum<0)
// // // // // // // // // // // // //     {
// // // // // // // // // // // // //         sum=0; //if sum<0 resets to 0
// // // // // // // // // // // // //     }
// // // // // // // // // // // // // }

// // // // // // // // // // // // //pair sum or 2sum 
//better approach is to use hashmap and store all the elements of the arraay if its counterpart to add and reach the required sum is absent
//ex:if 2 is iterated and the required sum is 10,the remaining part will be 8 but if 8 is not there at that moment then add 2 in map
//but if 8 is there then just return the indexes of both as in map you store the key with value
// // // // // // // // // // // // //in sorted array where we know largest element is in last and smallest is in first to find pair sum equal to target we take two variables,starting index and ending index and find their sum
// // // // // // // // // // // // //if the sum is > target we know its because of the last element which is largest
// // // // // // // // // // // // //if sum is < target we know its because of the first element which is smallest
// // // // // // // // // // // // //if sum=target case ends
// // // // // // // // // // // // //but for other two cases we shift the first and last index accordingly to get the required i and j
// // // // // // // // // // // // import java.util.Scanner;
// // // // // // // // // // // // public class Solution1{
// // // // // // // // // // // // public static void pairsum(int arr[],int target)
// // // // // // // // // // // // {
// // // // // // // // // // // //     int start=0;
// // // // // // // // // // // //     int end=arr.length-1;
// // // // // // // // // // // //     while(start<end)
// // // // // // // // // // // //     {
// // // // // // // // // // // //         if((arr[start] + arr[end]) < target)
// // // // // // // // // // // //         {
// // // // // // // // // // // //             start++;
// // // // // // // // // // // //         }
// // // // // // // // // // // //         else if((arr[start] + arr[end] )> target)
// // // // // // // // // // // //         {
// // // // // // // // // // // //             end--;
// // // // // // // // // // // //         }
// // // // // // // // // // // //         else{
// // // // // // // // // // // //             System.out.println("index="+start+" "+end);
// // // // // // // // // // // //             return;
// // // // // // // // // // // //         }
            
// // // // // // // // // // // //     }
// // // // // // // // // // // //     System.out.println("No pair found with the given sum.");
// // // // // // // // // // // // }
// // // // // // // // // // // // public static void main(String args[])
// // // // // // // // // // // // {
// // // // // // // // // // // //     Scanner sc=new Scanner(System.in);
// // // // // // // // // // // //     int n,target;
// // // // // // // // // // // //     System.out.println("Enter size of array");
// // // // // // // // // // // //     n=sc.nextInt();
// // // // // // // // // // // //     int arr[]=new int[n];
// // // // // // // // // // // //     for(int i=0;i<n;i++)
// // // // // // // // // // // //     {
// // // // // // // // // // // //         arr[i]=sc.nextInt();
// // // // // // // // // // // //     }
// // // // // // // // // // // //     System.out.println("Enter target sum");
// // // // // // // // // // // //     target=sc.nextInt();
// // // // // // // // // // // //     pairsum(arr,target);
// // // // // // // // // // // // }
// // // // // // // // // // // // }
// // // // // // // // // // // //majority element in array
// // // // // // // // // // // //bruteforce way is tro traverse each element and count its frequency
// // // // // // // // // // // //for(int i=0;i<n;i++)
// // // // // // // // // // // //{
// // // // // // // // // // // //    int count=0;
// // // // // // // // // // // //    for(int j=0;j<n;j++)
// // // // // // // // // // // //    {
// // // // // // // // // // // //        if(arr[i]==arr[j])
// // // // // // // // // // // //        {
// // // // // // // // // // // //            count++;
// // // // // // // // // // // //        }
// // // // // // // // // // // //    }
// // // // // // // // // // // //     if(count>n/2)
// // // // // // // // // // // //      {
// // // // // // // // // // // //          System.out.println("Majority element is: " + arr[i]);
// // // // // // // // // // // //          return;
// // // // // // // // // // // //      }
// // // // // // // // // // // //    }
// // // // // // // // // // // //optimal way is to sort the array and then find the frequency of the element
// // // // // // // // // // // //if frequency is <n/2 reset it to 1
//                                 nums.sort()
// // // // // // // // // // // //int freq=1;ans=nums[0]
// // // // // // // // // // // //for(int i=0;i<n;i++)
// // // // // // // // // // // //{
// // // // // // // // // // // //   if(nums[i]==nums[i+1])
// // // // // // // // // // // //   {
// // // // // // // // // // // //       freq++;
// // // // // // // // // // // //   }
// // // // // // // // // // // //   else
// // // // // // // // // // // //   {
// // // // // // // // // // // //       freq=1;
// // // // // // // // // // // //       ans=nums[i];
// // // // // // // // // // // //   }
// // // // // // // // // // // //   if(freq>n/2)
// // // // // // // // // // // //   {
// // // // // // // // // // // //       System.out.println("Majority element is: " + ans);
// // // // // // // // // // // //       return;
// // // // // // // // // // // //   }
// // // // // // // // // // // //} 


// // // // // // // // // // // //moores voting algorithm is the most optimal way to find majority element
// // // // // // // // // // // //it says if element same increase freq by 1 but if different decrease freq by 1
// // // // // // // // // // // //if the element is majority then it will always be greater than others at the end
// // // // // // // // // // // //for(int i=0;i<n;i++)
// // // // // // // // // // // //{
// // // // // // // // // // // //    if(freq==0)
// // // // // // // // // // // //    {
// // // // // // // // // // // //        ans=nums[i]; //set ans to current element
// // // // // // // // // // // //    }
// // // // // // // // // // // //    if(nums[i]==ans)
// // // // // // // // // // // //    {
// // // // // // // // // // // //        freq++; //if same increase freq
// // // // // // // // // // // //    }
// // // // // // // // // // // //    else
// // // // // // // // // // // //    {
// // // // // // // // // // // //        freq--; //if different decrease freq
// // // // // // // // // // // //    }
// // // // // // // // // // // //}

// // // // // // // // // // // //prefix sum array
// // // // // // // // // // // //prefix sum array is an array where each element at index i is the sum of all elements
// // // // // // // // // // // // from the start of the array to index i.
// // // // // // // // // // // // import java.util.*;
// // // // // // // // // // // // public class Solution1{
// // // // // // // // // // // //     public static void prefix(int arr[])
// // // // // // // // // // // //     {
// // // // // // // // // // // //         int n=arr.length;
// // // // // // // // // // // //         int prefix[]=new int[n];
// // // // // // // // // // // //         prefix[0]=arr[0];
// // // // // // // // // // // //         for(int i=1;i<n;i++)
// // // // // // // // // // // //         {
// // // // // // // // // // // //             prefix[i]=prefix[i-1]+arr[i];
// // // // // // // // // // // //         }
// // // // // // // // // // // //         System.out.println("Prefix sum array: " + Arrays.toString(prefix));
// // // // // // // // // // // //     }
// // // // // // // // // // // //     public static void main(String args[])
// // // // // // // // // // // //     {
// // // // // // // // // // // //         Scanner sc=new Scanner(System.in);
// // // // // // // // // // // //         System.out.println("Enter the number of elements in the array:");
// // // // // // // // // // // //         int n = sc.nextInt();
// // // // // // // // // // // //         int arr[] = new int[n];
// // // // // // // // // // // //         System.out.println("Enter the elements of the array:");
// // // // // // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // // // // // //             arr[i] = sc.nextInt();
// // // // // // // // // // // //         }
// // // // // // // // // // // //         prefix(arr);
// // // // // // // // // // // //     }
// // // // // // // // // // // // }
// // // // // // // // // // // //suffix sum array
// // // // // // // // // // // //suffix sum array is an array where each element at index i is the sum of all elements
// // // // // // // // // // // // from index i to the start of the array.
// // // // // // // // // // // // import java.util.*;
// // // // // // // // // // // // public class Solution1{
// // // // // // // // // // // //     public static void suffix(int arr[])
// // // // // // // // // // // //     {
// // // // // // // // // // // //         int n=arr.length;
// // // // // // // // // // // //         int suffix[]=new int[n];
// // // // // // // // // // // //         suffix[n-1]=arr[n-1];
// // // // // // // // // // // //         for(int i=n-2;i>=0;i--)
// // // // // // // // // // // //         {
// // // // // // // // // // // //             suffix[i]=suffix[i+1]+arr[i];       
// // // // // // // // // // // //         }
// // // // // // // // // // // //         System.out.println("Suffix sum array: " + Arrays.toString(suffix));
        
// // // // // // // // // // // //     }
// // // // // // // // // // // //     public static void main(String args[])
// // // // // // // // // // // //     {
// // // // // // // // // // // //         Scanner sc=new Scanner(System.in);
// // // // // // // // // // // //         System.out.println("Enter the number of elements in the array:");
// // // // // // // // // // // //         int n = sc.nextInt();
// // // // // // // // // // // //         int arr[] = new int[n];
// // // // // // // // // // // //         System.out.println("Enter the elements of the array:");
// // // // // // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // // // // // //             arr[i] = sc.nextInt();
// // // // // // // // // // // //         }
// // // // // // // // // // // //         suffix(arr);
// // // // // // // // // // // //     }
// // // // // // // // // // // // }

// // // // // // // // // // // // //two subarrays with equal sum
// // // // // // // // // // // // import java.util.*;
// // // // // // // // // // // // public class Solution1{
// // // // // // // // // // // //     public static void subarraysum(int arr[]){
// // // // // // // // // // // //         int n=arr.length;
// // // // // // // // // // // //         int sum=0;int ans=0;
// // // // // // // // // // // //         for(int i=0;i<n;i++)
// // // // // // // // // // // //         {
// // // // // // // // // // // //             sum+=arr[i];//total sum of the array
// // // // // // // // // // // //         }
// // // // // // // // // // // //         for(int i=1;i<n;i++)
// // // // // // // // // // // //         {
// // // // // // // // // // // //             arr[i]=arr[i-1]+arr[i];
// // // // // // // // // // // //             ans=arr[i]; //cumulative sum of the array
// // // // // // // // // // // //             // System.out.println("Cumulative sum at index " + i + ": " + ans);
// // // // // // // // // // // //             if(ans==sum-ans) //if cumulative sum is equal to half of total sum
// // // // // // // // // // // //             {
// // // // // // // // // // // //                 System.out.println("Two subarrays with equal sum found at index: " + i);
// // // // // // // // // // // //                 return; // Exit after finding the first pair
// // // // // // // // // // // //             }
// // // // // // // // // // // //         }
// // // // // // // // // // // //     }
// // // // // // // // // // // //     public static void main(String args[])
// // // // // // // // // // // //     {
// // // // // // // // // // // //         Scanner sc=new Scanner(System.in);
// // // // // // // // // // // //         System.out.println("Enter the number of elements in the array:");
// // // // // // // // // // // //         int n = sc.nextInt();
// // // // // // // // // // // //         int arr[] = new int[n];
// // // // // // // // // // // //         System.out.println("Enter the elements of the array:");
// // // // // // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // // // // // //             arr[i] = sc.nextInt();
// // // // // // // // // // // //         }
// // // // // // // // // // // //         subarraysum(arr);
// // // // // // // // // // // //     }
// // // // // // // // // // // // }

// // // // // // // // // // // //sum of elements between two indices
// // // // // // // // // // // import java.util.*;

// // // // // // // // // // // public class Solution1 {

// // // // // // // // // // //     public static int[] buildPrefixSum(int arr[]) {
// // // // // // // // // // //         int n = arr.length;
// // // // // // // // // // //         int[] prefixSum = new int[n];
// // // // // // // // // // //         prefixSum[0] = arr[0];
// // // // // // // // // // //         for (int i = 1; i < n; i++) {
// // // // // // // // // // //             prefixSum[i] = prefixSum[i - 1] + arr[i];
// // // // // // // // // // //         // }
// // // // // // // // // // //         return prefixSum;
// // // // // // // // // // //     }

// // // // // // // // // // //     public static int rangeSum(int[] prefixSum, int start, int end) {
// // // // // // // // // // //         if (start == 0) return prefixSum[end];
// // // // // // // // // // //         return prefixSum[end] - prefixSum[start - 1];
// // // // // // // // // // //     }

// // // // // // // // // // //     public static void main(String args[]) {
// // // // // // // // // // //         Scanner sc = new Scanner(System.in);
// // // // // // // // // // //         System.out.println("Enter the number of elements in the array:");
// // // // // // // // // // //         int n = sc.nextInt();
// // // // // // // // // // //         int arr[] = new int[n];

// // // // // // // // // // //         System.out.println("Enter the elements of the array:");
// // // // // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // // // // //             arr[i] = sc.nextInt();
// // // // // // // // // // //         }

// // // // // // // // // // //         System.out.println("Enter the starting index:");
// // // // // // // // // // //         int startIndex = sc.nextInt();

// // // // // // // // // // //         System.out.println("Enter the ending index:");
// // // // // // // // // // //         int endIndex = sc.nextInt();

// // // // // // // // // // //         // Step 1: Build prefix sum
// // // // // // // // // // //         int[] prefixSum = buildPrefixSum(arr);

// // // // // // // // // // //         // Step 2: Get the sum of subarray [startIndex...endIndex]
// // // // // // // // // // //         int totalSum = rangeSum(prefixSum, startIndex, endIndex);
// // // // // // // // // // //         System.out.println("Total sum: " + totalSum);
// // // // // // // // // // //     }
// // // // // // // // // // // }
// // // // // // // // // // // // This code builds a prefix sum array and calculates the sum of elements between two indices efficiently.

// // // // // // // // // // //3sum
//better  approach is to use a hashset and iterate using 2 pointers,i being 1st element j being second element and adding them to see what negative/positive value is needed to get the sum to 0
//if any triplet of sum 0 is found then add the triplet to the hashset
//optimal approach is kind of similar but we first sort the array and we use 3 variables i,j and k
//i remains fixed as 1st element for each iteration and j starts from i+1 and k starts from n-1 and goes until j<k 
//goal is to find combinations of i+j+k=0 but if j exceeds k or one combination is acquired all 3 changes 
//the change is not just limited to +1 but until a new element is encountered in the array
// // // // // // // // // // import java.util.*;
// // // // // // // // // // class Solution1{
// // // // // // // // // //     public static void sum(int a[]) 
// // // // // // // // // //     {
// // // // // // // // // //         HashSet<List<Integer>> set= new HashSet<>();
// // // // // // // // // //         Arrays.sort(a);
// // // // // // // // // //         int n = a.length;
// // // // // // // // // //         for(int i=0;i<n;i++)
// // // // // // // // // //         {
// // // // // // // // // //             if(i>0 && a[i] == a[i-1]) continue; // Skip duplicates for the first element
// // // // // // // // // //             int j=i+1;
// // // // // // // // // //             int k=n-1;
// // // // // // // // // //             while(j<k)
// // // // // // // // // //             {
// // // // // // // // // //                 int sum=a[i]+a[j]+a[k];
// // // // // // // // // //                 if(sum<0)
// // // // // // // // // //                 {
// // // // // // // // // //                     j++;
// // // // // // // // // //                 }
// // // // // // // // // //                 else if(sum>0)
// // // // // // // // // //                 {
// // // // // // // // // //                     k--;
// // // // // // // // // //                 }
// // // // // // // // // //                 else
// // // // // // // // // //                 {
// // // // // // // // // //                     List<Integer> triple = Arrays.asList(a[i], a[j], a[k]);
// // // // // // // // // //                     set.add(triple);
// // // // // // // // // //                     j++;
// // // // // // // // // //                     k--;
// // // // // // // // // //                     while(j<k && a[j] == a[j+1]) j++; // Skip duplicates for the second element
// // // // // // // // // //                     while(j<k && a[k] == a[k-1]) k--; // Skip duplicates for the third element
                     
// // // // // // // // // //                 }
// // // // // // // // // //                 }
// // // // // // // // // //                 }
// // // // // // // // // //                 System.out.println("Triplets with sum zero: " + set);
// // // // // // // // // //             }
// // // // // // // // // //     public static void main(String args[])
// // // // // // // // // //     {
// // // // // // // // // //         Scanner sc = new Scanner(System.in);
// // // // // // // // // //         System.out.println("Enter the number of elements in the array:");
// // // // // // // // // //         int n = sc.nextInt();
// // // // // // // // // //         int arr[] = new int[n];
// // // // // // // // // //         System.out.println("Enter the elements of the array:");
// // // // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // // // //             arr[i] = sc.nextInt();
// // // // // // // // // //         }
// // // // // // // // // //         sum(arr);
// // // // // // // // // //         }
// // // // // // // // // //     }

// // // // // // // // // //one pointer starts from start,one from end and one from start+1
// // // // // // // // // //if sum is <0 then increase start+1 pointer
// // // // // // // // // //if sum is >0 then decrease end pointer
// // // // // // // // // //if sum=0 then add to set and increase start+1 pointer and decrease end pointer
// // // // // // // // // //skip duplicates for start+1 and end pointers to avoid repeated triplets
// // // // // // // // // //if j>k increase i pointer and reset j to i+1 and k to n-1
// // // // // // // // // //this ensures that we always have unique triplets in the set

// // // // // // // // // //4sum
// // // // // // // // // import java.util.*;  
// // // // // // // // // class Solution1 {
// // // // // // // // //     public static void fourSum(int[] nums, int target) {
// // // // // // // // //         Arrays.sort(nums);
// // // // // // // // //         int n=nums.length;
// // // // // // // // //         HashSet<List<Integer>> set = new HashSet<>();
// // // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // // //             if(i>0 && nums[i]==nums[i-1])
// // // // // // // // //             {
// // // // // // // // //                 continue;
// // // // // // // // //             }
// // // // // // // // //             for(int j=i+1;j<n;j++)
// // // // // // // // //             {
// // // // // // // // //                 if(j>i+1 && nums[j]==nums[j-1]) // Skip duplicates for the second element
// // // // // // // // //                 {
// // // // // // // // //                     continue;
// // // // // // // // //             }
// // // // // // // // //             int k=j+1;
// // // // // // // // //             int l=n-1;
// // // // // // // // //             while(k<l)
// // // // // // // // //             {
// // // // // // // // //                 int sum=nums[i]+nums[j]+nums[k]+nums[l];
// // // // // // // // //                 if(sum<target)
// // // // // // // // //                 {
// // // // // // // // //                     k++;
// // // // // // // // //                 }
// // // // // // // // //                 else if(sum > target)
// // // // // // // // //                 {
// // // // // // // // //                     l--;
// // // // // // // // //                 }
// // // // // // // // //                 else{
// // // // // // // // //                     set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
// // // // // // // // //                     k++;
// // // // // // // // //                     l--;
// // // // // // // // //                     while(k<l && nums[k]==nums[k-1]) k++; // Skip duplicates
// // // // // // // // //                     while(k<l && nums[l]==nums[l+1]) l--; // Skip duplicates
// // // // // // // // //                 }
// // // // // // // // //             }
// // // // // // // // //         }
// // // // // // // // //     }
// // // // // // // // //     System.out.println("Quadruplets with sum " + target + ": " + set);
// // // // // // // // // }
// // // // // // // // //     public static void main(String[] args) {
// // // // // // // // //         Scanner sc = new Scanner(System.in);
// // // // // // // // //         System.out.println("Enter the number of elements in the array:");
// // // // // // // // //         int n = sc.nextInt();
// // // // // // // // //         int arr[] = new int[n];
// // // // // // // // //         System.out.println("Enter the elements of the array:");
// // // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // // //             arr[i] = sc.nextInt();
// // // // // // // // //         }
// // // // // // // // //         System.out.println("Enter the target sum:");
// // // // // // // // //         int target = sc.nextInt();
// // // // // // // // //         fourSum(arr, target);
// // // // // // // // //     // }
// // // // // // // // // }

// // // // // // // // //Dutch National Flag Problem
// // // // // // // // // This problem involves sorting an array of 0s, 1s, and 2s in a single pass.
// // // // // // // // // The idea is to maintain three pointers: low, mid, and high
// // // // // // // // // low points to the next position for 0, mid is the current element being processed,
// // // // // // // // // and high points to the next position for 2.
// // // // // // // // import java.util.Arrays;
// // // // // // // // import java.util.*;
// // // // // // // // class Solution1{
// // // // // // // //     public static void dutch(int arr[]){
// // // // // // // //         int n=arr.length;
// // // // // // // //         int low=0,mid=0,high=n-1;
// // // // // // // //         while(mid<=high)
// // // // // // // //         {
// // // // // // // //             if(arr[mid]==0)
// // // // // // // //             {
// // // // // // // //                 int temp=arr[low];
// // // // // // // //                 arr[low]=arr[mid];
// // // // // // // //                 arr[mid]=temp;
// // // // // // // //                 low++;
// // // // // // // //                 mid++;
// // // // // // // //             }
// // // // // // // //             else if(arr[mid]==1)
// // // // // // // //             {
// // // // // // // //                 mid++;
// // // // // // // //             }
// // // // // // // //             else if(arr[mid]==2)
// // // // // // // //             {
// // // // // // // //                 int temp=arr[mid];
// // // // // // // //                 arr[high]=arr[mid];
// // // // // // // //                 arr[mid]=temp;
// // // // // // // //                 high--;
// // // // // // // //             }
// // // // // // // //         }
// // // // // // // //             System.out.println("Sorted array: " + Arrays.toString(arr));

// // // // // // // //     }
// // // // // // // //     public static void main(String args[]) {
// // // // // // // //         Scanner sc = new Scanner(System.in);
// // // // // // // //         System.out.println("Enter the number of elements in the array:");
// // // // // // // //         int n = sc.nextInt();
// // // // // // // //         int arr[] = new int[n];
// // // // // // // //         System.out.println("Enter the elements of the array (0s, 1s, and 2s):");
// // // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // // //             arr[i] = sc.nextInt();
// // // // // // // //         }
// // // // // // // //         dutch(arr);
// // // // // // // //     }
// // // // // // // // }
// // // // // // // // // This code sorts the array in a single pass using the Dutch National Flag algorithm.
// // // // // // // // // It maintains three pointers to ensure that all 0s are at the beginning, 1s in the middle, and 2s at the end.
// // // // // // // // // The time complexity is O(n)
// // // // // // // // // and the space complexity is O(1) since it sorts the array in place.
// // // // // // // // //First low and mid starts from 0 then it checks the value at mid
// // // // // // // // //if it is 0 then it swaps the value at low and mid and increments both pointers
// // // // // // // // //if it is 1 then it increments mid pointer
// // // // // // // // //if it is 2 then it swaps the value at mid and high and decrements high
// // // // // // // // //this ensures that all 0s are at the beginning, 1s in the middle
// // // // // // // // //and 2s at the end of the array in a single pass.

// // // // // // // //find leaders in the array
// // // // // // // // A leader in an array is an element that is greater than all the elements to its right
// // // // // // // // The rightmost element is always a leader.
// // // // // // // import java.util.*;
// // // // // // // class Solution1 {
// // // // // // //     public static void findLeaders(int arr[]) {
// // // // // // //         int n = arr.length;
// // // // // // //         int max=0;
// // // // // // //         List<Integer> leaders = new ArrayList<>();
// // // // // // //         for (int i = n - 1; i >= 0; i--) {
// // // // // // //             if (arr[i] > max) {
// // // // // // //                 max = arr[i];
// // // // // // //                 leaders.add(arr[i]);
// // // // // // //             }
// // // // // // //         }
// // // // // // //         Collections.reverse(leaders); // Reverse the list to maintain original order
// // // // // // //         System.out.println("Leaders in the array: " + leaders);
// // // // // // //     }
// // // // // // //     public static void main(String args[]) {
// // // // // // //         Scanner sc = new Scanner(System.in);
// // // // // // //         System.out.println("Enter the number of elements in the array:");
// // // // // // //         int n = sc.nextInt();
// // // // // // //         int arr[] = new int[n];
// // // // // // //         System.out.println("Enter the elements of the array:");
// // // // // // //         for (int i = 0; i < n; i++) {
// // // // // // //             arr[i] = sc.nextInt();
// // // // // // //         }
// // // // // // //         findLeaders(arr);
// // // // // // //     }
// // // // // // // }

// // // // // // //longest consecutive sequence
//brute force approach is to iterate in a for loop then a nested while where loop continues until consecutive elements are acquired
//better approach is to sort the array and then iterate through it,if diff between last element and present element is 1 then increase length of consecutive sequence +1 else if same elements then just continue else if >1 gap then reset count to 0 and change last element 
// // // // // // // This problem involves finding the longest consecutive sequence of numbers in an unsorted array.
// // // // // // // The idea is to use a HashSet to store the elements and then iterate through the array
// // // // // // // to find the longest sequence starting from each element.
// // // // // // import java.util.*;
// // // // // // class Solution1{
// // // // // //     public static void longest(int arr[]){
// // // // // //         int n=arr.length;
// // // // // //         HashSet<Integer>set=new HashSet<>();
// // // // // //         int longest=1;
// // // // // //         for(int i=0;i<n;i++)
// // // // // //         {
// // // // // //             set.add(arr[i]); // Add all elements to the HashSet
// // // // // //         }
// // // // // //         for(int i=0;i<n;i++)
// // // // // //         {   
// // // // // //             if(set.contains(arr[i])) // Check if the element is in the set
// // // // // //             {
// // // // // //                 int current=arr[i];
// // // // // //                 int count=1;
// // // // // //                 set.remove(arr[i]); // Remove the element to avoid counting it again
// // // // // //                 while(set.contains(current+1)) // Check for consecutive elements
// // // // // //                 {
// // // // // //                     current++;
// // // // // //                     count++;
// // // // // //                     set.remove(current); // Remove the element to avoid counting it again
// // // // // //                 }
// // // // // //                 current=arr[i];
// // // // // //                 //System.out.println("Current element: " + current);
// // // // // //                 while(set.contains(current-1)) // Check for consecutive elements in the opposite direction
// // // // // //                 {
// // // // // //                     current--;
// // // // // //                     count++;
// // // // // //                     set.remove(current); // Remove the element to avoid counting it again
// // // // // //                 }
// // // // // //                 longest=Math.max(longest,count); // Update longest sequence found
// // // // // //             }

// // // // // //         }
// // // // // //         System.out.println("Longest consecutive sequence length: " + longest);
// // // // // //     }
// // // // // //     public static void main(String args[]) {
// // // // // //         Scanner sc = new Scanner(System.in);
// // // // // //         System.out.println("Enter the number of elements in the array:");
// // // // // //         int n = sc.nextInt();
// // // // // //         int arr[] = new int[n];
// // // // // //         System.out.println("Enter the elements of the array:");
// // // // // //         for (int i = 0; i < n; i++) {
// // // // // //             arr[i] = sc.nextInt();
// // // // // //         }
// // // // // //         longest(arr);
// // // // // //     }

// // // // // // }

// // // // // // This code finds the longest consecutive sequence in an unsorted array using a HashSet.
// // // // // // It iterates through the array, checking for consecutive elements in both directions.
// // // // // // The time complexity is O(n) on average, and the space complexity is O(n)

//longest subarray with sum k for array with positive and negative elements 
//brute force approach is using 3 loops,i loop for each element,j loop for traversing from start to end and k loop to check for sum and then j loop again to store the max length if sum matched
//better approach is to use prefix sum and store it in hashmap and then check if x-k is present in the hashmap for corresponding k ,if present then checking for length and storing the max length
//HashMap <Integer,Integer> PrefixSum;
//int sum=0,maxL=0;
//for(int i=0;i<a.length;i++)
//{
//sum+=a[i];
//if(sum==k){maxL=max(maxL,i+1)}
//int rem=sum-k;
//if(PrefixSum.find(rem)!=PrefixSum.end()){
//int len=i-PrefixSum(rem);
//maxL=max(maxL,len)}
//if(PrefixSum.find(rem)==PrefixSum.end()){
//PrefixSum[sum]=i;
//}}
//return maxL;
//optimal solution is to have 2 loops,i for each element and j to traverse through the array
//keep adding until sum reached and on reaching make max length=3
//after that on adding another element sum exceeds the max sum so remove one element from start that is from i
//increase i by one position and remove the earlier position value from sum
//repeat this until array ends
// int left=0,right=0;
// int sum=a[0]; //initializing with 1st element
// int maxL=0;
// //while(right < a.length)
// {
//     while(left < =right && sum >k) //when sum will exceed max sum
//     {
//         sum-=a[left];
//         left++; 
//     }
//     if(sum==k)
//     {
//         maxL=max(maxL,right-left+1)
//     }
//     right++;
//     if(right < n) sum+=a[right]; //keep adding numbers in sum
// }
// return maxL;
// // // // // //rotate matrix 90 degrees clockwise
// // // // // //transpose the matrix and then reverse each row
// // // // // import java.util.*;
// // // // // import java.util.Arrays;
// // // // // class Solution1 {
// // // // //     public static void rotateMatrix(int[][] matrix,int r,int c) {
// // // // //         // int n=matrix.length;
// // // // //         // Step 1: Transpose the matrix
// // // // //         for(int i=0;i<r;i++)
// // // // //         {
// // // // //             for(int j=i;j<c;j++)
// // // // //             {
// // // // //                 matrix[j][i]=matrix[i][j];
// // // // //             }
// // // // //         }
// // // // //         for(int i=0;i<r;i++)
// // // // //         {
// // // // //             // Step 2: Reverse each row
// // // // //             int start=0;
// // // // //             int end=c-1;
// // // // //             while(start<end)
// // // // //             {
// // // // //                 int temp=matrix[i][start];
// // // // //                 matrix[i][start]=matrix[i][end];
// // // // //                 matrix[i][end]=temp;
// // // // //                 start++;
// // // // //                 end--;
// // // // //             }
// // // // //         }
// // // // //         // Print the rotated matrix
// // // // //         System.out.println("Rotated matrix:");
// // // // //         for(int i=0;i<r;i++)
// // // // //         {
// // // // //             for(int j=0;j<c;j++)
// // // // //             {
// // // // //                 System.out.print(matrix[i][j] + " ");
// // // // //             }
// // // // //             System.out.println();
// // // // //     }
        
// // // // //     }
// // // // //     public static void main(String args[]) {
// // // // //         Scanner sc = new Scanner(System.in);
// // // // //         System.out.println("Enter the number of rows in the matrix:");
// // // // //         int r = sc.nextInt();           
// // // // //         System.out.println("Enter the number of columns in the matrix:");
// // // // //         int c = sc.nextInt();
// // // // //         int[][] matrix = new int[r][c];
// // // // //         System.out.println("Enter the elements of the matrix:");
// // // // //         for (int i = 0; i < r; i++) {
// // // // //             for (int j = 0; j < c; j++) {
// // // // //                 matrix[i][j] = sc.nextInt();
// // // // //             }
// // // // //         }
// // // // //         rotateMatrix(matrix,r,c);

// // // // // }
// // // // // }

// // // // //spiral traversal of matrix
// // // // // This problem involves traversing a matrix in a spiral order.
// // // // // The idea is to maintain four boundaries: top, bottom, left, and right,
// // // // // and then iterate through the matrix in a spiral manner until all elements are traversed.
// // // //top starts with 0, bottom with c-1, left with 0, and right with c-1
// // // //while loop continues until top <= bottom and left <= right
// // // //first the first row is traversed then keeping the column fixed top to bottom is traversed for the right column
// // // //then the last row is traversed from right to left if top <= bottom
// // // //then the left column is traversed from bottom to top if left <= right
// // // //this ensures that all elements are traversed in a spiral manner
// // // // import java.util.*;
// // // // class Solution1{
// // // //     public static void spiral(int nums[][],int r,int c)
// // // //     {
// // // //         int top=0,bottom=c-1,left=0,right=c-1;
// // // //         while(top<=bottom && left<=right)
// // // //         {
// // // //         for(int i=left;i<=right;i++)
// // // //         {
// // // //             System.out.print(nums[top][i] + " ");
// // // //         }
// // // //         top++;
// // // //         for(int i=top;i<=bottom;i++)
// // // //         {
// // // //             System.out.print(nums[i][right] + " ");
// // // //         }
// // // //         right--;
// // // //         if(top<=bottom) { // Check if boundaries are crossed
// // // //         for(int i=right;i>=left;i--)
// // // //         {
// // // //             System.out.print(nums[bottom][i] + " ");
// // // //         }
// // // //         bottom--;
// // // //     }
// // // //     if(left<=right) { // Check if boundaries are crossed
// // // //         for(int i=bottom;i>=top;i--)
// // // //         {
// // // //             System.out.print(nums[i][left] + " ");
// // // //         }
// // // //         left++;
// // // //         }
// // // //     }
// // // //         System.out.println();

// // // //     }
// // // //     public static void main(String args[]) {
// // // //         Scanner sc = new Scanner(System.in);
// // // //         System.out.println("Enter the number of rows in the matrix:");
// // // //         int r = sc.nextInt();           
// // // //         System.out.println("Enter the number of columns in the matrix:");
// // // //         int c = sc.nextInt();
// // // //         int[][] nums = new int[r][c];
// // // //         System.out.println("Enter the elements of the matrix:");
// // // //         for (int i = 0; i < r; i++) {
// // // //             for (int j = 0; j < c; j++) {
// // // //                 nums[i][j] = sc.nextInt();
// // // //             }
// // // //         }
// // // //         spiral(nums,r,c);
// // // //     }
// // // // }

// // // //pascals triangle
//val=val*(row-col)/col; is the formula using binomial
// // // import java.util.*;
// // // class Solution1 {
// // //     public static void pascalTriangle(int n) {
// // //         for(int i=1;i<=n;i++)
// // //         {
// // //             for(int j=n;j>i;j--)
// // //             {
// // //                 System.out.print(" ");
// // //             }
// // //             int a=(int)Math.pow(11,i-1);
// // //             String s=Integer.toString(a);
// // //             for(int j=0;j<s.length();j++)
// // //             {
// // //                 System.out.print(s.charAt(j) + " ");
// // //             }
// // //             System.out.println();
// // //         }
// // //     }
// // //     public static void main(String args[]) {
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.println("Enter the number of rows in Pascal's Triangle:");
// // //         int n = sc.nextInt();
// // //         pascalTriangle(n);
// // //     }
// // // }

// // // //To solve nCr
// // // //res=1;
// // // //for(int i=0;i<r;i++)
// // // //{
// // // //res=res*(n-i);
// // // //res=res/(i+1);
// // // //}

// // //missing and repeating number
// // // This problem involves finding the missing and repeating numbers in an array of size n where elements are from 1 to n.
// // // The idea is to use the properties of the array and the sum of the first n natural numbers.
// // // The sum of the first n natural numbers is given by the formula n * (n + 1) / 2.
// // // The sum of the squares of the first n natural numbers is given by the formula n * (n + 1) * (2n + 1) / 6.
// // // We can calculate the expected sum and the expected sum of squares,
// // // and then compare them with the actual sum and the actual sum of squares to find the missing and repeating numbers.
// // // import java.util.*;
// // // class Solution1{
// // //     public static void calc(int nums[])
// // //     {
// // //         int n=nums.length;
// // //         int sum1=n*(n+1)/2; // Expected sum of first n natural numbers
// // //         int sum2=n*(n+1)*(2*n+1)/6; // Expected sum of squares of first n natural numbers
// // //         int actualSum=0,actualSum2=0;
// // //         for(int i=0;i<n;i++)
// // //         {
// // //             actualSum+=nums[i]; // Actual sum of elements in the array
// // //             actualSum2+=nums[i]*nums[i]; // Actual sum of squares of elements in the array
// // //         }
// // //         int diff=actualSum-sum1; // Difference between actual sum and expected sum
// // //         int diff2=actualSum2-sum2; // Difference between actual sum of squares and expected sum of squares
// // //         diff2=diff2/diff; // The sum of the missing and repeating numbers
// // //         int repeating=(diff2+diff)/2; // The repeating number
// // //         int missing=repeating-diff; // The missing number
// // //         System.out.println("Missing number: " + missing);
// // //         System.out.println("Repeating number: " + repeating);

// // //     }
// // //     public static void main(String args[])
// // //     {
// // //         Scanner sc=new Scanner(System.in);
// // //         System.out.println("Enter the number of elements in the array:");
// // //         int n = sc.nextInt();
// // //         int nums[] = new int[n];
// // //         System.out.println("Enter the elements of the array:");
// // //         for (int i = 0; i < n; i++) {
// // //             nums[i] = sc.nextInt();
// // //         }
// // //         calc(nums);
// // //     }
// // // }
 
// // //count inversion
// // //count the number of pairs where the left side is greater than the right side of the array
// // //this is basically merge sort with added count 
// // import java.util.*;
// // class Solution1 {
// //     public static int merge(int arr[], int low, int mid, int high){
// //         int count=0;
// //         int left = low;
// //         int right = mid + 1;
// //         while(left<=mid && right <=high)
// //         {
// //             if(arr[left]>arr[right])
// //             {
// //                 count+=mid-left+1; // Count the number of inversions
// //                 right++;
// //             }
//             left++; 
// //         }
// //         return count;


// //     }
// //     public static int mergeSort(int arr[], int low, int high){
// //         int count=0;
// //         if(low<high)
// //         {
// //             int mid=(low+high)/2;
// //             count+=mergeSort(arr,low,mid); // Count inversions in left half
// //             count+=mergeSort(arr,mid+1,high); // Count inversions in right half
// //             count+=merge(arr,low,mid,high); // Count inversions during merge
// //         }
// //         return count;
// //     }
// //     public static void countInversions(int arr[]) {
// //         int n = arr.length;
// //         int count = mergeSort(arr,0, n - 1);
// //         System.out.println("Number of inversions: " + count);
// //     }
// //     public static void main(String args[]) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter the number of elements in the array:");
// //         int n = sc.nextInt();
// //         int arr[] = new int[n];
// //         System.out.println("Enter the elements of the array:");
// //         for (int i = 0; i < n; i++) {
// //             arr[i] = sc.nextInt();
// //         }
// //         countInversions(arr);
// //     }
// // }


// //maximum product subarray without using kadanes algorithm
// //this problem solves by finding product of suffix and on recieving 0 we reset the product to 1
// import java.util.*;
// class Solution1{
//     public static void mul(int nums[])
//     {
//         int prefix=1,suffix=1;
//         int n=nums.length;
//         int max=0;
//         for(int i=0;i<n;i++)
//         {
//             prefix*=nums[i];
//             suffix*=nums[n-i-1];
//             max=Math.max(max,Math.max(prefix,suffix));
//             if(prefix==0) prefix=1; // Reset prefix product to 1 on encountering 0
//             if(suffix==0) suffix=1; // Reset suffix product to 1 on encountering 0
//         }
//         System.out.println("Maximum product subarray: " + max);
//         }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         mul(arr);
//     }
// }


//KTH LARGEST ELEMENT IN ARRAY
// Arrays.sort(nums); // Sort ascending
//         return nums[nums.length - k];

//2ND LARGEST ELEMENT
// int largest=a[0];
// int second=-1;
// for(int i=1;i<n;i++)
// {
//     if(a[i]>largest)
//     {
//         second=largest;
//         largest=a[i];
//     }else if(a[i]<largest && a[i] > second){
//         second=a[i]
//     }
//     return second
// }
//rotate an array by  d indexes(brute force)
//d=d%n //this is for rotations of size greater than size of array as one complete rotation of size of array means no change in array
// temp[]=[arr[0],arr[1],arr[3]];
// for(int i=d;i<n;i++)
// {
//     arr[i-d]=a[i]
// }
// int j=0;
// for(int i=arr.length-d;i<arr.length;i++)
// {
//     arr[i]=temp[j];
//     j++;
// }

//rotate an array by d indexes(optimal)
//use reverse,first reverse 0-d then reverse d-n
// reverse(arr,0,n-d-1);
// reverse(arr,n-d,n-1);
// reverse(arr,0,n-1);

//moving 0s to end using 2 pointer
// int j=-1; //for 0s
// //this loop is to identify the 1st 0
// for(int i=0;i<n;i++)
// {
//     if(a[i]=0)
//     {
//         j=i;
//         break;
//     }
// }
//this loop is for swapping the non 0 numbers in front
// for(int i=j+1;i<n;i++)
// {
//     if(a[i]!=0)
//     {
//         swap(a[i],a[j])
//         j++;
//     }
// }
 //union of 2 sorted array
 //brute force way can be usinh hashset to insert the elements but that takes up space o (n)
 //so optimal solution is to use 2 pointer
 //one pointer for each array
 //check if element from array a is bigger or from array b
 //then check if that element already exists or not
 //if it doesnt exist then insert it in array and increment i or j
//  while(i<n1 && j<n2)
// {
//     if(a[i]<=b[j])
//     {
//         if(union.length==0 || union.back()!=a[i])
//             {
//             union.push(a[i]);
//             }
//         i++;
//         }
//     else
//     {
//         if(union.length==0 || union.back()!=b[j])
//             {
//             union.push(b[j]);
//             }
//         j++;
//     }
//     }

//     while(i<n1)
//     {
//         if(union.length==0 || union.back()!=a[i])
//             {
//             union.push(a[i]);
//             }
//         i++;
//     }
//     while(j<n2)
//     {
//         if(union.length==0 || union.back()!=b[j])
//             {
//             union.push(b[j]);
//             }
//         j++;
//     }

//next greater permutation
//to solve this first we need to identify the index where there is a drop or rise,suppose 250165..so we can see after 0 5 comes so there is a sudden hike
//that is the point from where we need to reframe the digits to get the next permutation
//now our task is to get the minimum permutation so that is the minimum permutation then break
// //next we will just reverse the remaining part
// int index=-1;
// for(int i=n-2;i>=0;i++)
// {
//     if(a[i]<a[i+1])
//     {
//         index=i;
//         break;
//     }
// }
// if(index ==-1){
//     reverse(a);
// }
// for(int i=n-1;i>ind;i--)
// {
//     if(a[i]>a[ind])
//     {
//         swap(a[i],a[ind]);
//         break;
//     }
// }
// reverse(a.begin(),ind+1,a.end())
// return a;


//number of subarrays with given sum
// //use hashmap
// //store the number of times x-k occured in hashmap and keep on increasing the prefix sum
// //if prefixsum-k is present in map then increase counter by 1
// HashMap<Integer,Integer> map;
// map[0]=1; int presum=0,c=0;
// for(int i=0;i<a.length;i++)
// {
//     presum+=a[i];
//     int remove=presum-k;
//     c+=map[remove];
//     map[presum]+=1;
// }
// return c;

//number of subarray with xor
//use a hashmap to store xor and check if x is present after doing xor ^ k
//count increasaes as much as xor present in map as those many combinations can be made

// int xr=0;
// HashMap<Integer,Integer>mpp;
// mpp[xr]++; int c=0;
// for(int i=0;i<a.length;i++)
// {
//     xr=xr^a[i];
//     int x=xr^k;
//     c+=mpp[x];
//     mpp[xr]++;

// }
// return c;


//left rotate by one index
// int first=a[0];
// for(int i=1;i<n;i++)
// {
//     a[i-1]=a[i];
// }
// a[n-1]=first;