import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int testcases=scan.nextInt();
        while(testcases>0)
        {
            int n=scan.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=scan.nextInt();
            }
            int count=1;
            
            int last=Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++)
            {
                int diff=arr[i];
                diff=diff-arr[i+1];
                 diff=Math.abs(diff);
                if(last==Integer.MAX_VALUE)
                {
                    last=diff;
                   
                }
                else
                {
                    if(Math.abs(last-diff)==1)
                    {
                        last=diff;
                         continue;
                    }
                    else{
                        count=0;
                        break;
                    }
                }
            }
           
            if(count==1)
            {
                System.out.println("Correct Formation");
            }
            else
            {
                System.out.println("Incorrect Formation");
            }
            --testcases;
        }
    }
}
