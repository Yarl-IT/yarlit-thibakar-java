class ArrayWhileLoopReverse{
	public static void main(String args[]){
		int[] x={10,20,30,40,50};
		
		int i = x.length-1;
		while(i>=0){
			System.out.println(x[i]);
			i--;
		}
	}
}