// // // // //sorting algorithms
// // // // //bubble sort
// // // // //does n-1 search
// // // // //worst case O(n^2),best case O(n)
// // // // //compares adjacent elements and shifts accordingly
// // // // //repeats until all the elements are sorted properly
// // // // // import java.util.Scanner;
// // // // // public class sorting {
// // // // //     public static void bubbleSort(int arr[]) {
// // // // //         int n=arr.length,temp;
// // // // //         for(int i=0;i<n-1;i++)//number of iterations is n-1
// // // // //         {
// // // // //             for(int j=0;j<n-i-1;j++)// here i means the number of elements already sorted
// // // // //             // so we need to compare only the unsorted elements
// // // // //             // j starts from 0 and goes till n-i-1 because the last i elements are already sorted
// // // // //             // so we don't need to compare them again
// // // // //             // this is the reason why bubble sort is not efficient for large arrays
// // // // //             // as it takes O(n^2) time complexity in worst case
// // // // //             // and O(n) in best case when the array is already sorted
// // // // //             // we need to compare only the unsorted elements
// // // // //             // and swap them if they are in wrong order
// // // // //                 if(arr[j]>arr[j+1]) // Compare adjacent elements
// // // // //                 {
// // // // //                     temp=arr[j];
// // // // //                     arr[j]=arr[j+1];
// // // // //                     arr[j+1]=temp; // Swap the elements
// // // // //                     // j and j+1 are used to compare adjacent elements since i is just for iterations so j covers the array
// // // // //                                     }
// // // // //             }
// // // // //         }
// // // // //         public static void main(String[] args) {
// // // // //             Scanner sc = new Scanner(System.in);
// // // // //             System.out.println("Enter the number of elements in the array:");
// // // // //             int n = sc.nextInt();
// // // // //             int arr[] = new int[n];
// // // // //             System.out.println("Enter the elements of the array:");
// // // // //             for (int i = 0; i < n; i++) {
// // // // //                 arr[i] = sc.nextInt();
// // // // //             }
// // // // //             bubbleSort(arr);
// // // // //             System.out.println("Sorted array:");
// // // // //             for (int i=0;i<arr.length;i++) {
// // // // //                 System.out.print(arr[i] + " ");
// // // // //             }
// // // // //         }
// // // // //     }


// // // // // Selection sort
// // // // // Selects the minimum element from the unsorted part and swaps it with the first unsorted
// // // // // Repeats until all elements are sorted
// // // // //one sort per iteration
// // // // //time complexity is O(n^2) in all cases
// // // // //not stable, as it can change the relative order of equal elements
// // // // //does not require any extra space, so space complexity is O(1)
// // // // //used for small arrays
// // // // //not efficient for large arrays
// // // // import java.util.Scanner;
// // // // public class sorting{
// // // //     public static void main(String args[])
// // // //     {
// // // //     int n,smallest,temp;
// // // //     Scanner sc=new Scanner(System.in);
// // // //     System.out.println("Enter the number of elements in the array:");
// // // //     n = sc.nextInt();
// // // //     int arr[] = new int[n];
// // // //     System.out.println("Enter the elements of the array:");
// // // //     for (int i = 0; i < n; i++) {
// // // //         arr[i] = sc.nextInt();
// // // //         }
// // // //     for(int i=0;i<n-1;i++)
// // // //     {
// // // //         smallest=i;//initially, the smallest element is the first unsorted element
// // // //         for(int j=i+1;j<n;j++)
// // // //     {
// // // //         if(arr[smallest]>arr[j])
// // // //         {
// // // //             smallest=j; // Find the index of the smallest element
// // // //         }
// // // //     }
// // // //         temp=arr[smallest];
// // // //         arr[smallest]=arr[i];
// // // //         arr[i]=temp; // Swap the smallest element with the first unsorted element
// // // //     }

// // // //     System.out.println("Sorted array:");
// // // //     for (int i=0;i<n;i++) {
// // // //         System.out.print(arr[i] + " ");
// // // //     }
// // // // }
// // // // }


// // // //insertion sort
// // // // Builds the sorted array one element at a time
// // // // considers 1 sorted element at first
// // // //checks with the unsorted part,if found not in order shifts this to make space for that element
// // // //time complexity is O(n^2) in worst case, O(n) in best case
// // // // import java.util.Scanner;
// // // // public class sorting {
// // // //     public static void insertionSort(int arr[]) {
// // // //         int n=arr.length;
// // // //         int current,j;
// // // //         for(int i=1;i<n;i++)
// // // //         {
// // // //             current=arr[i];
// // // //             j=i-1;//for the sorted part of the array
// // // //             while(j>=0 && arr[j]>current) // Shift elements of arr[0..i-1], that are greater than current, to one position ahead of their current position
// // // //             {
// // // //                 arr[j+1]=arr[j];
// // // //                 j--;
// // // //             }
// // // //             arr[j+1]=current;
// // // //         }
// // // //     }
// // // //     public static void main(String args[]){
// // // //         Scanner sc=new Scanner(System.in);
// // // //         int n;
// // // //         System.out.println("Enter length of array:");
// // // //         n=sc.nextInt();
// // // //         int arr[]=new int[n];
// // // //         System.out.println("Enter elements of array:");
// // // //         for(int i=0;i<n;i++)
// // // //         {
// // // //             arr[i]=sc.nextInt();
// // // //         }
// // // //         insertionSort(arr);
// // // //         System.out.println("Sorted array:");
// // // //         for(int i=0;i<n;i++)
// // // //         {
// // // //             System.out.print(arr[i] + " ");
// // // //         }
// // // //     }
// // // // }
// // // //algorithm explanation:
// // // //for input 7 0 2 1 9 first j=0th position it checks if 7>0 which is true so  a[j+1] or a[1] becomes 7 and j becomes -1
// // // //then a[j+1] or a[0] becomes current which is 0
// // // //so the array becomes 0 7 2 1 9
// // // //for next iteration,i=2 and j=1, current=2, it checks if 7>2 which is true so a[j+1] or a[2] becomes 7 and j becomes 0
// // // //then arr[j+1] or a[1] becomes 2
// // // //now the array becomes 0 2 7 1 9
// // // //for next iteration,i=3 and j=2, current=1, it checks if 7>1 which is true so a[j+1] or a[3] becomes 7 and j becomes 1
// // // //then loop again works to check if 2>1 which is true so a[j+1] or a[2] becomes 2 and j becomes 0
// // // //then arr[j+1] or a[1] becomes 1
// // // //now the array becomes 0 1 2 7 9
// // // //for next iteration,i=4 and j=3, current=9, it checks if 7>9 which is false so it does not enter the while loop
// // // //so arr[j+1] or a[4] becomes 9
// // // //now the array becomes 0 1 2 7 9


// // // //merge sort 
// // // //divide and conquer technique
// // // //divide the array from mid until single element consisting array left
// // // //the single element array is sorted by default
// // // //now compare the elements of the array and place them in such way to make a new array which is sorted
// // // //copy the new array to the original array
// // // //time complexity is O(n log n) in all cases
// // // //space complexity is O(n) as we need to create a new array to store the merged
// // // import java.util.Scanner;
// // // public class sorting
// // // {
// // //     public static void conquer(int arr[],int si,int mid,int ei)
// // //     {
// // //         int merged[]=new int[ei-si+1]; //merged array
// // //         int idx1=si; // for left division of the array
// // //         int idx2=mid+1;    // for right division of the array
// // //         int x=0; //index for merged array
// // //         while(idx1<=mid && idx2<=ei) //while both array has elements
// // //         {
// // //             if(arr[idx1]<=arr[idx2]) //checking which element is smaller
// // //             {
// // //                 merged[x]=arr[idx1]; //if left part element is smaller, add it to merged array
// // //                 idx1++;
// // //                 x++;
// // //             }
// // //             else
// // //             {
// // //                 merged[x]=arr[idx2]; //if right part element is smaller, add it to merged array
// // //                 idx2++;
// // //                 x++;
// // //             }
// // //         }
// // //         while(idx1<=mid) // if left part has elements remaining
// // //         //this is done to copy the remaining elements of the left part to the merged array
// // //         {
// // //             merged[x]=arr[idx1]; //if left part has elements, add them to merged array
// // //             idx1++;
// // //             x++;
// // //         }
// // //         while(idx2<=ei) // if right part has elements remaining
// // //         //this is done to copy the remaining elements of the right part to the merged array
// // //         {
// // //             merged[x]=arr[idx2]; //if right part has elements, add them to merged array
// // //             idx2++;
// // //             x++;
// // //         }
// // //         for(int i=0,j=si;i<merged.length;i++,j++) //copy the merged array to the original array
// // //         {
// // //             arr[j]=merged[i];
// // //         }

// // //     }
// // //     public static void divide(int arr[],int si,int ei){
// // //         int mid=si+(ei-si)/2; //mid is calculated to avoid overflow as doing mid=(si+ei)/2 can cause overflow for large values of si and ei
// // //         if(si>=ei) //if the array has only one element, it is already sorted
// // //         {
// // //             return;
// // //         }
// // //         divide(arr,si,mid);//left division of the array
// // //         divide(arr,mid+1,ei);//right division of the array
// // //         conquer(arr,si,mid,ei); //merge the two sorted halves
// // //     }
// // //     public static void main(String args[])
// // //     {
// // //         Scanner sc=new Scanner(System.in);
// // //         System.out.println("Enter the number of elements in the array:");
// // //         int n=sc.nextInt();
// // //         int arr[]=new int[n];
// // //         System.out.println("Enter the elements of the array:");
// // //         for(int i=0;i<n;i++)
// // //         {
// // //             arr[i]=sc.nextInt();
// // //         }
// // //         divide(arr,0,n-1); //call divide function to sort the array
// // //         System.out.println("Sorted array:");
// // //         for(int i=0;i<n;i++)
// // //         {
// // //             System.out.print(arr[i]+" ");
// // //         }
// // //     }
// // // }

// // // // // Quick sort
// // // //pivot is the element around which sorting is done
// // // //partition is dividing the array accordingly
// // // //pivot can be chosen on the basis of 1.random 2.1st element 3.last element 4.median
// // // //low is for starting index,high is for ending index and i is for placing the elements
// // // //time complexity is O(n log n) in average case, O(n^2) in worst case 
// // // //worst case occurs when the pivot is always the smallest or largest element
// // // //space complexity is O(log n) as it uses recursion stack space
// // // //it is an in-place sorting algorithm as it does not require any extra space
// // // //it is a divide and conquer algorithm
// // // //it is not a stable sorting algorithm as it can change the relative order of equal elements
// // // //it is used for large arrays as it is faster than other sorting algorithms like bubble sort,
// // // import java.util.Scanner;
// // // public class sorting {
// // //     public static void quickSort(int arr[],int low,int high)
// // //     {
// // //         if(low<high)
// // //         {
// // //             int pid=partition(arr,low,high); //partition the array and get the pivot index
// // //             quickSort(arr,low,pid-1); //sort the left part of the array
// // //             quickSort(arr,pid+1,high); //sort the right part of the array
// // //         }
// // //     }
// // //     public static int partition(int arr[],int low,int high)
// // //     {
// // //         int pivot=arr[high];
// // //         int i=low-1; //i is for placing the elements smaller than pivot
// // //         for(int j=low;j<high;j++)
// // //         {
// // //             if(arr[j]<pivot) //if the current element is smaller than pivot
// // //             {
// // //                 i++;
// // //                 int temp=arr[i]; //swap the elements
// // //                 arr[i]=arr[j];
// // //                 arr[j]=temp; //swap the elements smaller than pivot to the left side
// // //             }

// // //         }
// // //         i++;
// // //         int temp=arr[i]; //swap the pivot element to its correct position
// // //         arr[i]=pivot;
// // //         arr[high]=temp; //swap the pivot element to its correct position
// // //         return i; //return the pivot index

// // //     }
// // //     public static void main(String args[])
// // //     {
// // //         Scanner sc=new Scanner(System.in);
// // //         System.out.println("Enter the number of elements in the array:");
// // //         int n=sc.nextInt();
// // //         int arr[]=new int[n];
// // //         System.out.println("Enter the elements of the array:");
// // //         for(int i=0;i<n;i++)
// // //         {
// // //             arr[i]=sc.nextInt();
// // //         }
// // //         quickSort(arr,0,n-1); //call quickSort function to sort the array
// // //         System.out.println("Sorted array:");
// // //         for(int i=0;i<n;i++)
// // //         {
// // //             System.out.print(arr[i]+" ");
// // //         }
// // //     }
// // // }

// // // if array is 5,3,0,1,4
// // //pivot if taken is 4
// // //i is -1,low is 0,high is 4
// // //j starts with 0 and checks if a[0]<pivot which is false
// // //so i remains -1 and j becomes 1
// // //j checks if a[1]<pivot which is true
// // //so i becomes 0 and a[0] and a[1] are swapped
// // //now i is 0 and j is 2
// // // and updated array is 3,5,0,1,4
// // //then,j checks if a[2]<pivot which is true
// // //so i becomes 1 and a[1] and a[2] are swapped
// // //now i is 1 and j is 3
// // //and updated array is 3,0,5,1,4
// // //then,j checks if a[3]<pivot which is true
// // //so i becomes 2 and a[2] and a[3] are swapped
// // //now i is 2 and j is 4
// // //and updated array is 3,0,1,5,4
// // //after the loop ends, i becomes 3 and j is 4
// // //a[3] and pivot are swapped
// // //so the array becomes 3,0,1,4,5
// // //now the pivot index is 3
// // //and the array is divided into two parts, left part is 3,0,1
// // //and right part is 5
// // //now quickSort is called on left part and right part
// // //for left part, pivot is 1
// // //i is -1,low is 0,high is 2
// // //j starts with 0 and checks if a[0]<pivot which is false
// // //so i remains -1 and j becomes 1
// // //j checks if a[1]<pivot which is true
// // //so i becomes 0 and a[0] and a[1] are swapped
// // //now i is 0 and j is 2
// // //and updated array is 0,3,1,4,5
// // //then,j checks if a[2]<pivot which is false
// // //so i remains 0 and j becomes 3
// // //after the loop ends, i becomes 1 and j is 3
// // //a[1] and pivot are swapped
// // //so the array becomes 0,1,3,4,5
// // //now the pivot index is 1
// // //and the array is divided into two parts, left part is 0
// // //and right part is 3
// // //now quickSort is called on left part and right part
// // //for left part, pivot is 0
// // //i is -1,low is 0,high is 0
// // //since low is not less than high, the function returns
// // //for right part, pivot is 3
// // //i is 0,low is 2,high is 2
// // //since low is not less than high, the function returns
// // //now the left part is sorted and the right part is also sorted
// // //so the final sorted array is 0,1,3,4,5
// // //the pivot is always the last element in the array

// // // count sort
// // //find the maximum element in the array
// // //make a new array with size maximum element+1
// // //initialise it 0
// // //find which element is present in the old array and fill in that particular index in the new array
// // //for example if 3 is present then increment 1 in 3rd index in new array
// // //after covering all elements make another new array and fill that using the second array
// // //in positions which are not 0 take those and fill that in the new array until the position count is 0
// // //time complexity is O(n + k) where n is the number of elements in the array and k is the range of the input or (O(n))
// // //space complexity is O(k) where k is the range of the input
// // //it is a non-comparison based sorting algorithm
// // //it is used for sorting integers in a specific range
// // //space is  wasted as it creates a new array of size maximum element+1 but there might not be that many elements
// // import java.util.Scanner;
// // import java.util.Arrays;
// // public class sorting{
// //     public static int max(int arr[],int n)
// //     {
// //         int max=0;
// //         for(int i=0;i<n;i++)
// //         {
// //             if(max<arr[i])
// //             {
// //                 max=arr[i];
// //             }
// //         }
// //         return max;
// //     }
// //     public static void countSort(int arr[],int n)
// //     {
// //         int m=max(arr,n);
// //         System.out.println("Maximum element in the array is: " + m);
// //         int arr2[]=new int[m+1];
// //         int a=m+1;
// //         Arrays.fill(arr2,0); //initialise the array with 0
// //         for(int i=0;i<n;i++)
// //         {
// //             arr2[arr[i]]++; //increment the count of the element in the new array
// //         }
// //         int count=0,countnew=0; //count is for array 2 and countnew is for array 1
// //         while(count<m+1)
// //         {
// //             if(arr2[count]>0)
// //             {
// //                 arr[countnew]=count; //put the element in the original array
// //                 countnew++;
// //                 arr2[count]--; //decrement the count of the element in the new array
// //             }
// //             else
// //             {
// //                 count++;
// //             }
// //         }
// //         System.out.println("Sorted array:");
// //         for(int i=0;i<n;i++)
// //         {
// //             System.out.print(arr[i]+" ");
// //         }
// //     }
// //     public static void main(String args[])
// //     {
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter the number of elements in the array:");
// //         int n=sc.nextInt();
// //         int arr[]=new int[n];
// //         System.out.println("Enter the elements of the array:");
// //         for(int i=0;i<n;i++)
// //         {
// //             arr[i]=sc.nextInt();
// //         }
// //         countSort(arr,n); 
// //     }
// // }

// //radix sort
// //first calculates the maximum element for the maximum  number of digits
// //then sorts the array according to the digits from least significant to most significant
// //it uses counting sort as a subroutine to sort the digits
// //time complexity is O(d*(n+k)) where d is the number of digits in the maximum element, n is the number of elements in the array and k is the range of the input
// //space complexity is O(n+k) where n is the number of elements in the array and k is the range of the input
// //it is a non-comparison based sorting algorithm
// //it is used for sorting integers in a specific range
// //after calculating the maximum element,it takes an exp value(1,10,100...) to sort the digits
// //first it does for the ones place
// //after makinga a count array of size 10, it fills the count array with the number of times each digit appears in the ones place
// //then it calculates the cumulative count of the digits
// //then it finds the position of each digit and to do so it adds a[i] with a[i-1]
// //then it places the digits in the output array according to their position
// //it redoes the same for the tens place, hundreds place and so on
// import java.util.Scanner;
// import java.util.Arrays;
// public class sorting {
//     public static int getMax(int arr[], int n) {
//         int max = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
//     public static void countSort(int arr[], int n, int exp) {
//         int output[] = new int[n]; // Output array
//         int count[] = new int[10]; // Count array for digits 0-9
//         Arrays.fill(count, 0); // Initialize count array with 0
//         // Count occurrences of each digit in the current place value
//         for (int i = 0; i < n; i++) {
//             count[(arr[i] / exp) % 10]++;
//         }
//         // Calculate cumulative count
//         for (int i = 1; i < 10; i++) {
//             count[i] += count[i - 1];
//         }
//         // Build the output array
//         for (int i = n - 1; i >= 0; i--) {
//             output[count[(arr[i] / exp) % 10] - 1] = arr[i];
//             count[(arr[i] / exp) % 10]--;
//         }
//         // Copy the output array back to the original array
//         for (int i = 0; i < n; i++) {
//             arr[i] = output[i];
//         }
//     }
//     public static void radixSort(int arr[], int n) {
//         int max = getMax(arr, n); // Get the maximum element
//         // Perform counting sort for each digit
//         for (int exp = 1; max / exp > 0; exp *= 10) {
//             countSort(arr, n, exp);
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         radixSort(arr, n); // Call radixSort function to sort the array
//         System.out.println("Sorted array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }




