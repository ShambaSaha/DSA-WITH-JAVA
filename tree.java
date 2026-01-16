// // //time complexity in tree is O(log n)
// // // import java.util.LinkedList;

// // // // // // class Node{
// // // // // //     int data;
// // // // // //     Node left;
// // // // // //     Node right;
// // // // // //     public Node (int val)
// // // // // //     {
// // // // // //         data=val;
// // // // // //     }
// // // // // //     public static void main()
// // // // // //     {
// // // // // //         Node root=new Node(1);
// // // // // //         root.left=new Node(2);
// // // // // //         root.right=new Node(3);
// // // // // //         root.left.right=new Node(5);
// // // // // //     }
// // // // // // }

// // // // // //inorder traversal=left,root,right
// // // // // //preorder traversal=root,left,right
// // // // // //postorder traversal=left,right,root
// // // // // //preorder traversal
// // // // // import java.util.*;
// // // // // class Node{
// // // // //     int data;
// // // // //     Node left;
// // // // //     Node right;
// // // // //     public Node (int val)
// // // // //     {
// // // // //         data=val;
// // // // //     }
// // // // // }
// // // // // public class tree {
// // // // //     Node root;
// // // // //     public void preorder(Node node)
// // // // //     {
// // // // //         if(node==null)
// // // // //         {
// // // // //             return;
// // // // //         }
// // // // //         System.out.print(node.data+" ");
// // // // //         preorder(node.left);
// // // // //         preorder(node.right);
// // // // //     }
// // // // //     public static void main(String args[])
// // // // //     {
// // // // //         tree t=new tree();
// // // // //         t.root=new Node(1);
// // // // //         t.root.left=new Node(2);
// // // // //         t.root.right=new Node(3);
// // // // //         t.root.left.right=new Node(5);
// // // // //         t.preorder(t.root);
// // // // //     }
// // // // // }
// // // // //inorder traversal
// // // // import java.util.*;
// // // // class Node{
// // // //     int data;
// // // //     Node left;
// // // //     Node right;
// // // //     public Node (int val)
// // // //     {
// // // //         data=val;
// // // //     }
// // // // }
// // // // public class tree {
// // // //     Node root;
// // // //     public void inorder(Node node)
// // // //     {
// // // //         if(node==null)
// // // //         {
// // // //             return;
// // // //         }
// // // //         inorder(node.left);
// // // //         System.out.print(node.data+" ");
// // // //         inorder(node.right);
// // // //     }
// // // //     public static void main(String args[])
// // // //     {
// // // //         tree t=new tree();
// // // //         t.root=new Node(1);
// // // //         t.root.left=new Node(2);
// // // //         t.root.right=new Node(3);
// // // //         t.root.left.right=new Node(5);
// // // //         t.inorder(t.root);
// // // //     }
// // // // }
// // // // //postorder traversal
// // // // // import java.util.*;
// // // // // class Node{
// // // // //     int data;
// // // // //     Node left;
// // // // //     Node right;
// // // // //     public Node (int val)
// // // // //     {
// // // // //         data=val;
// // // // //     }
// // // // // }
// // // // // public class tree {
// // // // //     Node root;
// // // // //     public void postorder(Node node)
// // // // //     {
// // // // //         if(node==null)
// // // // //         {
// // // // //             return;
// // // // //         }
// // // // //         postorder(node.left);
// // // // //         postorder(node.right);
// // // // //         System.out.print(node.data+" ");
// // // // //     }
// // // // //     public static void main(String args[])
// // // // //     {
// // // // //         tree t=new tree();
// // // // //         t.root=new Node(1);
// // // // //         t.root.left=new Node(2);
// // // // //         t.root.right=new Node(3);
// // // // //         t.root.left.right=new Node(5);
// // // // //         t.postorder(t.root);
// // // // //     }
// // // // // }
// // // //level order traversal
// // // //we need a queue to store the nodes one by one
// // // //first store the root node then store the left and right of the root node
// // // //then transfer the root node to a list
// // // //then continue the same process for the left and right nodes
// // // // class Node{
// // // //     int val;
// // // //     Node left;
// // // //     Node right;
// // // //     Node(int val)
// // // //     {
// // // //         this.val=val;
// // // //     }
// // // //     Node(int val,Node left,Node right)
// // // //     {
// // // //         this.val=val;
// // // //         this.left=left;
// // // //         this.right=right;
// // // //     }
// // // // }
// // // // class Solution{
// // // //     public List<List<Integer>> levelOrder(Node root)
// // // //     {
// // // //         List<List<Integer>> result=new ArrayList<>();
// // // //         Queue<Node> queue=new LinkedList<Node>();
// // // //         if(root==null)
// // // //         {
// // // //             return result;
// // // //         }
// // // //         queue.offer(root);
// // // //         while(!queue.isEmpty())
// // // //         {
// // // //             int size=queue.size();
// // // //             List<Integer> currentLevel=new LinkedList<Integer>();
// // // //             for(int i=0;i<size;i++)
// // // //             {
// // // //                 if(queue.peek.left!=null)
// // // //                 {
// // // //                     queue.offer(queue.peek().left);
// // // //                 }
// // // //                 if(queue.peek.right!=null)
// // // //                 {
// // // //                     queue.offer(queue.peek.right);
// // // //                 }
// // // //                 currentLevel.add(queue.poll().val);
// // // //             }
// // // //             result.add(currentLevel);
// // // //         }
// // // //         return result;
// // // //     }
// // // // }
// // // //iterative preoder  traversal
// // // //level by level add elements to the list
// // // class Node{
// // //     int data;
// // //     Node left;
// // //     Node right;
// // //     public Node (int val)
// // //     {
// // //         data=val;
// // //     }
// // // }
// // // public class tree {
// // //     public List<Integer> inorder(  Node root)
// // //     {
// // //         List<Integer> result=new ArrayList<>();
// // //         if(root==null)
// // //         {
// // //             return result;
// // //         }
// // //         Stack<Node> stack=new Stack<>();
// // //         stack.push(root);
// // //         while(!stack.isEmpty())
// // //         {
// // //             root=stack.pop();
// // //             result.add(root.data);
// // //             if(root.right!=null)
// // //             {
// // //                 stack.push(root.right);
// // //             }
// // //             if(root.left!=null)
// // //             {
// // //                 stack.push(root.left);
// // //             }
// // //         }
// // //         return result;
// // //     }
// // // }
// // // iterative inorder traversal
// // // class Node{
// // //     int data;
// // //     Node left;
// // //     Node right;
// // //     public Node (int val)
// // //     {
// // //         data=val;
// // //     }
// // // }
// // // public class tree {
// // //     public List<Integer> inorder(  Node root)
// // //     {
// // //         List<Integer> result=new ArrayList<>();
// // //         Stack<Node> stack=new Stack<>();
// // //         Node current=root;
// // //         while(true)
// // //         {
// // //             if(current!=null)
// // //             {
// // //                 stack.push(current);
// // //                 current=current.left;
// // //             }
// // //             else
// // //             {
// // //                 if(stack.isEmpty())
// // //                 {
// // //                     break;
// // //                 }
// // //                 current=stack.pop();
// // //                 result.add(current.data);
// // //                 current=current.right;
// // //             }
// // //         }
// // //         return result;
// // //     }
// // // }
// // // iterative postorder traversal
// // //class Node{
// // //int data;
// // //Node left;
// // //Node right;
// // //Node(int val)
// // //{
// // //    data=val;
// // //}
// // //}
// // //public class tree {
// // //    public List<Integer> postorder(Node root)
// // //    {
// // //        List<Integer> result=new ArrayList<>();
// // //Stack<Node> stack=new Stack<>();
// // //Stack<Node> output=new Stack<>();
// // //if(root==null)
// // //{
// // //    return result;
// // //}
// // //stack.push(root);
// // //while(!stack.isEmpty())
// // //{
// // //    root=stack.pop();
// // //    output.push(root);
// // //    if(root.left!=null)
// // //    {
// // //        stack.push(root.left);
// // //    }
// // //    if(root.right!=null)
// // //    {
// // //        stack.push(root.right);
// // //    }
// // //}
// // //while(!output.isEmpty())
// // //{
// // //    result.add(output.pop().data);
// // //}
// // //return result;
// // //    }
// // //}
// // // }
// // //iterative postorder traversal without using two stacks
// // //class Node{
// // //int data;
// // //Node left;
// // //Node right;
// // //Node(int val)
// // //{
// // //    data=val;
// // //}
// // //}
// // //class Pair{
// // //Node data;
// // //int num;
// // //Pair(Node d,int n)
// // //{
// // //data=d;
// // //num=n;
// // //}
// // //}
// // //class Solution{
// // //void PreOrder(Node root)
// // //{
// // //Stack <Pair> st=new Stack<Pair>();
// // //st.push(new Pair(root,1))
// // //List<Integer> pre=new List<Integer>();
// // //List<Integer> in=new List<Integer>();
// // //List<Integer> post=new List<Integer>();
// // //if(root==null)
// // //return;

// // //while(!st.empty())
// // //{
// // //Pair it=st.pop();
// // //if(it.num==1)
// // //{
// // //pre.add(it.data.data);
// // //it.num++;
// // //st.push(it);
// // //if(it.data.left!=null)
// // //{
// // //st.push(new Pair(it.data.left,1));
// // //}
// // //}
// // //else if(it.num==2)
// // //{
// // //in.add(it.data.data);
// // //it.num++;
// // //st.push(it);
// // //if(it.data.right!=null)
// // //{
// // //st.push(new Pair(it.data.right,1));
// // //}
// // //}
// // //else
// // //{
// // //post.add(it.data.data);
// // //}
// // //}
// // //for(int i=0;i<pre.size();i++)
// // //{
// // //System.out.print(pre.get(i)+" ");
// // //}
// // //System.out.println();
// // //for(int i=0;i<in.size();i++)
// // //{
// // //System.out.print(in.get(i)+" ");
// // //}
// // //System.out.println();
// // //for(int i=0;i<post.size();i++)
// // //{
// // //System.out.print(post.get(i)+" ");
// // //}
// // //}
// // //}
// // //balanced binary tree is for whose every node height of left subtree-height of right subtree=1
// // //int check(node)
// // //{
// // //if(node==null)
// // //{
// // //lh=check(node.left);
// // //rh=check(node.right);
// // //if(lh==-1 || rh==-1) return -1;
// // //if(abs[lh-rh]>1)return -1;
// // //return max(lh,rh)+1; //returning height of the tree if balanced
// // //}
// // //}
// // //diameter of binary tree
// // //int diameter(Node root)
// // //{
// // //int diameter=0;
// // //if(root==null)
// // //{
// // //    return 0;
// // //}
// // //int lh=diameter(root.left,diameter);
// // //int rh=diameter(root.right,diameter);
// // //diameter=Math.max(diameter,lh+rh);
// // //return 1+Math.max(lh,rh);
// // //}
// // //top view of binary tree
// // //if we assign a vertical line number for each node then the top view will be the first node at each vertical line
// // //top view will start from extreme left vertical line to extreme right vertical line
// // //we can use a queue to store the nodes along with their vertical line number
// // //and we can use a map to store the first node at each vertical line
// // //class Node{
// // //    int data;
// // //    Node left;
// // //    Node right;
// // //    public Node (int val)
// // //    {
// // //        data=val;
// // //    }
// // // }
// // // class Pair{
// // //     Node node;
// // //     int vertical;
// // //     Pair(Node n,int v)
// // //     {
// // //         node=n;
// // //         vertical=v;
// // //     }
// // // }
// // // public class tree {
// // //     public List<Integer> topView(Node root)
// // //     {
// // //         List<Integer> result=new ArrayList<>();
// // //         if(root==null)
// // //         {
// // //             return result;
// // //         }
// // //         Map<Integer,Integer> map=new TreeMap<>();
// // //         Queue<Pair> queue=new LinkedList<>();
// // //         queue.offer(new Pair(root,0));
// // //         while(!queue.isEmpty())
// // //         {
// // //             Pair p=q.remove();
// // //             Node node=p.node;
// // //             int vertical=p.vertical;
// // //             if(map.get(vertical)==null)
// // //             {
// // //                 map.put(vertical,node.data);
// // //             }
// // //             if(node.left!=null)
// // //             {
// // //                 queue.offer(new Pair(node.left,vertical-1));
// // //             }
// // //             if(node.right!=null)
// // //             {
// // //                 queue.offer(new Pair(node.right,vertical+1));
// // //             }
// // //         }
// // //         for(Map.Entry<Integer,Integer> entry:map.entrySet())
// // //         {
// // //             result.add(entry.getValue());
// // //         }
// // //         return result;
// // //     }
// // // }
// // //bottom view of binary tree
// // //it is similar to top view but we need to update the map with the latest node at each vertical line
// // // class Pair{
// // //     Node node;
// // //     int vertical;
// // //     Pair(Node n,int v)
// // //     {
// // //         node=n;
// // //         vertical=v;
// // //     }
// // // }
// // // public class tree {
// // //     public List<Integer> bottomView(Node root)
// // //     {
// // //         List<Integer> result=new ArrayList<>();
// // //         if(root==null)
// // //         {
// // //             return result;
// // //         }
// // //         Map<Integer,Integer> map=new TreeMap<>();
// // //         Queue<Pair> queue=new LinkedList<>();
// // //         queue.offer(new Pair(root,0));
// // //         while(!queue.isEmpty())
// // //         {
// // //             Pair p=q.remove();
// // //             Node node=p.node;
// // //             int vertical=p.vertical;
// // //             map.put(vertical,node.data);
// // //             if(node.left!=null)
// // //             {
// // //                 queue.offer(new Pair(node.left,vertical-1));
// // //             }
// // //             if(node.right!=null)
// // //             {
// // //                 queue.offer(new Pair(node.right,vertical+1));
// // //             }
// // //         }
// // //         for(Map.Entry<Integer,Integer> entry:map.entrySet())
// // //         {
// // //             result.add(entry.getValue());
// // //         }
// // //         return result;
// // //     }
// // // }

// // //children sum property
// // //sum of left child+sum of right child=parent node
// // //if a node is leaf node then it is also considered to follow children sum property
// // // void convertTree(Node node)
// // // {
// // // if(node == null)
// // // return;
// // // int child=0;
// // // if(node.left!=null)
// // // {
// // //     child+=node.left.data;
// // // }
// // // if(node.right!=null)
// // // {
// // //     child+=node.right.data;
// // // }
// // // if(child>=node.data)
// // // {
// // //     node.data=child;
// // // }
// // // else
// // // {
// // //     if(node.left!=null)
// // //     {
// // //         node.left.data=node.data;
// // //     }
// // //     if(node.right!=null)
// // //     {
// // //         node.right.data=node.data;
// // //     }
// // // }
// // // convertTree(node.left);
// // // convertTree(node.right);
// // // int total=0;
// // // if(node.left!=null)
// // // {
// // //     total+=node.left.data;
// // // }
// // // if(node.right!=null)
// // // {
// // //     total+=node.right.data;
// // // }
// // // if(node.left!=null || node.right!=null)
// // // {
// // //     node.data=total;
// // // }
// // // }
// // //time taken to burn a tree from a given leaf node
// // //we can use bfs to traverse the tree and find the time taken to burn the tree
// // class Solution {
// //     public TreeNode markParentsAndFindInfected(TreeNode root, int start, Map<TreeNode, TreeNode> parent_track) {
// //         TreeNode infected = new TreeNode();
// //         Queue<TreeNode> q = new LinkedList<>();
// //         q.offer(root);

// //         while (!q.isEmpty()) {
// //             TreeNode node = q.poll();

// //             if (node.val == start) {
// //                 infected = node;
// //             }

// //             if (node.left != null) {
// //                 q.offer(node.left);
// //                 parent_track.put(node.left, node);
// //             }

// //             if (node.right != null) {
// //                 q.offer(node.right);
// //                 parent_track.put(node.right, node);
// //             }
// //         }
// //         return infected;
// //     }

// //     public int amountOfTime(TreeNode root, int start) {
// //         Map<TreeNode, TreeNode> parent_track = new HashMap<>();
// //         TreeNode infected = markParentsAndFindInfected(root, start, parent_track);

// //         Queue<TreeNode> q = new LinkedList<>();
// //         q.offer(infected);

// //         Map<TreeNode, Boolean> vis = new HashMap<>();
// //         vis.put(infected, true);

// //         int min = 0;

// //         while (!q.isEmpty()) {
// //             int n = q.size();

// //             for (int i = 0; i < n; i++) {
// //                 TreeNode node = q.poll();

// //                 if (node.left != null && vis.get(node.left) == null) {
// //                     q.offer(node.left);
// //                     vis.put(node.left, true);
// //                 }

// //                 if (node.right != null && vis.get(node.right) == null) {
// //                     q.offer(node.right);
// //                     vis.put(node.right, true);
// //                 }

// //                 if (parent_track.get(node) != null && vis.get(parent_track.get(node)) == null) {
// //                     q.offer(parent_track.get(node));
// //                     vis.put(parent_track.get(node), true);
// //                 }
// //             }

// //             min++;
// //         }

// //         return min - 1;
// //     }
// // }

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// //ceil in a BST

// class Solution {
//     public int[] findCeil(TreeNode root,int key) {
//         int ceil=-1;
//         while(root!=null)
//         {
//             if(root.val==key)
//             {
//                 ceil=root.val;
//                 return ceil;
//             }
//             if(key>root.val)
//             {
//                 root=root.right;
//             }
//             else{
//                 ceil=root.val;
//                 root=root.left;
//             }
//         }
//         return ceil;

        
//     }
// }
//floor of BST
//public static in floorBST(Node root,int key)
//{
//    int floor=-1;
//    while(root!=null)
//    {
//        if(root.data==key)
//        {
//            floor=root.data;
//            return floor;
//        }
//        if(key<root.data)
//        {
//            root=root.left;
//        }
//        else{
//            floor=root.data;
//            root=root.right;
//        }
//    }
//    return floor;
//}
//CHECK IF BST IS VALID
//if the node falls in the range of valid bst such that left side is smaller than node and node is smaller than right side then it is a valid bst
// class Solution{
//     public boolean isValidBST(TreeNode root)
//     {
//         return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
//     }
//     public boolean isValidBST(TreeNode root,long minVal,long maxVal)
//     {
//         if(root==null)return true;
//         if(root.val>=maxVal || root.val<=minVal)return false;
//         return isValidBST(root.left,minVal,root.val) && isValidBST(root.right,root.val,maxVal);
//     }
// }
//inorder successor in BST
//if the node has right child then the inorder successor is the leftmost node in the right subtree
//if the node does not have right child then we need to traverse from root to the node and keep track of the last node which is smaller than the given node
// class Solution {
//     public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
//         TreeNode successor=null;
//         while(root!=null)
//         {
//             if(p.val>=root.val)
//             {
//                 root=root.right;
//             }
//             else{
//                 successor=root;
//                 root=root.left;
//             }
//         }
//         return successor;
//     }
// }

//ROOT TO NODE PATH
//class Solution{
//private boolean getPath(TreeNode root,ArrayList<Integer> arr,int x)
//{
//    if(root==null)
//    {
//        return false;
//    }
//    arr.add(root.val);
//    if(root.val==x)
//    {
//        return true;
//    }
//    if(getPath(root.left,arr,x) || getPath(root.right,arr,x))
//    {
//        return true;
//    }
//    arr.remove(arr.size()-1); //backtracking
//    return false;
//}
//public ArrayList<Integer> solve(TreeNode root,int x)
//{
//    ArrayList<Integer> arr=new ArrayList<>();
//    if(getPath(root,arr,x)==false)
//    {
//        return new ArrayList<>();
//    }
//    return arr;
//}
//}

//morris traversal
//class Solution {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result=new ArrayList<>();
//        TreeNode current=root;
//        TreeNode prev=null;
//        while(current!=null)
//        {
//            if(current.left==null)
//            {
//                result.add(current.val);
//                current=current.right;
//            }
//            else{
//                  prev=current.left;
//                  while(prev.right!=null && prev.right!=current)
//                  {
//                      prev=prev.right;
//                  }
//                  if(prev.right==null)
//                  {
//                      prev.right=current;
//                      result.add(current.val);
//                      current=current.left;
//                  }
//                  else{
//                      prev.right=null;
//                      current=current.right;
//                  }
//            }
//        }
//        return result;
//    }
// }





