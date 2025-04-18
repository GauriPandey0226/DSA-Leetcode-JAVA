package Sorting;

public class MissingNumber {
    public static void swap(int[] nums, int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
    public static int MissingNumber(int []nums) {
    int n=nums.length;
    for (int i=0; i<n; i++) {
        while (nums[i] != i && nums[i] < n) {
            swap(nums, i, nums[i]);
        }
    }
    
    for (int i=0; i<n; i++) {
        if (nums[i] != i) {
            return i;
        }
    }
    
    return n; 
    }
    
}
