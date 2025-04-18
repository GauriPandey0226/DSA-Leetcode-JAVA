package BinarySearch;

public class searchRotatedarray {
   public static void main(String[] args) 
    {
        int arr[]={4,5,0,1,2,3};
        int n= arr.length;
        int target=6;
        int k=-1;
        int lo=0,hi=n-1;
        int idx=-1;

        //  Another way is by finding the sorted half : Striver's method best method 33

        // while(lo<=hi){
        //     int mid= (lo+hi)/2;

        //     if (arr[mid]==target){
        //         idx=mid;
        //         break;
        //     }
        //     //  For left half sorted
        //     else   if (arr[lo]<=arr[mid]){
        //         if (arr[lo]<=target && target <= arr[mid]){
        //             hi=mid-1;
        //                 }
        //                 else {
        //                     lo=mid+1;
        //                 }
        //             }
        //     //  one half sorted is guarantee
        //     //  for right half sorted
        //     else{
        //         if (arr[mid]<=target && target <= arr[hi]){
                   
        //             lo=mid+1; 
        //                 }
        //                 else {
        //                     hi=mid-1;
        //                 }
        //     }

        // }
        // return -1;

        //    rotated array 2 : 81
        // class Solution {
        //     public boolean search(int[] arr, int target) {
        //         int n = arr.length;
        //         if (n == 0) return false;
        
        //         // Step 1: Find the pivot (index of smallest element)
        //         int lo = 0, hi = n - 1;
        //         while (lo < hi) {
        //             int mid = lo + (hi - lo) / 2;
        //             if (arr[mid] > arr[hi]) {
        //                 lo = mid + 1;  // Pivot is in the right half
        //             } else {
        //                 hi = mid;  // Pivot is in the left half
        //             }
        //         }
        //         int pivot = lo;
        
        //         // Step 2: Binary search in the correct half
        //         lo = 0; hi = n - 1;
        //         if (target >= arr[pivot] && target <= arr[n - 1]) {
        //             lo = pivot;  // Search in the right sorted half
        //         } else {
        //             hi = pivot - 1;  // Search in the left sorted half
        //         }
        
        //         while (lo <= hi) {
        //             int mid = lo + (hi - lo) / 2;
        //             if (arr[mid] == target) return true;
        //             if (arr[mid] < target) lo = mid + 1;
        //             else hi = mid - 1;
        //         }
        
        //         return false;
        //     }
        // }
        

        // By finding the pivot element : time limit exceeded


        while(lo<=hi){
            int mid= (lo+hi)/2;

            if(arr[mid]>arr[mid-1]  &&  arr[mid]>arr[mid+1]){
               k=mid;
               break;
            }
            else  if(arr[mid]<arr[mid-1]  &&  arr[mid]<arr[mid+1]){
                k=mid-1;
                break;
             }
           else  if(arr[mid]>arr[mid-1]  &&  arr[mid]<arr[mid+1]){
                lo=  mid+1;
            }
            else  if(arr[mid]<arr[mid-1]  &&  arr[mid]>arr[mid+1]){
                hi= mid-1;;
            }
        }


        boolean flag=false;
         if(target> arr[0]){
            lo=0;hi=k;
            while(lo<=hi){
                int mid= (lo+hi)/2;

                if(arr[mid]>target){
                    hi= mid-1;
                }
                else if(arr[mid]<target){
                    lo= mid+1;
                }
                else {
                    flag=true;
                    idx=mid;
                    break;
                }

            }
         }
         else {
            lo=k;hi=n-1;
            while(lo<=hi){
                int mid= (lo+hi)/2;

                if(arr[mid]>target){
                    hi= mid-1;
                }
                else if(arr[mid]<target){
                    lo= mid+1;
                }
                else {
                    idx=mid;
                    break;
                }

            }
         }
         if (flag){
            System.out.println(" the element ifs found at index: "+ idx + " and it is "+ arr[idx]);
        }
        else{
            System.out.println(" element not found");
        }

         
    }
    
}
