public class Soln {
	
	

	public static void main(String[] args) {
		// Problem 1 -- Create a Linked List with all nodes' data equal to 42.
		// Note: All nodes have a data field as well as a next link, so the first node is our "list name" node.
		// i.e. The first node in myList would be the myList box-arrow combination in a diagram, and the first
		// actual list node would be the one with the 7.
		ListNode myList1 = new ListNode(0, new ListNode(7, new ListNode(11, new ListNode(4, new ListNode(16)))));

		ListNode current = myList1.next; // the first node is supposed to be our "name node"
		System.out.println(myList1.toString());

		while(current != null) {

		    current.data = 42;

		    current = current.next;

		}
		
		System.out.println(myList1.toString());
		
		// Problem 2 -- Add hasTwoConsecutive method to LinkedIntList class.
		// First we'll create a LinkedIntList, and then we'll call our new method.
		// This class has its own toString method you can call. 
		// I prefer the method I used for the ListNode problem, since it reminds me
		// I am working with a linked list. You can modify toString if you want.
		
		LinkedIntList myList2 = new LinkedIntList();
		myList2.add(5);
		myList2.add(7);
		myList2.add(8);
		myList2.add(3);
		
		System.out.println(myList2.toString());
		
		System.out.println(myList2.hasTwoConsecutive());
		
		// Problem 3a -- Create a linked sequence of nodes containing the values 1, 2, 3, 4, 5.
		// Since we already have a ListNode class, I accepted answers using that instead of a new
		// Node class. However, given how the question is framed, I created a new class for it.
		// You may notice that the two classes are almost identical -- the difference is in the toString() method.
		// For ListNode, I was assuming the first node would be a "name node" and contain NO DATA.
		// For Node, the question specifies that front DOES contain data. 
		
		
		// The one-line method -- OK for short lists
		Node front = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
		System.out.print(front.toString());
		System.out.println();
		
		// A better method:
		Node front1 = new Node(1);
		Node current1 = front1;
		for (int i = 2; i < 6; i++) {
			current1.next = new Node(i);
			current1 = current1.next;
		}
		
		System.out.print(front1.toString());
		System.out.println();
		System.out.println();
		
		// Problem 3b -- interpret the code
		// To save input, we'll use the old front:
		// Node front = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
		Node cursor3b = front;

		while(cursor3b.next != null) {

		cursor3b = cursor3b.next;

		}

		cursor3b.next = front;

		cursor3b = cursor3b.next;
		
		System.out.print("The data in node cursor3b now: ");
		System.out.println(cursor3b.data);
		
		// Note: now that you have created a CIRCULAR linked list, our toString method won't work -- why not?
		
		// Problem 3c -- This is a circular linked list -- this means you can't use loops that search for the next link being null.
		


	}

}
