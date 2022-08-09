public class Main{

	public static void main(String[] args){
		Stack history = new Stack();
		history.push("www.google.com");
		history.push("www.yahoo.com");
		history.push("www.duckduckgo.com");
		System.out.println(history.pop());
		history.display();
	}
}
