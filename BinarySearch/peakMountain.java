package BinarySearch;

public class peakMountain {
    public static void main(String[] args) {
        int arr[]={10,20,20,40,50,60,48,34,20};
        int n=arr.length;
        int low=1;
        int high=n-2;
        while(low<=high){

            int mid= (low+high)/2;
            if(arr[mid]>arr[mid-1]  &&  arr[mid]>arr[mid+1]){
                System.out.println(" the mid index: " + mid);
            }
           else  if(arr[mid]>arr[mid-1]  &&  arr[mid]<arr[mid+1]){
                low=  mid+1;
            }
            else  if(arr[mid]<arr[mid-1]  &&  arr[mid]>arr[mid+1]){
                high= mid-1;;
            }

        }
    }
    
}
