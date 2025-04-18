package Sorting;

public class quickSelect {
    public static void print(int arr[]) {
        for (int i=0;i<arr.length;i++){
         System.out.print(arr[i]+"  ");
        }
        System.out.println();
     }
    public static int partition(int []arr,int l,int h) {
        int pivot=arr[l];     // mid= (l+h)/2
        // int pivot=arr[mid];  // pivot=arr[l] or arr[h] also works
      int sc=0;
        for (int i=l+1;i<=h;i++){
            // if (arr[i]==mid) continue; 
            if(arr[i]<pivot) sc++;
        }
      int cidx=l+sc;
        int temp=arr[cidx];
        arr[cidx]=pivot;
        arr[l]=temp;
       int i=l,j=h;
       while(i<cidx&&j>cidx){
        if(arr[i]<pivot) i++;
        else if (arr[j]>pivot) j--;
        else {
            int temp1=arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
            i++;
            j--;
        }
       }
            
        
        return cidx;

    }
    public static int quickSelect(int []arr,int l,int h,int k) {
        if (l<h){
            int pivot=partition(arr, l, h);
            if (pivot==k-1) return  arr[pivot];
            else if(pivot>k-1) return quickSelect(arr, l, pivot-1,k);
            else return quickSelect(arr, pivot+1, h,k);
            
        }
        return arr[l];
    }
    public static void main(String[] args) {
        int arr[]={20,12,8,10,5,24,36};
        print(arr);
        int ans=quickSelect(arr,0,arr.length-1,3);
        System.out.println("The 3rd smallest element is: "+ans);
        print(arr);
    }
}
