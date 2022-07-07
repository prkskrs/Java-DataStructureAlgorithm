import java.util.*;
public class Array_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row and Column: ");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] Matrix=new int[row][column];

        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }


        //search
        System.out.print("Enter Value To Search");
        int search=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(search==Matrix[i][j]){
                    System.out.print("(r,c):"+"("+i+","+j+")");
                    break;
                }
            }
            System.out.println();
        }

    }
}
