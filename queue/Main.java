public class Main{

	static void increment(Queue e){
		e.data += 1;
	}

	public static void main(String[] args){
		Queue request = new Queue(23);
		Main.increment(request);
		System.out.println(request.data);
	}
}
