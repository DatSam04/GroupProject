// Node is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class Node {
    public int data;       // data stored in this node
    public Node next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public Node() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public Node(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    // post: constructs a string representation of the list
    public String toString() {
    	Node current = this;
    	String resultString = "[LinkedList]-->";
    	while (current.next != null) {
        	resultString += "[";
    		resultString += (current.data);
    		resultString += ("]->");
    		current = current.next;
    	}
    	resultString += ("[" + current.data + "]-->null");
		return resultString;

    }
}