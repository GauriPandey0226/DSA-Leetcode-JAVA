package Sorting;
import java.util.ArrayList;

import java.util.List;

public class findDisappearele {
    public static void swap(int[] nums, int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }

  ArrayList<Integer> ans = new ArrayList<>();

  public List<Integer> findDisappearedNumbers(int[] nums) {
    int n= nums.length;
       int i=0;
       while(i<n){
        int ele=nums[i];
        if(nums[i]==i+1 || nums[i]==nums[ele-1]){
          i++;
        } 
        else {
          swap(nums,i,ele-1);
        }
       }
       for(int j=0;j<n;j++){
        if(nums[j]!=j+1){
    ans.add(j+1);
        }
       }
       return ans; 
    }
}
    

