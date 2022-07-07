import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size=sc.nextInt();
        int[] ArrayName=new int[size];

        //input
        for (int i = 0; i < size; i++) {
            ArrayName[i]=sc.nextInt();
        }

        //output
        for (int i = 0; i < size; i++) {
            System.out.print(ArrayName[i]+"\t");
        }
        System.out.println();

        //search
        System.out.print("Enter Value To Search");
        int search=sc.nextInt();
        for (int i = 0; i < size; i++) {
            if(search==ArrayName[i]){
                System.out.println(i+"\t");
                break;
            }
        }
    }
    
}
