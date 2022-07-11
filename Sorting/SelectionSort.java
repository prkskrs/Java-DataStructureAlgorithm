import java.util.*;;
public class SelectionSort {
    static void selectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last=nums.length-i-1;  //last index till unsorted
            int maxIndex=maxElementIndex(nums,0,last);
            swap(maxIndex, last, nums);
           // System.out.println(Arrays.toString(nums));
        }
    }

    static int maxElementIndex(int[] nums,int startIndex,int lastIndex){
        int maxIndex=0;
        int element=nums[startIndex];
        for (int i = 0; i<=lastIndex; i++) {
            if(nums[i]>element){
                element=nums[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    static void swap(int i ,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int[] nums={4,2343,2455,14,56,8,879,0705,1,2,3};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
        

    
}
