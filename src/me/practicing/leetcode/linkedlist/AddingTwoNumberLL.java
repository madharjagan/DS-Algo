package me.practicing.leetcode.linkedlist;

import java.util.Stack;

public class AddingTwoNumberLL {
	
	public static ListNode addTwoNumbersUsingStack(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode list = new ListNode(0);
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            list.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }
        
        return list.val == 0 ? list.next : list;
    }
	

	public static void main(String[] args) {
		int[] firstNumber = {1,2,3};
		int[] secondNumber = {9,8,7};
		ListNode l1 = ListNode.createNewLinkedList(firstNumber);
		ListNode l2 = ListNode.createNewLinkedList(secondNumber);
		ListNode sum = addTwoNumbersUsingStack(l1,l2);
		ListNode.print(sum);
	}

}
