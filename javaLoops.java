import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            long x = a+b;
            String s = x+" ";
            long y = 1;
            for (int c = 0 ; c<n-1;c++){
                b=2*b;
                x=x+b;
                s=s+x+" ";
              
            }
            System.out.println(s);
        }
        in.close();
    }
}

