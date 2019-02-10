import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		/* Your class should be named Main
		 * Read input as specified in the question.
		 * Print output as specified in the question.
		*/
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      if((n&(n-1))!=0)
      {
        System.out.println("false");
      }
      
      else
      {
        int count=0;
        while(n>1)
        {
          n=n>>1;
          count++;
          
        }
        
        if((count&1)==0)
        {
          System.out.println("true");
        }
        
        else
        {
          System.out.println("false");
        }
      }
      
	}
}
