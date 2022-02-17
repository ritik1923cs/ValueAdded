import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while(t>0)
        { int n=scan.nextInt();
              int number_of_bits = 
               (int)(Math.floor(Math.log(n) /
                             Math.log(2))) + 1;
           System.out.println( (((1 << number_of_bits) - 1) ^ n)*n);
         --t;
        }
    }
}
