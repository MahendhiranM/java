public class Main{
	public static void main(String[] args){
		isStrongNumber(Integer.parseInt(args[0]));
	}
	public static void isStrongNumber(int number){
		int num = number, sum=0;
		while(num > 0){
			int singleDigit = num%10;
			int i = 1, f = 1;
			while(i <= singleDigit){
				f *= i;
				i++;
			}
			sum += f;
			num /= 10;
		}
		System.out.println(number +" = "+ sum);
	}
}
