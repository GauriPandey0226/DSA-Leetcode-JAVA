package BinarySearch;

public class shipMinCapc {

    public static boolean isPossible(int c, int arr[],int d){
        int n= arr.length;
        int load=0;
        int days=1;
        for (int i=0;i<n;i++){
            if (load+arr[i]<= c){
               load+=arr[i];
            }
            else{
                days++;
                load=arr[i];
            }
        }
         if(days>d){
            return false;
         }
         else{
            return true;
         }
    }
    public static void main(String[] args) {
        int arr[]={3,2,2,4,1,4};
        int d=3;
        int n= arr.length;
        int maxw=0;
        int minw=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            maxw=maxw+ arr[i];
           minw= Math.max(arr[i], minw);
        }
         int minC=0;
        int lo=minw, hi=maxw;
        while( lo<=hi){
         int mid= lo+(hi-lo)/2;

         if(isPossible(mid,arr,d)==true){
            minC=mid;
           hi=mid-1;
         }
         else{
            lo=mid+1;
         }
         }
         System.out.println(minC);
        }
    }
    

