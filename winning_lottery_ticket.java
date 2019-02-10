import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the winningLotteryTicket function below.
    static long winningLotteryTicket(String[] tickets) {
        
        int n=tickets.length;
        long count=0;
        int arr[]=new int[1024];
        for(int i=0;i<n;i++)
        {
            String x=tickets[i];
            int size=x.length();
            int ans=0;
            int a[]=new int[10];
            for(int j=0;j<size;j++)
            {
                a[(int)x.charAt(j)-48]=1;
            }
            for(int j=9;j>=0;j--)
            {
                if(a[j]==1)
                ans+=(int)Math.pow(2,9-j);
            }
            arr[ans]++;
        }
        if(arr[1023] > 0)
        {
            count = (long)arr[1023]*(arr[1023] - 1)/2;
        }
        for(int i=0;i<1023;i++)
        {
            int num=arr[i];
            if(num!=0)
            {
               for(int j=i+1;j<1024;j++)
                {
                  
                    int n2=arr[j];
                    if(n2!=0)
                    {
                        if((i|j) == 1023)
                        {
                            count+=(long)num*n2;  
                        }

                    }

                } 
            }
            
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] tickets = new String[n];

        for (int i = 0; i < n; i++) {
            String ticketsItem = scanner.nextLine();
            tickets[i] = ticketsItem;
        }

        long result = winningLotteryTicket(tickets);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
