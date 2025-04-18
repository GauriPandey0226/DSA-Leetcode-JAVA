package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class generateParanthesis {
    static ArrayList<String> arr;

    public static void printParenthesis(int open,int close,int n,String ans) {
        if (ans.length()==2*n){
            arr.add(ans);
            return ;
        }
      if( open<n){        
               printParenthesis(open +1, close, n, ans+'(');
               }

      if(open>close){        
        printParenthesis(open, close +1, n, ans+')');
       }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the value of n");
        int n =sc.nextInt();
       arr= new ArrayList<>();
        printParenthesis(0, 0, n, "");
        System.out.println(arr);
    }
    
}
