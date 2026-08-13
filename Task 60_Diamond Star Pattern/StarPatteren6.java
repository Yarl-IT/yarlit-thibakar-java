class StarPatteren6{
    public static void main(String args[]){
        int x = 5;
        
        
        for (int i = 1; i <= x; i++){
            for (int j = i; j < x; j++){
                System.out.print(" ");
            }
           
            for (int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = x - 1; i >= 1; i--){
           for (int j = i; j < x; j++){
                System.out.print(" ");
            }
        
            for (int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
	