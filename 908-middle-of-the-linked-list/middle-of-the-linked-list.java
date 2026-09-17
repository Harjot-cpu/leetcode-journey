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
    public ListNode middleNode(ListNode head) {
        if(head ==null) return head;
        int l = lengthofnode(head);
        if(l%2==0){
            l = l/2+1;
        }
        else{
            l = l/2 +1;
        }

        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count +=1;
            if(count == l-1){
                return temp.next;
            }
            temp = temp.next;
        }
        return head;
    }
    public int lengthofnode(ListNode head){
        int count  =0;
        ListNode temp = head;
        while(temp!= null){
            count +=1;
            temp = temp.next;
        }
        return count;
    }
}