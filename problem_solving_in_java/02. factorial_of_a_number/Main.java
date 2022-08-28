public class Main{
    public static void main(String[] args){
    	System.out.println(factorial(20));	
    }
    public static long factorial(long number) {
        long result = 1L;
        while (number != 0) {
            result = result * number;
            number--;
        }
        return result;
    }
}