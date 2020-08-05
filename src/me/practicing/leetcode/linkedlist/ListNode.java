package me.practicing.leetcode.linkedlist;

public class ListNode {
	
	int val;
	ListNode next;
	
	public ListNode() {
		
	}
	
	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val,ListNode next) {
		this.val=val;
		this.next = next;
	}
	
	public static ListNode createNewLinkedList(int[] inputs) {
		
		ListNode list = null;
		
		for(int eachDigit:inputs) {
			ListNode head = new ListNode(eachDigit);
            head.next = list;
            list = head;
		}
		
		return list;
		
	}
	public static void print(ListNode listNode) {
		while(listNode != null) {
			System.out.print(listNode.val);
			listNode = listNode.next;
		}
		
	}
}
