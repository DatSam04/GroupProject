// Class LinkedIntList can be used to store a list of integers.

public class LinkedList {
    private ListNode front;  // first value in the list

    // post: constructs an empty list
    public LinkedList() {
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public double get(int index) {
        return nodeAt(index).data;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (front == null) {
            return "null";
        } else {
            String result = "" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            return result;
        }
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current !=  null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(double value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(double index, double value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }
    
    // pre: 0 <= size()
    // post: returns true if the list has two adjacent nodes containing consecutive numbers, else returns false.
    public Boolean hasTwoConsecutive() {
    	if (this.size() < 2) {
    		return false;
    	}
    	ListNode current = front;
    	double currData = front.data;
    	while (current.next != null) {
    		current = current.next;
    		
    		if (current.data == currData + 1) {
    			return true;
    		}
    		currData = current.data;    		
    	}
		return false;
    	
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode nodeAt(double index) {
        ListNode current = front;
        for (double i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}
