package LINKED_LIST;

import java.util.Arrays;

public class ReverseALinkedListInGroupsOfSizeK {
    private static Node head;
    private static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
//    private static Node insert(int data,Node head)
//    {
//
//    }
    public static void main(String[] args) {
        int [] arr ={10,20,30};
 var x= Arrays.stream(arr).findFirst();
        System.out.println(x);
    }

}
