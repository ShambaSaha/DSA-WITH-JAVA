// // // // // // // //arraylist has no fixed size and thus helps in dynamic storage
// // // // // // // //arraylist is stored in heap memory
// // // // // // // //only objects are stored in arraylist
// // // // // // // //arraylist is a part of java collection framework
// // // // // // // import java.util.ArrayList;
// // // // // // // import java.util.Collections;
// // // // // // // class arraylistdemo{
// // // // // // //     public static void main(String args[])
// // // // // // //     {
// // // // // // //         ArrayList<Integer> list= new ArrayList<Integer>();
// // // // // // //         // Adding elements to the ArrayList
// // // // // // //         list.add(10);
// // // // // // //         list.add(20);
// // // // // // //         list.add(30);
// // // // // // //         System.out.println("ArrayList: " + list);
// // // // // // //         // Accessing elements
// // // // // // //         int element=list.get(1);
// // // // // // //         System.out.println("Element at index 1: " + element);
// // // // // // //         //add element at specific index
// // // // // // //         list.add(1, 15);
// // // // // // //         System.out.println("ArrayList after adding 15 at index 1: " + list);
// // // // // // //         //modifying elements
// // // // // // //         list.set(1,30);
// // // // // // //         System.out.println("ArrayList after modifying index 1 to 30: " + list);
// // // // // // //         // Removing elements
// // // // // // //         list.remove(3);
// // // // // // //         System.out.println("ArrayList after removing element at index 3: " + list);
// // // // // // //         // Checking size
// // // // // // //         int size = list.size();
// // // // // // //         System.out.println("Size of ArrayList: " + size);
// // // // // // //         // Checking if the ArrayList is empty
// // // // // // //         boolean isEmpty = list.isEmpty();
// // // // // // //         System.out.println("Is ArrayList empty? " + isEmpty);
// // // // // // //         // Iterating through the ArrayList
// // // // // // //         System.out.println("Iterating through ArrayList:");
// // // // // // //         for (int i = 0; i < list.size(); i++) 
// // // // // // //         {
// // // // // // //             System.out.println("Element at index " + i + ": " + list.get(i));
// // // // // // //         }
// // // // // // //         //sorting the ArrayList
// // // // // // //         System.out.println("ArrayList before sorting: " + list);
// // // // // // //         Collections.sort(list);
// // // // // // //         System.out.println("ArrayList after sorting: " + list);
// // // // // // //         // Clearing the ArrayList
// // // // // // //         list.clear();
// // // // // // //         System.out.println("ArrayList after clearing: " + list);
// // // // // // //     }   
// // // // // // // }
// // // // // // // //collection framework is a combination of classes and interfaces
// // // // // // // // methods for classes are:add,size,remove,iterate,addAll,removeAll,clear
// // // // // // // //hashset is a datastructure where duplicate entries are not allowed
// // // // // // // //add takes O(1)
// // // // // // // //delete takes O(1)
// // // // // // // //search takes O(1)
// // // // // // //hashset is unordered

// // // // // // import java.util.HashSet;
// // // // // // import java.util.Iterator;
// // // // // // public class arraylistdemo{
// // // // // //     public static void main(String args[])
// // // // // //     {
// // // // // //         HashSet<Integer> set=new HashSet<>();
// // // // // //         // Adding elements to the HashSet
// // // // // //         set.add(10);
// // // // // //         set.add(20);
// // // // // //         set.add(30);
// // // // // //         System.out.println("HashSet: " + set);
// // // // // //         // Accessing elements (HashSet does not support indexing)
// // // // // //         // You can check if an element exists
// // // // // //         boolean contains20 = set.contains(20);
// // // // // //         System.out.println("Does HashSet contain 20? " + contains20);
// // // // // //         // Adding duplicate elements (will not be added)
// // // // // //         set.add(20);
// // // // // //         System.out.println("HashSet after trying to add duplicate 20: " + set);
// // // // // //         // Removing elements
// // // // // //         set.remove(30);
// // // // // //         System.out.println("HashSet after removing 30: " + set);
// // // // // //         // Checking size
// // // // // //         int size = set.size();
// // // // // //         System.out.println("Size of HashSet: " + size);
// // // // // //         // Checking if the HashSet is empty
// // // // // //         boolean isEmpty = set.isEmpty();
// // // // // //         System.out.println("Is HashSet empty? " + isEmpty);
// // // // // //         // Iterating through the HashSet
// // // // // //         System.out.println("Iterating through HashSet:");
// // // // // //         Iterator it=set.iterator();
// // // // // //         while(it.hasNext())
// // // // // //         {
// // // // // //             System.out.println("Element: " + it.next());
// // // // // //         }
// // // // // //         // Clearing the HashSet
// // // // // //         set.clear();
// // // // // //         System.out.println("HashSet after clearing: " + set);
// // // // // //         // Checking if the HashSet is empty after clearing

// // // // // //     }
// // // // // // }

// // // // // //hashmap
// // // // // // hashmap is a part of java collection framework
// // // // // //all unique data
// // // // // //O(1) for insertion, deletion and searching
// // // // // //hashmap is unordered
// // // // // //hashmap is array of linked lists
// // // // // import java.util.HashMap;
// // // // // import java.util.Map;
// // // // // import java.util.Set;
// // // // // public class arraylistdemo{
// // // // //     public static void main(String args[])
// // // // //     {
// // // // //         HashMap<String,Integer> map=new HashMap<>();
// // // // //         map.put("apple", 10);
// // // // //         map.put("banana", 20);
// // // // //         map.put("orange", 30);
// // // // //         System.out.println("HashMap: " + map);
// // // // //         // Accessing elements (HashMap supports indexing)
// // // // //         int v = map.get("banana");
// // // // //         System.out.println("Value for key 'banana': " + v);
// // // // //         boolean containsKey = map.containsKey("apple");
// // // // //         System.out.println("Does HashMap contain key 'apple'? " + containsKey);
// // // // //         for(Map.Entry<String, Integer> entry : map.entrySet()) {
// // // // //             System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
// // // // //         }
// // // // //         Set<String> k=map.keySet(); //picking out the keys from the hashmap
// // // // //         System.out.println("Keys in the HashMap: " + k); 
// // // // //         // Removing elements
// // // // //         map.remove("orange");
// // // // //         System.out.println("HashMap after removing 'orange': " + map);
        
// // // // //     }
// // // // // } 

// // // // import java.util.*;
// // // // public class arraylistdemo{
// // // //     public static void majority(int arr[]){
// // // //         int n=arr.length;
// // // //         HashMap<Integer,Integer> map=new HashMap<>();
// // // //         for(int i=0;i<n;i++)
// // // //         {
// // // //             if(map.containsKey(arr[i]))
// // // //             {
// // // //                 map.put(arr[i],map.get(arr[i])+1);

// // // //             }
// // // //             else
// // // //             {
// // // //                 map.put(arr[i],1);
// // // //             }
// // // //         }
// // // //         for(int key : map.keySet())
// // // //         {
// // // //             if(map.get(key) > n/2)
// // // //             {
// // // //                 System.out.println("Majority element is: " + key);
// // // //                 return;
// // // //             }
// // // //         }
// // // //     }
// // // //     public static void main(String args[])
// // // //     {
// // // //         Scanner sc=new Scanner(System.in);
// // // //         System.out.println("Enter size of array");
// // // //         int n=sc.nextInt();
// // // //         int arr[]=new int[n];
// // // //         System.out.println("Enter elements of array");
// // // //         for(int i=0;i<n;i++)
// // // //         {
// // // //             arr[i]=sc.nextInt();
// // // //         }
// // // //         majority(arr);
// // // //     }

// // // // }
// // // //union of two array
// // // import java.util.*;
// // // public class arraylistdemo{
// // //     public static void union(int arr1[],int arr2[])
// // //     {
// // //         int n=arr1.length;
// // //         int m=arr2.length;
// // //         HashSet <Integer> set= new HashSet<>();
// // //         for(int i=0;i<n;i++)
// // //         {
// // //             set.add(arr1[i]);
// // //         }
// // //         for(int j=0;j<m;j++)
// // //         {
// // //             set.add(arr2[j]);
// // //         }
// // //         System.out.println(set.size());
// // //         System.out.println(set);

// // //     }
// // //     public static void main(String args[])
// // //     {
// // //         Scanner sc=new Scanner(System.in);
// // //         System.out.println("Enter size of first array");
// // //         int n=sc.nextInt();
// // //         int arr1[]=new int[n];
// // //         System.out.println("Enter elements of first array");
// // //         for(int i=0;i<n;i++)
// // //         {
// // //             arr1[i]=sc.nextInt();
// // //         }
// // //         System.out.println("Enter size of second array");
// // //         int m=sc.nextInt();
// // //         int arr2[]=new int[m];
// // //         System.out.println("Enter elements of second array");
// // //         for(int j=0;j<m;j++)
// // //         {
// // //             arr2[j]=sc.nextInt();
// // //         }
// // //         union(arr1,arr2);
// // //     }
// // // }
// // //intersection
// // //put elements of array1 in set 
// // //compare them with array 2 and if found same increase count and remove element from set to avoid repeated increment of count
// // import java.util.*;
// // public class arraylistdemo{
// //     public static void intersection(int arr1[],int arr2[])
// //     {
// //         int n=arr1.length;
// //         int m=arr2.length;
// //         HashSet<Integer> set=new HashSet<>();
// //         for(int i=0;i<n;i++)
// //         {
// //             set.add(arr1[i]);
// //         }
// //         int count=0;
// //         for(int j=0;j<m;j++)
// //         {
// //             if(set.contains(arr2[j]))
// //             {
// //                 count++;
// //                 // System.out.println("Intersection element found: " +);
// //                 set.remove(arr2[j]);
// //             }
// //         }
// //         System.out.println("Count of intersection elements: " + count);
// //     }
// //     public static void main(String args[])
// //     {
// //         Scanner sc=new Scanner(System.in);
// //         System.out.println("Enter size of first array");
// //         int n=sc.nextInt();
// //         int arr1[]=new int[n];
// //         System.out.println("Enter elements of first array");
// //         for(int i=0;i<n;i++)
// //         {
// //             arr1[i]=sc.nextInt();
// //         }
// //         System.out.println("Enter size of second array");
// //         int m=sc.nextInt();
// //         int arr2[]=new int[m];
// //         System.out.println("Enter elements of second array");
// //         for(int j=0;j<m;j++)
// //         {
// //             arr2[j]=sc.nextInt();
// //         }
// //         intersection(arr1,arr2);
// //     }
// // }

// //itinery(route)
// //find starting point
// //for this first take the keys from the hashmap and also make a reverse hashmap so that you can compare the keys and values,if the key is not present in values which means that the key is unique and a starting point
// //then start from that key and keep adding the next key to the route by checking the value
// //if the value is not present in the keys then it is the end of the route
// import java.util.*;
// public class arraylistdemo{
//     public static String itinery(HashMap<String,String> tick){
//         HashMap<String,String> revMap=new HashMap<>();
//         for(String key:tick.keySet())
//         {
//             revMap.put(tick.get(key),key);
//         }
//         for(String key:tick.keySet())
//         {
//             if(!revMap.containsKey(key))
//             {
//                 String start=key;
//                 String route=start+"->";
//                 while(tick.containsKey(start))
//                 {
//                     start=tick.get(start);
//                     route+=start+"->";
//                 }
//                 return route.substring(0,route.length()-2);
//             }
//         }
//         return "No route found";
//     }
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         HashMap<String,String> tick=new HashMap<>();
//         System.out.println("Enter number of tickets");
//         int n=sc.nextInt();
//         sc.nextLine(); // Consume newline
//         for(int i=0;i<n;i++)
//         {
//             System.out.println("Enter ticket (from to):");
//             String from=sc.nextLine();
//             String to=sc.nextLine();
//             tick.put(from,to);
//         }
//         String route=itinery(tick);
//         System.out.println("Itinerary: " + route);
//     }

// }



