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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode curr = head;
        int count = 0;
        
        // Step 1: Check if k nodes exist
        while(curr != null && count < k){
            curr = curr.next;
            count++;
        }
        
        // Step 2: If k nodes exist, reverse
        if(count == k){
            
            ListNode prev = null;
            curr = head;
            
            // reverse k nodes
            for(int i = 0; i < k; i++){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            
            // Step 3: connect with remaining list nodes
            head.next = reverseKGroup(curr, k);
            
            return prev; // new head mein 
        }
        
        return head; // less than k nodes  means no no change
    }
}