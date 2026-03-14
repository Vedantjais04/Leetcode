/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a = headA;
    ListNode b = headB;

    int lengthA = 0;
    while(a != null){
        lengthA++;
        a = a.next;
    }
    int lengthB = 0;
    while(b !=null){
        lengthB++;
        b = b.next;
    }
    a = headA;
    b = headB;
    if(lengthA>lengthB){
        int steps = lengthA-lengthB;
        for(int i =0;i< steps;i++){
            a = a.next;
        }
    }
    else{
        int steps = lengthB-lengthA;
        for(int i = 0;i<steps;i++){
            b = b.next;
        }
    }
    while(a!=b){
        a = a.next;
        b = b.next;
    }
    return a;
    }
}