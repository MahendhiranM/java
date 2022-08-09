public class Stack{
	private String[] data = new String[10];
	private int top;

	public Stack(){
		top = -1;
	}

	public void push(String val){
		if(top != data.length - 1)
			data[++top] = val;
		else
			System.out.println("Stack is full");
	}

	public String pop(){
		if(top == -1)
			return "Stack is empty";
		else
			return data[top--];
	}

	public void display(){
		for(int i=0; i<=top; i++)
			System.out.println((i+1)+". "+data[i]);
	}
}
