import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/* Your class should be named Main
		 * Read input as specified in the question.
		 * Print output as specified in the question.
		*/
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=sc.nextInt();
      
      int temp=1<<i;
      
      temp--;
      
      System.out.println(n&temp);
      
	}
}
