class StarPatteren4{
    public static void main(String args[]){
        int x = 5; 

        for (int i = x; i >= 1;  i--){
            
          
            for (int j = i; j <x; j++){
                System.out.print("  "); 
            }
    
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            
           
            System.out.println();
        }
    }
}