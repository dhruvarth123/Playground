import java.util.Scanner;
class Main{
	public static int square(int n)
    {
      int num=n*n;
      return num;
    }
  public static void main(String args[])
  { 
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int num=square(n);
    System.out.println(num);
	    
   
	}
}