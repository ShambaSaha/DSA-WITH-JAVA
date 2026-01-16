// //sliding window problems are when a starting and ending point has been provided and we have to look within that
// //1.constant sliding window
// //here first perform the operation on 1st instance of constant window then increment left and right until right reaches n-1
// import java.util.*;
// public class slidingwindow{
//     public static void sum(int arr[],int l,int r)
//     {
//         int n=arr.length;int sum=0;int maxsum=0;
//         for(int i=l;i<=r;i++)
//         {
//             sum+=arr[i];
//         }
//         while(r<n-1)
//         {
//             sum=sum-arr[l];//shifting the window so removing left side sum
//             l++;
//             r++;
//             sum=sum+arr[r];
//             maxsum=Math.max(maxsum,sum);
//         }
//         System.out.println("Maximum sum"+maxsum);
//     }
//     public static void main(String args[])
//     {
//         int arr[]={1,2,3,4,5,6,7,8,9};
//         int l=0,r=3; //window size is 4
//         sum(arr,l,r);
//     }
// }
//maximum points obtained from cards with conditions that you can pick from the left or right side of the array
//this is a variation of the sliding window problem where you can pick cards from either end of the array.
//the idea is to use a sliding window to calculate the maximum points you can obtain by picking cards from both ends of the array.
//the window size is determined by the number of cards you can pick, which is equal to the length of the array minus the number of cards you cannot pick.
// public class slidingwindow{
//     public static void maxpoints(int arr[],int k)
//     {
//         int n=arr.length,leftsum=0,rightsum=0;
//         for(int i=0;i<k;i++)
//         {
//             leftsum+=arr[i]; //sum of first k elements
//         }
//         int maxsum=leftsum;
//         int right=n-1; 
//         for(int j=k-1;j>=0;j--)
//         {
//             leftsum=leftsum-arr[j]; //subtract the last element of the left side
//             rightsum+=arr[right];
//             right--;
//             maxsum=Math.max((leftsum+rightsum),maxsum);//add the last element of the right side
//         }
//         System.out.println("Maximum points obtained: " + maxsum);
//     }
//     public static void main(String args[])
//     {
//         int arr[]={1,2,3,4,5,6,7,8,9};
//         int k=4; //number of cards to pick
//         maxpoints(arr,k);
//     }

// }
 //fruits in basket
 //can put maximum k types of fruits in the basket
//this is a sliding window problem where we have to find the maximum number of fruits we can collect from the basket.
import java.util.*;
public class slidingwindow{
    public static void maxFruits(int arr[],int k)
    {
        int n=arr.length;
        int left=0,right=0,max=0;
        HashMap<Integer,Integer> basket=new HashMap<>();
        while(right<n)
        {
            basket.put(arr[right],basket.getOrDefault(arr[right], 0) + 1);// add fruit to basket
            if(basket.size()>k)
            {
                while(basket.size()>k)
                {
                    basket.put(arr[left], basket.get(arr[left]) - 1); // remove fruit from basket
                    if(basket.get(arr[left]) == 0) {
                        basket.remove(arr[left]); // remove fruit type if count is zero
                    }
                    left++; // move left pointer to the right
                }
            }
            if(basket.size()<=k)
            {
                max=Math.max(max,right-left+1); // update maximum fruits collected
            }
            right++; // move right pointer to the right
        }
        System.out.println("Maximum fruits collected: " + max);

    }
    public static void main(String args[])
    {
        int arr[]={1,2,1,2,3,4,5,6,7,8,9};
        int k=3; //maximum types of fruits allowed in the basket
        maxFruits(arr,k);
    }
    
}
//this can also be done by removing the internal while loop and increasing left once each turn instead of until the basket size is less than k
//another way of solving questions where number of subarrays are asked is by finding number of subarays with sum <= k then subtracting the number of subarrays with sum <=k-1



