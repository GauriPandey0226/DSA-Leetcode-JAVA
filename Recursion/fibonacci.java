package Recursion;

import java.util.Scanner;

public class fibonacci { 
    public static int fibonacci(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        int fp=fibonacci(n-1);
        int sp=fibonacci(n-2);
        return fp+sp;
    }

    public static int Stair(int n){
        if (n<=2) return n;
        
        int fp=Stair(n-1);
        int sp=Stair(n-2);
        return fp+sp;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter");
        int n=sc.nextInt();
        int ans= Stair(n);
        System.out.println(ans);
    }
    
}
