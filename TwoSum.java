//Two sum. 

import java.util.Scanner;
class TwoSum{
    public int[] twosum_func(int[] nums,int target){

        int n=nums.length;
    
        return new int[]{};
    }

    
    public static void main(String args[]){

        //Enter size of array.
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=obj.nextInt();

        int nums[]=new int[size];
        int n=nums.length;
        
        //Enter numbers in array.
        for(int i=0;i<n;i++){
            System.out.print("Enter numbers for array: ");
            nums[i]=obj.nextInt();
        }

        //Enter target.
        System.out.print("Enter a target: ");
        int target=obj.nextInt();

        TwoSum obj2=new TwoSum();
        obj2.twosum_func(nums,target);
       

    }
}