import java.util.Scanner;
class StudentMarksArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int [] marks;
		marks = new int [5];
		
		int total = 0;
		double average;
		for(int x = 0; x < 5; x++){
			System.out.print("Enter Marks For Subject " + (x + 1) + ": ");
			marks[x] = sc.nextInt();
		}

		for(int y = 0; y < 5; y++){
			total += marks[y];
		}
		average = total / 5;
		
		System.out.println("Total Marks = " +total);
		System.out.println("Average = " +average);
	}
}