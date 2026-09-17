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
    public ListNode reverseList(ListNode head) {
        int l = lengthll(head);
        int[] arr = new int[l];
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            arr[count] = temp.val;
            count +=1;
            temp = temp.next;
        }
        for(int i = 0;i<l/2;i++){
            int data = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = data;
        }
        ListNode ans = convert(arr);
        return ans;

    }
    public int lengthll(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp!= null){
            count +=1;
            temp = temp.next;
        }
        return count;
    }
    public ListNode convert(int[] arr){
        if(arr.length ==0) return null;
        ListNode hd = new ListNode(arr[0]);
        ListNode mover = hd;
        for(int i = 1;i<arr.length;i++){
            mover.next = new ListNode(arr[i]);
            mover = mover.next;
        }
        return hd;
    }
}