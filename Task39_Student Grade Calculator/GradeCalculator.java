import java.util.Scanner;
class GradeCalculator {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Marks For Subject 1: ");
		int subject1 = sc.nextInt();
		System.out.print("Enter Marks For Subject 2: ");
		int subject2 = sc.nextInt();
		System.out.print("Enter Marks For Subject 3: ");
		int subject3 = sc.nextInt();
		
		int total = subject1 + subject2 + subject3;
		int average = total / 3;
		
		if(average >= 70){
			System.out.print("Grade : A");
		}else if(average >= 60){
			System.out.print("Grade : B");
		}else if(average >= 40){
			System.out.print("Grade : C");
		}else if(average >= 35){
			System.out.print("Grade : S");
		}else{
			System.out.print("Grade : F");
		}
	}
}