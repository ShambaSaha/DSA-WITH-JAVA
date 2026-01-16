
// //time complexity to insert in arraylist is O(n) but in linked list is O(1)
// //non contagious data structure
// //variable size
// class Node{
//         int data;
//         Node next;
//         Node(int data1, Node next1) {
//             this.data = data1;
//             this.next = next1;
//         }
//         Node(int data1) 
//         {
//             this.data = data1;
//             this.next = null;
//         }
//     }
// public class linkedlist {
//     public static Node convertAll(int[]arr)
//     {
//         Node head=new Node(arr[0]);
//         Node mover=head;
//         for(int i=1;i<arr.length;i++)
//         {
//             Node temp=new Node(arr[i]);
//             mover.next=temp;
//             mover=temp;
//         }
//         return head;
//     }
//     public static Node deleteHead(Node head){
//         head=head.next; //shifts head to the next node
//         if(head == null) {
//             return null; //if the list becomes empty, return null
//         }
//         return head;
//     }
//     public static Node deleteTail(Node head){
//         if(head==null || head.next==null)
//         {
//             return null;
//         }

//         Node temp=head;
//         while(temp.next.next !=null)
//         {
//            temp=temp.next;
//         }
//         temp.next=null;
//         return temp;

//     }
//     public static Node deleteAtPosition(Node head,int pos){
//         if(head==null)
//         return head;
//         if(pos==1)
//         {
//             head=head.next;
//             return head;
//         }
//             int c=0;
//             Node temp=head;Node prev=null;
//             while(temp!=null)
//             {
//                 c++;
//                 if(c==pos)
//                 {
//                     prev.next=prev.next.next;
//                     break;
//                 }
//                 prev=temp;
//                 temp=temp.next;
//             }
//             return head;
//         }
//         public static void printList(Node head){
//             Node temp=head;
//             while(temp != null)
//             {
//                 System.out.print(temp.data+" ");
//                 temp=temp.next;
//             }
//             System.out.println();

//         }

//         public static Node deleteValue(Node head,int val)
//         {
//             if(head==null) return head;
//             if(head.data==val){
//                 head=head.next;
//                 return head;
//             }
//             Node temp=head;
//             Node prev=null;
//             while(temp!=null)
//             {
//                 if(temp.data==val)
//                 {
//                     prev.next=prev.next.next;
//                     break;
//                 }
//                 prev=temp;
//                 temp=temp.next;
//             }
//             return head;
//         }
//          public static Node insertAtHead(Node head,int val)
//          {
//             Node temp=new Node(val,head);
//             return temp; //new head
//          }
//          public static Node insertAtTail(Node head,int val)
//          {
//             Node temp=new Node(val);
//             Node prev=head;
//             if(head==null)return temp;
//             while(prev.next!=null)
//             {
//                 prev=prev.next;
//             }
//             prev.next=temp;
//             return head;
//          }
//          public static Node insertatPosition(Node head,int ele,int pos){
//             if(head==null)
//             return new Node(ele);
//             if(pos==1)
//             {
//                 Node temp=new Node(ele,head);
//                 return temp;
//             }
//             int count=0;
//             Node temp=head;
//             while(temp!=null)
//             {
//                 count++;
//                 if(count==pos-1)
//                 {
//                     Node newNode=new Node(ele,temp.next);
//                     temp.next=newNode;
//                     break;
//                 }
//                 temp=temp.next;
//             }
//             return head;
//          }
//          public static Node beforeValue(Node head,int ele,int val){
            
//             if(head==null)
//             return null;
//             if(head.data==val)
//             {
//                 return new Node(ele,head); //new head
//             }
//             Node temp=head;
//             while(temp.next!=null)
//             {
//                 if(temp.next.data==val)
//                 {
//                     Node newNode=new Node(ele,temp.next);
//                     temp.next=newNode;
//                     break;
//                 }
//                 temp=temp.next;
//             }
//             return head;
//          }


//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5,6,7,8,9};
//         Node head = convertAll(arr);
//         // Node temp=head;
//         // int count=0;
//         // while(temp != null)
//         // {
//         //     System.out.println(temp.data+" ");
//         //     temp=temp.next;
//         //     // count++;
//         // }
//         // System.out.println(count);
//         // head=deleteHead(head);
//         // System.out.println(head.data);
//         // head=deleteTail(head);
//         // System.out.println(head.data);
//         // head=deleteAtPosition(head,3);
//         // System.out.println(head.data);
//         // head=deleteValue(head,5);
//         // printList(head);
//         // head=insertAtHead(head,10);
//         // printList(head);
//         // head=insertAtTail(head,10);
//         // printList(head);
//         // head=insertatPosition(head,10,3);
//         // printList(head);
//         head=beforeValue(head,99,8);
//         printList(head);
//     }
//     }
         
// //insertion and deletion can be done from
// //head,tail or any position or any value



// //doublelinkedlist
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data1,Node next1,Node prev1){
        this.data=data1;
        this.next=next1;
        this.prev=prev1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.prev=null;
    }
}
class linkedlist
{
    public static Node convertAll(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
}
public static Node deletehead(Node head){
    if(head==null)return null;
    Node temp=head;
    head=head.next; //shifts head to the next node
    head.prev = null;
    temp.next=null; 
    return head;
}
public static Node deleteTail(Node head){
    if(head==null) return null;
    Node temp=head;
    while(temp.next.next !=null)
    {
        temp=temp.next;
    }
    temp.next.prev=null; //removing the link to the tail
    temp.next=null; //removing the tail node
    return head;
}
public static Node deleteAtPos(Node head,int pos){
    if(head==null) return null;
    int count=0;
    Node temp=head;
    while(temp!=null)
    {
        count++;
        if(count==pos) break;
        temp=temp.next;
    }
    Node prev=temp.prev;
    Node next=temp.next;
    if(prev == null && next == null) {
        return deletehead(head); // if the list becomes empty, return null
    }
    else if(next==null){
        return deleteTail(head);
    }
    prev.next=next;
    next.prev=prev;
    temp.next=null;
    temp.prev=null;
    return head;

}
public static Node insertHead(Node head,int val){
    Node temp=new Node(val,head,null);
    head.prev=temp;
    return temp;
}

public static Node beforeTail(Node head,int val)
{
    if(head.next==null) insertHead(head, val); //if the list has only one node, insert at head
    Node temp=head; //if the list is empty, return new node
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    Node back=temp.prev;
    Node newNode=new Node(val,temp,back);
    back.next=newNode; //linking the new node to the previous node
    temp.prev=newNode; //linking the new node to the tail
    return head;
}

public static Node reverse(Node head){
    if(head==null)return head;
    Node prev=null;
    Node current=head;
    while(current!=null)
    {
        prev=current.prev;
        current.prev=current.next;
        current.next=prev;
        current=current.prev; //moving to the next node
    }
    return prev.prev; // prev will be the new head after reversal

}


public static void printList(Node head)
{
    Node temp=head;
    while(temp != null)
    {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}

public static Node add(Node head1,Node head2)
{
    Node dummy=new Node(-1);//dummy node to initialize the sum list and to point out head of the sum list
    Node curr=dummy;//traverse through the sum list
    Node temp1=head1;
    Node temp2=head2;
    int carry=0;
    while(temp1!=null || temp2!=null)//until both lists are traversed
    {
        int sum=carry;
        if(temp1!=null)
        {
            sum+=temp1.data;
            temp1=temp1.next;
        }
        if(temp2!=null)
        {
            sum+=temp2.data;
            temp2=temp2.next;
        }
        carry=sum/10;
        Node newNode=new Node(sum%10);
        curr.next=newNode;
        curr=curr.next;
    }
    if(carry>0)
    {
        Node newNode=new Node(carry);
        curr.next=newNode;
    }
    return dummy.next; //returning the next node of dummy, which is the head of

}
public static Node oddeven(Node head)
{
    Node odd=head;
    Node even=head.next;
    Node evenHead=even; //to keep track of the head of the even list
    while(even!=null && even.next!=null)
    {
        odd.next=odd.next.next; //linking the odd nodes
        even.next=even.next.next; //linking the even nodes
        odd=odd.next; //moving to the next odd node
        even=even.next; //moving to the next even node
    }
    odd.next=evenHead;
    return head;
}
public static Node rev(Node head)
{
    Node prev=null;
    Node front=null;
    Node temp=head;
    while(temp!=null)
    {
        front=temp.next; //storing the next node
        temp.next=prev; //reversing the link
        prev=temp; //moving prev to the current node
        temp=front; //moving temp to the next node
    }
    return prev;
}

//check if linkedlist is palindrome
public static Node reverseLinkedList(Node head)
{
    if(head==null || head.next==null) return head;
    Node newHead=reverseLinkedList(head.next);
    Node front=head.next;
    front.next=head;
    head.next=null;
    return newHead;
}
boolean isPalindrome(Node head) {
    if(head==null || head.next==null) return true;
    Node slow=head;
    Node fast=head;
    //finding middle node
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    //reversing second half
    Node revHead=reverseLinkedList(slow.next);
    Node first=head;
    Node second=revHead;
    while(second!=null)
    {
        if(first.data!=second.data) return false;
        first=first.next;
        second=second.next;
    }
    return true;
}
//sorting list of 0s,1s and 2s
public static Node sort(Node head){
    Node zeroHead=new Node(-1);
    Node oneHead=new Node(-1);
    Node twoHead=new Node(-1);
    Node zero=zeroHead;
    Node one=oneHead;
    Node two=twoHead;
    Node temp=head;
    while(temp!=null)
    {
        if(temp.data==0)
        {
            zero.next=temp;
            zero=temp;
        }
        else if(temp.data==1)
        {
            one.next=temp;
            one=temp;
        }
        else
        {
            two.next=temp;
            two=temp;
        }
        temp=temp.next;
    }
    zero.next=(oneHead.next!=null)?oneHead.next:twoHead.next; //linking the zero list to the one list or two list
    one.next=twoHead.next; //linking the one list to the two list
    two.next=null; //last node of the two list should point to null
    Node newHead=zeroHead.next; //new head of the sorted list
    return newHead; //returning the new head of the sorted list
}

public static Node removeKth(Node head,int n)
{
    Node fast=head;
    Node slow=head;
    for(int i=0;i<n;i++)
    {
        fast=fast.next;
    }
    if(fast==null) return head.next; //if n is equal to the length of the list, remove the head
    //if n is less than the length of the list, move fast pointer n nodes ahead
    //and then move both pointers until fast pointer reaches the end of the list
    //when fast pointer reaches the end, slow pointer will be at the (n+1)th node from the end
    //so we can remove the slow pointer's next node
    while(fast.next!=null){
        fast=fast.next;
        slow=slow.next;
    }
    slow.next=slow.next.next; //removing the (n+1)th node from the end
    return head; //returning the head of the list

}
//this is using tortoise and hare algorithm to find the middle node of the linked list
//if the list has even number of nodes, it will return the second middle node
//if the list has odd number of nodes, it will return the middle node
//this is a single pass algorithm with O(n) time complexity and O(1) space
//fast pointer moves two nodes ahead and slow pointer moves one node ahead
//when fast pointer reaches the end of the list, slow pointer will be at the middle node
//if the list is empty, it will return null
//if the list has only one node, it will return that node
public static Node mid(Node head)
{
    Node fast=head;
    Node slow=head;
    while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next; //moving fast pointer two nodes ahead
        slow=slow.next; //moving slow pointer one node ahead
    }
    return slow;
}
//delete all nodes with a given value from the double linked list
public static Node delall(Node head,int val)
{
    Node temp=head;
    while(temp!=null)
    {
        if(temp.data==val)
        {
            if(temp==head)
            {
                head=temp.next;
            }
            Node prev=temp.prev;
            Node next=temp.next;
            if(prev!=null) {
                prev.next=next; //linking the previous node to the next node
            }
            if(next!=null) {
                next.prev=prev; //linking the next node to the previous node
            }
            temp=next;
        }
        else

        temp=temp.next; //moving to the next node
    }
    return head; //returning the head of the list
}
public static Node  getKthNode(Node head,int k)
{
    while(head!=null && k>0)
    {
        head=head.next; //moving to the next node
        k--; //decreasing k
    }
    return head; //returning the kth node from the head
}
public static Node Kreverse(Node head,int k)
{
    Node temp=head;
    Node prev=null;
    while(temp!=null)
    {
        Node kthNode=getKthNode(temp,k); //getting the kth node from the current node
        if(kthNode==null){
            if(prev!=null) prev.next=temp; //linking the previous node to the current node
            break; //if kth node is null, break the loop
        }
        Node next=kthNode.next; //storing the next node
        kthNode.next=null; //making the next node of kth node null to break the link
        reverse(temp); //reversing the current segment of k nodes
        if(temp==head) {
            head=kthNode; //if the current segment is the first segment, update the head
        } else {
            prev.next=kthNode; //linking the previous segment to the current segment
        }
        prev=temp; //updating the previous node to the current node
        temp=next; //moving to the next segment
    }
    return head; //returning the head of the list
}

//rotate a linkedlist
public static Node rotate(Node head,int k)
{
    int len=1;Node tail=head;
    while(tail.next!=null)
    {
        tail=tail.next;
        len++;
    }
    if(k%len==0) return head; //if k is multiple of length, no rotation needed
    tail.next=head; //making the list circular
    int stepsToNewHead=len-(k%len);
    Node newTail=getKthNode(head,stepsToNewHead-1);
    Node newHead=newTail.next;
    newTail.next=null;
    return newHead;
}

//merge two sorted linkedlist
public static Node merge2(Node head1,Node head2)
{
    Node dummy=new Node(-1);
    Node curr=dummy;
    Node temp1=head1;
    Node temp2=head2;
    while(temp1!=null && temp2!=null)
    {
        if(temp1.data<=temp2.data)
        {
            curr.next=temp1;
            temp1=temp1.next;
        }
        else
        {
            curr.next=temp2;
            temp2=temp2.next;
        }
        curr=curr.next;
    }
    if(temp1!=null)
    {
        curr.next=temp1;
    }
    if(temp2!=null)
    {
        curr.next=temp2;
    }
    return dummy.next; //returning the next node of dummy, which is the head of the merged list
}

//sort a linked list
//using merge sort algorithm
//we break the linkedlist from middle
//break it to single nodes like in merge sort
//sort the two halves using merge2 function which merges two sorted linked list
//repeat this untill full linkedlist is sorted
//process similar to merge sort

public static Node mergeSort(Node head)
{
    if(head==null || head.next==null) return head;
    Node midNode=mid(head); //finding the middle node
    Node leftHead=head;
    Node rightHead=midNode.next;
    midNode.next=null; //breaking the list into two halves
    Node leftSorted=mergeSort(leftHead); //sorting the left half
    Node rightSorted=mergeSort(rightHead); //sorting the right half
    return merge2(leftSorted,rightSorted); //merging the two sorted halves
}

//finding pair sum
public static void pairSum(Node head,int target)
{
   Node left=head;
   Node right=head;
   while(right.next!=null)
   {
    right=right.next; //moving right pointer to the end of the list
   }
   while(left!=null && right!=null && left!=right && right.next!=left)
   {
    int sum=left.data+right.data;
    if(sum==target)
    {
        System.out.println("Pair found: ("+left.data+", "+right.data+")");
        left=left.next;
        right=right.prev;
    }
    else if(sum<target)
    {
        left=left.next; //moving left pointer to the next node
    }
    else
    {
        right=right.prev; //moving right pointer to the previous node
}
   }
   }

//    public static Node removeDuplicates(Node head)
//    {
//     Node temp=head;
//     while(temp!=null && temp.next!=null)
//     {
//         Node nextNode=temp.next;
//         while(nextNode!=null && nextNode.data==temp.data){
//             nextNode=nextNode.next;
//         }
//         temp.next=nextNode;
//         if(nextNode) nextNode.prev=temp;
//         temp=temp.next;
//     }
//     return head;
//    }

//copy linklist with random nodes
//3 steps
//step 1: create new nodes and insert them next to the original nodes
//step 2: copy the random pointers
//step 3: separate the two lists

public static Node cloneLL(Node head)
{
    insertCloneNodes(head);
    copyRandomPointers(head);
    return seperateLists(head);
}

public static void insertCloneNodes(Node head)
{
    Node temp=head;
    while(temp!=null)
    {
        Node copyNode=new Node(temp.data);
        copyNode.next=temp.next;
        temp.next=copyNode;
        temp=temp.next.next;
    }
}

public static void copyRandomPointers(Node head)
{
    Node temp=head;
    while(temp!=null)
    {
        Node copyNode=temp.next;
        if(temp.random!=null)
        {
            copyNode.random=temp.random.next; //copying the random pointer which is present after the copied random node
        } else {
            copyNode.random=null;
        }
        temp=temp.next.next; //moving to the next original node
    }
}

public static Node seperateLists(Node head)
{
    Node temp=head;
    Node dummy=new Node(-1);
    Node copyCurr=dummy;
    while(temp!=null)
    {
        copyCurr.next=temp.next; //linking the copied nodes
        temp.next=temp.next.next; //restoring the original list
        copyCurr=copyCurr.next; //moving to the next copied node
        temp=temp.next; //moving to the next original node
    }
    return dummy.next; //returning the head of the copied list
}

public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9};
    Node head=convertAll(arr);
    // head=deletehead(head);
    // head=deleteTail(head);
    // head=deleteAtPos(head,3);
    // head=insertHead(head,10);
    // head=beforeTail(head,99);
    // head=reverse(head);
    // printList(head);
    // int arr2[]={9,8,7,6,5};
    // Node head2=convertAll(arr2);
    // Node sumHead=add(head, head2);
    // printList(sumHead);
    // head=oddeven(head);
    // printList(head);
    // int arr2[]={0,1,2,0,1,2,0,1,2};
    // Node head2=convertAll(arr2);
    // Node sortedHead=sort(head2);
    // printList(sortedHead);
    // head=removeKth(head,3);
    // printList(head);
    // head=rev(head);
    // printList(head);
    // Node midNode=mid(head);
    // System.out.println("Middle Node: " + midNode.data);
    // head=delall(head,5);
    // printList(head);
    head=Kreverse(head,3);
    printList(head);

}
}
class Node1{
    String data;
    Node next;
    Node prev;
    Node1(String data1){
        this.data=data1;
        this.next=null;
        this.prev=null;
    }
    Node1(String data1,Node next1,Node prev1){
        this.data=data1;
        this.next=next1;
        this.prev=prev1;
    }
}

//design a browser history using doubly linked list
class BrowserHistory{
    Node1 current;
    BrowserHistory(String homepage)
    {
        current=new Node1(homepage);
    }
    public void visit(String url)
    {
        Node1 newNode=new Node1(url);
        current.next=newNode;
        newNode.prev=current;
        current=newNode;
    }
    public String back(int steps)
    {
        while(steps>0)
        {
            if(current.prev==null) break;
            current=current.prev;
            steps--;
        }
        return current.data;
    }
    public String forward(int steps)
    {
        while(steps>0)
        {
            if(current.next==null) break;
            current=current.next;
            steps--;
        }
        return current.data;
    }
}

