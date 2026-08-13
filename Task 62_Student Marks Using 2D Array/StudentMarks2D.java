import java.util.Scanner;
class StudentMarks2D{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int students=4;
		int subjects=3;
		
		String[] subjectNames={"ICT","Tamil","Maths"};
		int [][] marks=new int[students][subjects];
		
		for(int i=0;i<students;i++){
			System.out.println("Enter marks for Students"+(i+1));
			for(int j=0;j < subjects;j++){
				System.out.print(subjectNames[j]+": ");
				marks[i][j]=sc.nextInt();
			}
			System.out.println();
		}
			System.out.println("Student\tICT\tTamil\tMaths\tTotal\tAverage");
			
		for (int i = 0; i < students; i++){
			int total=0;
			System.out.print("S"+(i+1)+"\t");
			for (int j = 0; j < subjects; j++) {
			    System.out.print(marks[i][j] + "\t");
				total +=marks[i][j];
			}
			double avg=total/(double)subjects;
			System.out.println(total+"\t"+ avg);
		}
	}
}
