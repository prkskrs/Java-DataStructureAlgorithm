import java.util.*;;
public class InsertionSort{
    static void insertionSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (nums[j]<nums[j-1]) {
                    swap(j, j-1, nums);
                }
                else{
                    break;
                }
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
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
        

    
}
