class Problem{
	int[] solution(int[] numbers) {
    	int length = numbers.length - 2;
    	int[] num = new int[length];
    	int i = 0;
    	while(i != length){
    		int a = numbers[i];
    		int b = numbers[i+1];
    		int c = numbers[i+2];
    		if(((a < b)&&(b > c)) ||((a > b)&&(b < c)))
				num[i] = 1;
			else
				num[i] = 0;
			i++;
    	}
    	return num;
	}

}
