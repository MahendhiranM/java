public class Main{
	public static void main(String[] args){
		outerLoop: for(int i=0; i<10; i++){
			innerLoop: for(int j=0; j<10; j++){
				if(j==6 || j==2) continue outerLoop;
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
