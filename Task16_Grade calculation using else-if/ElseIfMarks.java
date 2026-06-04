class ElseIfMarks {
	public static void main(String args[]){
		int marks = 74;
		
		if ((marks >= 75) && (marks <= 100)){
			System.out.println("Grade : A");
		} else if ((marks >= 65) && (marks <= 74)){
			System.out.println("Grade : B");
		} else if ((marks >= 55) && (marks <= 64)){
			System.out.println("Grade : C");
		} else if ((marks >= 35) && (marks <= 54)){
			System.out.println("Grade : S");
		} else if ((marks >= 0) && (marks <=34)){
			System.out.println("Grade : F");
		} else {
			System.out.println("Invalid marks! Please enter marks between 0 to 100.");
		}
	}
}