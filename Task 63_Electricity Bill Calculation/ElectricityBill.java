import java.util.Scanner;
class ElectricityBill{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter electricity units: ");
		int units=sc.nextInt();
		
		int amount;
		
		if(units <=60){
			amount=units*30;
		}
		else if(units <=90){
			amount=(60*30)+(units - 60)*35;
		}
		else{
			amount=(60*30)+(30*35)+(units - 90)*50;
		}
		System.out.println("ElectricityBill Amount: Rs.  "+amount);
	}
}