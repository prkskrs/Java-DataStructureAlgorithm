public class MinimumNumber {

    static int minNum(int[] nums){
        if(nums.length==0){
            return -1;
        }
        else{
            int min=nums[0];
            for (int i = 0; i <nums.length; i++) {
                if(min>nums[i]){
                    min=nums[i];
                }
            }
            return min;
        }
}

    public static void main(String[] args) {
        int[] nums={11,3,4,77,1,1000,57,8};
        int melement=minNum(nums);
        System.out.println("minimum element : "+melement);
    }

}
