// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class ListNode {
    public double data;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0.0, null);
    }
    // post: constructs a node with given data and null link
    public ListNode(double data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(double data, ListNode next) {
        this.data = data;
        this.next = next;
    }
    
    // post: constructs a string representation of the list
    public String toString() {
    	ListNode current = this.next;
    	String resultString = "";
    	while (current.next != null) {
    		resultString += current.data + ", ";
    		current = current.next;
    	}
    	resultString += (current.data);

		return resultString;

    }
}