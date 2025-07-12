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
	
	public static int search_recursive(Node head , int x) {
		
		int pos =1;
		if(head == null) {
			return -1;
		}
		if(head.data ==x) {
			return 1;
		}
		
		else {
		int res =	search_recursive(head.next, x);
		
		if(res ==-1) {
			return -1;
		}
		else return res+1;
		}
		
	}
	
	public static int search(Node head , int x) {
		
		int pos =1 ;
		Node curr = head;
		
		while(curr != null) {
			
			if(curr.data ==x) {
				return pos;
			}
			else {
				pos++;
				curr = curr.next;
			}
		}
		return -1;
		
	}
	
public static Node insertatBegin(Node head , int x) {
		
		Node newNode = new Node(x);
		newNode.next=head;
		return newNode;
		
		
	}

public static Node insertatEnd(Node head , int x) {
	
	Node newNode = new Node(x);
	if(head == null) {
		return newNode;
	}
	
	Node curr = head;
	while(curr.next!= null) {
		curr =curr.next;
	}
	curr.next =newNode;
	return head;
	
	
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
