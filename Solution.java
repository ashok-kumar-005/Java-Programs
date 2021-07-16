import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
           int a = in.nextInt();
           int b = in.nextInt();
           int n = in.nextInt();
            int c = 1;
            int d = 0;
            int s,s1=0;
            int inc=2;
            s = (a+b*c); //5 +1 * 3
            System.out.println(s);
            s1=s;
            for(int j=1;j<n;j++) // 1 1<3
            {
                 //  0 2 10    s=2
              //  System.out.println(s); 

                for(int k=j;k-1>0;k--)  //k =1
                {
                    s1 = s1 + (inc*b); // inc = 2   2+ (2*2) 12 8  14
                    inc *= 2;
                    System.out.print(" "+s1);
                }            
                
            }
        }
        in.close();
        
    }
}