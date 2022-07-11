public class searchIn2DArray {
    static int search2d(int[][] nums,int target){
        if(nums.length==0){
            return -1;
        }
        else{
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if(nums[i][j]==target){
                        return nums[i][j];
                    }  
                }

            }
           
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] nums={{213,325},{657,867},{989,453,756,89,999}};
        int target=65;
        int element=search2d(nums, target);
        System.out.println(element);
        if (element==target) {
            System.out.println("'"+target+"'"+" found!!");
        }
        else{
            System.out.println("not found!!");
        }
    }
}
