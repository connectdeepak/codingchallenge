package linkedlist;

public class PrintLinkedList {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		
		head.next.next.next= new Node(40);
		
		printNodes(head);
		
	Node beigin = 	insertatBegin(head,5);
		
		printNodes(beigin);
		printNodes_recurssion(beigin);
	}
	
public static Node insertatBegin(Node head , int x) {
		
		Node newNode = new Node(x);
		newNode.next=head;
		return newNode;
		
		
	}
	
	public static void printNodes(Node node) {
		
		Node curr = node;
		
		while(curr != null) {
			
			System.out.println(curr.data);
			curr = curr.next;
			
		}
		
	}
	
public static void printNodes_recurssion(Node head) {
		
		if(head == null) {
			return;
		}
		else {
			System.out.println(head.data);
			head = head.next;
			printNodes_recurssion(head);
		}
		
	}

}
