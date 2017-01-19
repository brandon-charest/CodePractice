
public class Stack {
	
	private static class Node{
		private char data;
		private Node next;
		private Node(char data){
			this.data=data;
		}
	}
	
	private Node top;
	
	public boolean isEmpty(){
		return top==null;
	}
	
	public char peek(){
		return top.data;
	}
	
	public void push(char data){
		Node node = new Node(data);
		node.next=top;
		top=node;
	}
	
	public char pop(){
		char data = top.data;
		top=top.next;
		return data;
	}
	
	
	
}
