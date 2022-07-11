
public class binary_search {
    public static int binarySearch(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        if(nums.length==0){
            return -1;
        }
        else{
            while(start<=end){
                int mid=(start+end)/2;
                if(target>nums[mid]){
                    start=mid+1;
                }
                else if(target<nums[mid]){
                    end=mid-1;
                }
                else if(target==nums[mid]){
                    return mid;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums={1,1,2,8,9,10,13,15,65};
        int target=8;
        int element=binarySearch(nums, target);
        if (element!=-1 && nums[element]==target  ) {
            System.out.println("'"+target+"'"+" found at index "+element);
        }
        else{
            System.out.println("not found!!");
        }
    }
}
