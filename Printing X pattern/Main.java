import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Get the n value
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
 
	    for(int row = 1; row <= n; ++row)
	    {
             // Handle stars for each row
	         for(int col = 1; col <= n; ++col)
	         {
                
	                
	                if((row == col) ||
	                  (row + col == n + 1))
	                {
	                    System.out.print("*");
	                }
                    
	                else
	                {
	                    System.out.print(" ");
	                }
	         }
	         System.out.println();
	    }
	}
}