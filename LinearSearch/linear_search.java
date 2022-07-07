public class linear_search {
    public static int linearSearch(int[] nums, int target){
        if(nums.length==0){
            return -1;
        }
        else{
            for (int i = 0; i < nums.length; i++) {
                int element=nums[i];
                if (element==target) {
                    return element;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] nums={213,3245,657,867,989,453,756,89,999};
        int target=989;
        int element=linearSearch(nums, target);
        if (element==target) {
            System.out.println("'"+target+"'"+" found!!");
        }
        else{
            System.out.println("not found!!");
        }
    }
}
