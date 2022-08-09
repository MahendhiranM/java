class Main{
	public static void main(String[] agrs){
		Problem p = new Problem();
		int[] numbers = {1, 2, 1, 3, 4};
		for(int num:p.solution(numbers))
		System.out.println(num);
	}
}
