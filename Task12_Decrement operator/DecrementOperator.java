class DecrementOperator {
	public static void main(String args[]) {
		int y = 15;
		y = y - 5;
		System.out.println(y);
		
		y -= 5;
		System.out.println(y);
		
		y--;                    //Post-decrement  
		System.out.println(y);
		
		--y;                    // Pre-decrement
		System.out.println(y);
		System.out.println(y--);
		System.out.println(y);
		System.out.println(--y);
		
	}
}