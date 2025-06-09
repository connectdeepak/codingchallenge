import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LinkedListSum {
	
//	l1 =
	//		[9]
			
		//[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
					
	//				l2 =
	//		[1,9,9,9,9,9,9,9,9,9]
	
	//[1,1,1  ,1,1,1  ,1,1,1  ,1,1]
	
	  
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode l1_1 = new ListNode(9);
	//	ListNode l1_2 = new ListNode(4);
	//	ListNode l1_3 = new ListNode(3);
		
	//	l1_2.next = l1_3;
	//	l1_1.next = l1_2;
		
		ListNode l2_1 =   new ListNode(1);
		ListNode l2_2 =   new ListNode(1);
		ListNode l2_3 =   new ListNode(1);
		ListNode l2_4 =   new ListNode(1);
		ListNode l2_5 =   new ListNode(1);
		ListNode l2_6 =   new ListNode(1);
		ListNode l2_7 =   new ListNode(1);
		ListNode l2_8 =   new ListNode(1);
		ListNode l2_9 =   new ListNode(1);
		ListNode l2_10 =  new ListNode(1);
		ListNode l2_11 =  new ListNode(1);
		
		

		l2_10.next = l2_11;
		l2_9.next = l2_10;
		l2_8.next = l2_9;
		l2_7.next = l2_8;
		l2_6.next = l2_7;
		l2_5.next = l2_6;
		l2_4.next = l2_5;
		l2_3.next = l2_4;
		l2_2.next = l2_3;
		l2_1.next = l2_2;
		
		
		addTwoNumbers(l1_1, l2_1);

	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		List<Double > list1 = new ArrayList<>();
		
		List<Double> list2 = new ArrayList<>();
		
		ListNode temp1 = l1.next;
		list1.add((double) l1.val);
		
		while(temp1 != null) {
			list1.add((double) temp1.val);
			temp1 = temp1.next;
		}
		
		ListNode temp2 = l2.next;
		list2.add((double) l2.val);
		
		while(temp2 != null) {
			list2.add((double) temp2.val);
			temp2 = temp2.next;
		}
		
		double value1 =(double) 0;
		
		for(int i =0 ; i < list1.size() ;i++) {
			value1 =  (value1 + (list1.get(i)* Math.pow(10, i)));
		}
		
		System.out.println("value1" + value1);
		
		double value2 =(double) 0;
		for(int i =0 ; i < list2.size() ;i++) {
			value2 =   (value2 + (list2.get(i)*  Math.pow(10, i)));
		}
		
		System.out.println("value2" + value2);
		
		
		
		double result = value1+value2;
		
		System.out.println("result" + result);
		
		
		ListNode resultNode = new ListNode(0);
		ListNode temp = resultNode;
		
		while(result > 0) {
			int digit  = (int) (result%10);
			ListNode newNode = new ListNode(digit);
			resultNode.next =  newNode;
			resultNode = newNode;
			result = result/10;
			
			if(result == 0) {
				resultNode= temp.next ;
				temp.next = null;
			}
		}
		
		
	
	
	return resultNode;
        
    }


}
