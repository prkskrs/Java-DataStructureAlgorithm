import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] nums){
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped=false;
            for (int j = 0; j <nums.length-1-i; j++) {
                if(nums[j+1]<nums[j]){
                    swap(j,j+1,nums);
                    swapped=true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }

    static void swap(int i ,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int[] nums={4,2343,2455,14,56,8,879,0705,1,2,3};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
        

    
}
