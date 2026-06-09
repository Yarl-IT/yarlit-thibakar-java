import java.util.Scanner;
class SimpleCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first Number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second Number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Operation Choises");
		System.out.println("- - - - - - - - - - - - - -");
		System.out.println("1. Addition (+)");
		System.out.println("2. Substraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		System.out.println("- - - - - - - - - - - - - -");
		System.out.println("Enter The Operation Number: ");
		int operation = sc.nextInt();
		
		int result = 0;
		
		switch (operation) {
			case 1:
				result = num1 + num2;
					break;
			case 2:
				result = num1 - num2;
					break;
			case 3:
				result = num1 * num2;
					break;
			case 4:
				result = num1 / num2;
					break;
		}
		System.out.println("Result :" +result);
	}
}