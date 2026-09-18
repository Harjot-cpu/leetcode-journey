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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
        slow = slow.next;}

    ListNode sec = reverse(slow);
    boolean ans = true;
    ListNode temp = head;
    ListNode temp2 = sec;
    while(temp2 != null){
        if(temp.val != temp2.val) return false;

        temp = temp.next;
        temp2 = temp2.next;
    }
    return true;
    }

    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode mover = temp.next;
            temp.next = prev;
            prev =temp;
            temp = mover;
        }
        return prev;
    }
}