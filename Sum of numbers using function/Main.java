import java.util.Scanner;
class Main{
	public static int sum_no (int n)
    {
      int sum=0;
	  for(int i=1;i<=n;i++)
      {
       sum=sum+i;
      }
        return sum;
     
	
    }

  public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
         int n = in.nextInt();
    int sum=sum_no(n);
      System.out.println(sum);
  }
}
