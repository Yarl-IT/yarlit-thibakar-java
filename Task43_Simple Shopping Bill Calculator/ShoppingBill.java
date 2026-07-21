import java.util.Scanner;
class ShoppingBill {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Item Price: ");
		int price = sc.nextInt();
		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();
		
		int total = price * quantity;
		
		if(total > 5000){
			System.out.println("Discount Applied (10%)");
			total = total - (total * 10/100);
		}else{
			System.out.println("No Discount ");
		}
		
		System.out.println("Total bill Amount : "+total);
	}
}