import java.util.Scanner;
class ATM {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int balance = 1000000;
		String repeat = "y";
		
		do{
			System.out.println("---- ATM MENU ----");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("");
			System.out.print("Choose Option: ");
		
			int option = sc.nextInt();
			
			switch (option) {
				case 1:
					System.out.println("Your Actual Balance is : " +balance);
						break;
				case 2:
					System.out.print("Enter Deposit Amount: ");
					int deposite = sc.nextInt();
					if(deposite > 0){
						balance = balance + deposite;
						System.out.println("Updated Balance: "+balance);
						
							break;
					} else{
						System.out.println("Invalid Deposite Amount");
							continue;
					}
				case 3:
					System.out.print("Enter Widthdrawal Amount: ");
					int withdraw = sc.nextInt();
					if(withdraw > 0 && withdraw <= balance){
						balance = balance - withdraw;
						System.out.println("Updated Balance: "+balance);
						
					} else if(withdraw <= 0){
						System.out.println("Invalid Amount!!");
							continue;
					}else{
						System.out.println("Your Account balance is low");
						System.out.println("Your Maximum Withdrawal amount is: "+balance);
					}
			}
			System.out.print("Do you want another operation? (y/n): ");
			repeat = sc.next();
		}
		while(repeat.equalsIgnoreCase("y"));
		System.out.println("Thank you! Have a nice day.");
	}
}