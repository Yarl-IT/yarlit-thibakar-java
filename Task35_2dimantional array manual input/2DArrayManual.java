class TwoDArrayManual{
	public static void main(String args[]){
		int[][] y = new int[5][3];
		
		y[0][0]=10;
		y[0][1]=20;
		y[0][2]=30;
		y[1][0]=40;
		y[1][1]=50;
		y[1][2]=60;
		y[2][0]=70;
		y[2][1]=80;
		y[2][2]=90;
		y[3][0]=100;
		y[3][1]=110;
		y[3][2]=120;
		y[4][0]=130;
		y[4][1]=140;
		y[4][2]=150;
		
		for(int a=0; a<5; a++){
			for(int b=0; b<3; b++){
				System.out.println(y[a][b]);
			}
		}
	}
}