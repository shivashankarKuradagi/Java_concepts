package com.shiv.linkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {

		/*
		 * ListNode l13 = new ListNode(0); ListNode l12 = new ListNode(8, l13);
		 */
		ListNode l11 = new ListNode(1);
		System.out.println(l11.toString());

		ListNode l23 = new ListNode(5);
		ListNode l22 = new ListNode(9);
		ListNode l21 = new ListNode(9, l22);

		System.out.println(addTwoNumbers(l11, l21));

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int sum = 0;
		int digit = 0;
		ListNode ref = null;
		ListNode node = null;

		while (l1 != null && l2 != null) {
			System.out.println("l1 : " + l1.toString());
			System.out.println("l2 : " + l2.toString());
			sum = l1.val + l2.val + digit;
			if (sum >= 10) {
				sum = sum % 10;
				digit = 1;
			} else {
				digit = 0;
			}

			ListNode node1 = new ListNode(sum, null);
			if (ref == null) {
				node = node1;
				ref = node;
			} else {
				ref.next = node1;
				ref = node1;
			}
			System.out.println("sum : " + sum);
			System.out.println("result : " + node);
			sum = 0;
			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null) {
			sum = l1.val + digit;
			if (sum >= 10) {
				sum = sum % 10;
				digit = 1;
			} else {
				digit = 0;
			}
			ListNode node1 = new ListNode(sum, null);
			ref.next = node1;
	
			l1 = l1.next;
		}

		while (l2 != null) {
			sum = l2.val + digit;
			if (sum >= 10) {
				sum = sum % 10;
				digit = 1;
			} else {
				digit = 0;
			}
			ListNode node1 = new ListNode(sum, null);
			ref.next = node1;
			l2 = l2.next;
			System.out.println(node);
		}

		if (digit > 0) {
			ListNode node1 = new ListNode(digit, null);
			ref.next = node1;
			System.out.println(node);
		}

		return node;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}

	}

}
