import java.util.Scanner;
class ArraySum{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] x = new int[5];
		int sum = 0;
		
		System.out.println("Enter 5 numbers: ");
		
		for(int n = 0; n < 5; n++){
			x[n] = scan.nextInt();
			sum = sum + x[n];
		}
		System.out.println("sum of array elements: " +sum);
	}
}