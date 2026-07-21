import java.util.Scanner;
class LargestNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int number1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int number2 = sc.nextInt();
		System.out.print("Enter Third Number: ");
		int number3 = sc.nextInt();
		
		if (number1 >= number2 && number1 >= number3) {
            System.out.println("Largest Number is: "+number1 );
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("Largest Number is: "+number2 );
        } else {
            System.out.println("Largest Number is: "+number3 );
        }
	}
}