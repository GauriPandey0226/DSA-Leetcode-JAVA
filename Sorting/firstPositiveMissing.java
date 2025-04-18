package Sorting;

public class firstPositiveMissing {
    public static void swap(int[] nums, int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
    public static int findPositiveMissing(int nums[]) {
       int n= nums.length;
       int i=0;
       while(i<n){
        int ele= nums[i];
        if(nums[i]<=0 ||  nums[i]>n ||nums[i]==nums[ele-1]  || nums[i]==i+1) i++;
        else {
            swap(nums,i,ele-1);
        }
       }
       for(int j=0;j<n;j++){
        if(nums[j]!=j+1){
            return j+1;
          
        }
       }
        return i+1;
    }

    
}
