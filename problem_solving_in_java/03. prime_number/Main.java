public class Main{
	public static void main(String[] args){
		isPrimeNumber(Integer.parseInt(args[0]));
	}
	public static void isPrimeNumber(int num){
		boolean isPrimeNumber = true;
		for(int i=2; i<num; i++){
			if(num%i==0) isPrimeNumber = false;
		}
		System.out.println(isPrimeNumber);
	}
}
