import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int testcases=scan.nextInt();
        for(int i=0;i<testcases;i++)
        {
            int n=scan.nextInt();
            int[][] arr=new int[n][n];
            long res=0;
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    long x;
                    x=scan.nextLong();
                    if(j==0||k==0||j==n-1||k==n-1||k==j||k+j==n-1)
                    {
                        res=res+x;
                    }
                }
            }
            
           System.out.println(res);
        }
    }
}
