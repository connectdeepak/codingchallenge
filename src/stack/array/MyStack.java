package stack.array;

public class MyStack {
	
	int [] arr;
	int top;
	int capacity;
	
	MyStack(int c){
		
		capacity =c;
		top =-1;
		arr = new int[capacity];
		
	}
	
	void push(int x) {
		top++;
		arr[top] =x;
	}
	
	int pop() {
		int res = arr[top];
		top--;
		return res;
		
	}
	
	int size() {
		return top+1;
	}
	
	boolean isEmpty() {
		return (top==-1);
	}
}
	
	class Test{
		public static void main(String[] args) {
			MyStack stack = new MyStack(5);
			stack.push(2);
			stack.push(20);
			
			System.out.println(stack.pop());
		}
	}
	
	


