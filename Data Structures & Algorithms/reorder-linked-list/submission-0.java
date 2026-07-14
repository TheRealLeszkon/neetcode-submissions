/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public static ListNode reverseLinkedList(ListNode head){
    ListNode curr = head;
    ListNode prev = null;
    ListNode next;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev =curr;
        curr = next;
    }
    return prev;
}

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode toBeFlipped = slow.next;
        slow.next =null;
        ListNode second = reverseLinkedList(toBeFlipped);
        ListNode first =head;
        ListNode temp1 = null;
        ListNode temp2 = null;
        while(second!=null){
            temp1 = first.next;
            temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;

        }
        
    }
}
