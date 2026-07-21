import java.util.Scanner;
class PasswordChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String password = "yarlit123";
		
		for(int x = 3; x > 0; x--){
			System.out.print("Enter Password :");
			String pass = sc.next();
			
			if(pass.equals(password)){
				System.out.println("Access Granted");
				break;
			}else if(x!=1){
				System.out.println("Worng Password. Attempts Left: " +(x-1));
			}else{
				System.out.print("Access Blocked");
			}
		}
	}
}