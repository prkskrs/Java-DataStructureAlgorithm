
public class char_search {
    public static int linearSearch(String nums, char target){
        if(nums.length()==0){
            return -1;
        }
        else{
            for (int i = 0; i < nums.length(); i++) {
                char element=target;
                if (element==nums.charAt(i)) {
                    return element;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        String nums="prakashzingh";
        char target='z';
        int element=linearSearch(nums, target);
        if (element==target) {
            System.out.println("'"+target+"'"+" found!!");
        }
        else{
            System.out.println("not found!!");
        }
    }
}
