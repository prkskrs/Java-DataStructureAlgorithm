public class SearchInRange {

    static int search(int[] nums,int target,int start,int end){
        if(nums.length==0){
            return -1;
        }
        else{
            for (int i = start; i <=end; i++) {
                int element=nums[i];
                if(element==target){
                    return element;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,3,4,77,89,2,57,8};
        int target=2;
        int startIndex=0;
        int endIndex=6;
        int element=search(nums, target, startIndex, endIndex);
        if(element==target){
            System.out.println("'"+element+"' "+"found in given range ("+startIndex+","+endIndex+")");
        }
        else{
            System.out.println("not found in range ("+startIndex+","+endIndex+")");
        }
    }

}
