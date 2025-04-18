package Sorting;//Leetcode 287

public class Duplicate {
    public static void swap(int[] nums, int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
    public static int findDuplicate(int[] nums) {
        while(true){
        int ele= nums[0];
        if (nums[ele]==nums[0]) return ele;
        swap(nums,0,ele);
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,18,9,10,11,12,13,14,15,16,17,18,19,20};
        int ans=findDuplicate(nums);
        System.out.println("The duplicate element is: "+ans);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"  ");
        }
        System.out.println();
    }
}
