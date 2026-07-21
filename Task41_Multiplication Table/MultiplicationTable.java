import java.util.Scanner;
class MultiplicationTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();
		
		for(int x = 0; x <= 10; x++){
			int answer = number * x;
			System.out.println( number +" X " +x +" = " +answer );
		}
	}
}