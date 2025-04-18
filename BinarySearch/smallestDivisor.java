package BinarySearch;

public class smallestDivisor {
    public static void main(String[] args) {
        int arr[]={1,2,5,9};
        int n= arr.length;
        int t=6;
        int d=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max= Math.max(max, arr[i]);
        }
        int lo=0,hi=max;
       
        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;
           
                int sum=0;
                for (int j=0;j<n;j++){
                    if (arr[j]%mid==0){
                        sum= sum +arr[j]/mid;
                    }
                    else {
                        sum+= arr[j]/mid+1;
                    }
                }
                if(sum<=t){
                  d=mid;
                  hi= mid-1;

                }
                else{
                    lo=mid+1;
                }
            }
            System.out.println(d);
        }

        }
    
    

