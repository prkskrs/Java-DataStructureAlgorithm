public class OrderAgnosticBinarySearch {
    public static int OrderAgnostic(int[] nums, int target){

        int start=0;
        int end=nums.length-1;
        if(nums.length==0){
            return -1;
        }

        else if(nums[start]<nums[end])
        {
            System.out.println("------Array is in ascending Order------");
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

        else{
            System.out.println("------Array is in descending Order------");
            while(start<=end){
                int mid=(start+end)/2;
                if(target<nums[mid]){
                    start=mid+1;
                }
                else if(target>nums[mid]){
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
        int[] nums1={67,32,23,11,10,9,8,6};
        int[] nums2={1,8,33,44,55,66,88,99,100};
        int target=8;
        int element=OrderAgnostic(nums1, target);  // check replacing nums1 with nums2 for ascending order
        if (element!=-1 && nums1[element]==target  ) {
            System.out.println("'"+target+"'"+" found at index "+element);
        }
        else{
            System.out.println("not found!!");
        }
    }

    
    
}
