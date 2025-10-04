package doublyLinkedList;

public class DoublyLInkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Node insertAtBegin(Node head, int data) {
		
		Node temp = new Node(data);
		temp.next = head;
		
		if(head != null) {
			head.prev = temp;
		}
		return temp;
	}
	
public static Node insertAtEnd(Node head, int data) {
		
	
	   Node temp = new Node(data);  
	   if(head == null) { 
		   head = temp;
		   }
	  else { 
		  while(head.next != null) { 
			  
		  } 
	  }
	  
	 		
		return head;
	}

}
