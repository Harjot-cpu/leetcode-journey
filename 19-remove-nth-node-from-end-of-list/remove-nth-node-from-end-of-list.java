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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        int len = lengthll(head);
        int ind = len - n;
         if(ind == 0){
            return head.next;}
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count +=1;
            if(count ==ind){
                break;
            }
            temp = temp.next;
        }
    temp.next = temp.next.next;

        return head;
        

    }

    public int lengthll(ListNode head){
        int count =0;
        ListNode temp = head;
        while(temp != null){
            count +=1;
            temp = temp.next;
        }
        return count;
    }
}