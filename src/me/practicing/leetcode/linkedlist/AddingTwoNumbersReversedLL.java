package me.practicing.leetcode.linkedlist;

public class AddingTwoNumbersReversedLL {
	
	/*
	 * We can not use Stack for this
	 * Time Complexity - 
	 * Space Complexity - 
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode sumListNode, newNode, tailNode= new ListNode(0);
        int sum = 0;
        sumListNode = tailNode;
        while(l1 != null || l2 != null){         
            newNode = new ListNode();
            if(l1 != null) {
            	sum += l1.val;
            	l1 = l1.next;
            }
            if(l2 != null) {
            	sum += l2.val;
            	l2 = l2.next;
            }
                   
            tailNode.val = sum%10 ;  
            newNode.val = sum/10;
            tailNode.next = newNode;
            tailNode = newNode;
            /*if(sumListNode == null){
                sumListNode = tailNode = newNode;
            } else {

            }*/
            sum /= 10;         
            
        }
        /*if(l1 == null && l2 == null && sum > 0){
                newNode = new ListNode();
                newNode.val = sum;
                tailNode.next = newNode;
                tailNode = newNode;
        }*/
        return sumListNode;
        
        // below commented code is faster than the above one.
        
        /*
         ListNode sumListNode=null, newNode, tailNode=null;
        int que = 0;
        while(l1 != null || l2 != null){
            int sum = 0;            
            newNode = new ListNode();
            if(l1 != null && l2 != null){
                sum = l1.val + l2.val + que;
                 l1 = l1.next;
                l2 = l2.next;
            } else if(l1 == null && l2 !=null){
                sum = l2.val + que;
                l2 = l2.next;
            } else {
                sum = l1.val + que;
                 l1 = l1.next;
            }
            
            int rem = sum%10;
            
            newNode.val = rem ;  
            if(sumListNode == null){
                sumListNode = tailNode = newNode;
            } else {
                tailNode.next = newNode;
                tailNode = newNode;
            }
            que = sum/10;         
            
        }
        if(l1 == null && l2 == null && que > 0){
                newNode = new ListNode();
                newNode.val = que;
                tailNode.next = newNode;
                tailNode = newNode;
            }
        return sumListNode;
         */
    }
	
		
	

	public static void main(String[] args) {
		int[] firstNumber = {2,4,3};
		int[] secondNumber = {5,6,4};
		ListNode l1 = ListNode.createNewLinkedList(firstNumber);
		ListNode l2 = ListNode.createNewLinkedList(secondNumber);
		ListNode sum = addTwoNumbers(l1,l2);
		ListNode.print(sum);
	}

}
