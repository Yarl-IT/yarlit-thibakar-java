import java.util.Scanner; 
public class LoginSystem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String username = "Thibakar";
        String password = "1231";

       
        
        
        System.out.print("Enter username: ");
        String u = sc.next();

        System.out.print("Enter password: ");
        String p = sc.next();

        
        if(u.equals(username) && p.equals(password)){
            System.out.println("Login Successful! Welcome,");
        }else{
            System.out.println("Login Failed! Invalid username or password.");
        }

       
        
    }
}