package Recursion;

 import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in );
        System.out.println(" Enter the no");
        int n= sc.nextInt();
        long ans=0;
         long lo=0;
         long hi=n;
       
         while (lo<=hi){
             
            long mid= lo +(hi-lo)/2;
             if (mid*mid==n){  // for not using long we can write (mid=x/mid)
               ans=mid;
               break;
             }
             if (mid*mid<n){
                lo=mid+1;
              }
              if (mid*mid>n){
                hi=mid-1;
              }
         }
         System.out.println(" ans="+ ans);
    }
    
}
