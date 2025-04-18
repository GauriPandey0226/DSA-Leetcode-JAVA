package Recursion;

public class CountandSay {

    public static String countSay( int n){
        if (n==1){
            return "1";
        }
        String str= countSay(n-1)+"%";
        String ans="";
        int i = 0,j=0;
        while(j<str.length()){
            if (str.charAt(i)==str.charAt(j)) j++;
            else{
                int len =j-1;
                ans+=len;
            ans+=str.charAt(i);
          i=j;
            
            }   

        }
return ans;
    }
    public static void main(String[] args) {
        
    }
}