class ArrayDoWhileLoopReverse{
	public static void main (String args[]){
		int[] x = {10,20,30,40,50};
		
		int i = x.length-1;
		do{
			System.out.println(x[i]);
			i--;
		} while(i >= 0);
	}
}