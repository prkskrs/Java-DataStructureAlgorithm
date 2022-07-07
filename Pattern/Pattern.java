public class Pattern {
    public static void main(String[] args) {
        // Solid Rectangle
        System.out.println("------Solid Rectangle------");
        int r=4;
        int c=5;
        for (int i = 1; i<=r; i++) {
            
            for (int j = 1; j <=c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Hollow Rectangle
        System.out.println("------Hollow Rectangle------");
        r=4;
        c=5;
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=c; j++) {
                if (i==1||j==1||i==r||j==c) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.println("------Half Pyramid------");
        
    }
}
