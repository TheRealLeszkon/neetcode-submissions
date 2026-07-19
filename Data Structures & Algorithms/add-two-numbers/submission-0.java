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

class Solution {
    // public static ListNode reverseList(ListNode head){
    //     ListNode curr = head;
    //     ListNode prev = null;
    //     ListNode next;
    //     while(curr!=null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr= next;
    //     }
    //     return prev;
    // }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(-1);
        ListNode curr = temp;
        int sum,digit,carry=0;
        while(l1 != null || l2!= null || carry!=0){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            sum = x + y + carry;

            digit = sum % 10;
            carry = sum / 10;
            curr.next = new ListNode(digit);
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;    
            }
            curr = curr.next;
        }
        return temp.next;
    }
}
