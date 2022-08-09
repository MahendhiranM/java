public class LinkedList{
	Node head;
	public LinkedList(){
		Node head = null;
	}

	public class Node{
		int data;
		Node next;
		public Node(int val){
			data = val;
			next = null;
		}
	}

	public void insertAtBeginning(int val){
		Node newNode = new Node(val);
		if(head == null) head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insert(int val){
		Node newNode = new Node(val);
		if(head == null) head = newNode;
		else {
			Node temp = head;
			while(temp.next != null){
				System.out.println(temp.next == null);
				if(temp.next == null) temp.next = newNode;
				temp = temp.next;

			}
		}
	}

	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
