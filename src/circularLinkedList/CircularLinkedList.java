package circularLinkedList;

public class CircularLinkedList {
	
	 private Node head= null;
	 
	 
	 public Node insertAtBegin(Node head , int data) {
		 
		 Node temp = new Node(data);
		 if(head == null) {
			 temp.next = temp;
			 
		 }
		 else {
			 Node curr = head;
			 
			 while(curr.next != head) {
				 curr = curr.next;
			 }
			 curr.next = temp;
			 temp.next = head;
			 head = temp;
		 }
		 
		 return temp;
		 
	 }
	 
	 public Node insertAtEnd(Node head , int data) {
		 
		 Node temp = new Node(data);
		 
		 if(head == null) {
			 temp.next = temp;
			 head = temp;
		 }
		 else {
			 
		 }
		 
		 
		 
		 return head;
		 
	 }

}
