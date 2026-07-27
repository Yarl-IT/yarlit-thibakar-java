
class HighestMarks{
	public static void main(String args[]){
		int [] marks = {50, 90 , 95, 86, 56};
		
		int highestmarks = marks[0];
		
		for(int x = 1; x < marks.length; x++){
			if(marks[x] > highestmarks){
				highestmarks = marks[x];
			}
		}
		System.out.println("HighestMarks is : "+highestmarks);
		
	}
}