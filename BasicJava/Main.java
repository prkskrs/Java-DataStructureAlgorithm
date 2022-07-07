import java.util.*;
public class Main{
    // Function For Addition
    public static int Addition(int a,int b) {
        int sum=a+b;
        return sum;
    }

    // Function For Multiplication
    public static int Multiplication(int a,int b) {
        int product=a*b;
        return product;
    }

    // Function For Factorial
    public static int Factorial(int f) {
        int fact=1;
        if(f>=1){
            for (int i = 1; i <=f; i++) {
                fact=fact*i;
            }
        }
        else{
            fact=1;
        }
        
        return fact;
    }

    // Main Function
    public static void main(String[] args) {
        // Output
        System.out.println("\n---------Output---------");
        System.out.println("Hello World"); // ln for next line
        System.out.print("Hello");
        System.out.print(" World2\n"); // '\n' for next line
        System.out.println("Prakash\nSingh"); 

        // DataType And Variable
        // Primitive: int,float,double,char,boolean,byte,short,long
        // Non-Primitive: String,Array,class,Object,Interface
        int a=10;
        boolean b=false;
        double c=90.234;
        String d="I am string";
        System.out.println("\n---------Data Types---------");
        System.out.println("Integer -> "+a);
        System.out.println("Boolean -> "+b);
        System.out.println("Double -> "+c);
        System.out.println("String -> "+d);

        //Input 
        //Import package :  "import java.util.*;"
        //then make object of Scanner class; //As Shown Below

        System.out.println("\n---------Input---------");
        Scanner sc=new Scanner(System.in);

        // take input of strng using sc.next();
        // System.out.print("Enter your name only: ");
        // String name=sc.next();         // do not take string after space
        // System.out.println("Your name: "+name);

        // take input of strng using sc.nextLine();
        System.out.print("Enter your full name: ");
        String fullname=sc.nextLine();   // also take string after space
        System.out.println("Your Full Name: "+fullname);

        // take input of strng using sc.nextInt();
        System.out.print("Enter num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter num2: ");
        int num2=sc.nextInt();
        System.out.println("sum: "+(num1+num2));

        // same for float,double etc.
        // float f=sc.nextFloat()
        // double d=sc.nextDouble() and etc..

        System.out.println("\n---------Conditional Statements---------");
        int age=10;
        System.out.println("Given age = "+age);
        if (age>=18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

        // same "else if" as c++
        
        //switch-case
        System.out.println("Press Any Button From (1-3): ");
        int button=sc.nextInt();
        switch (button) {
            case 1:System.out.println("Hello");
                break;
            case 2:System.out.println("Namaste");
                break;
            case 3:System.out.println("Gor Chuke Gor Lagatani");
                break;
            default:System.out.println("Invalid Choice");
                break;
        }

        System.out.println("\n---------Loops---------");
        System.out.println("For Loop of Even Numbers");
        for (int i = 0; i <=10; i++) {
            if(i%2==0)
            {
                System.out.print(i+"\t");
            }
        }
        System.out.println();
        System.out.println("While Loop of ODD Numbers");
        int j=0;
        while(j<=11) {
            if(j%2!=0)
            {
                System.out.print(j+"\t");
            }
            j++;
        }

        System.out.println("\nDo While Loop for Sum of First 10 Natural Number");
        int k=1;
        int sum=0;
        do {
            sum=sum+k;
            k++;
        } while (k<=10);
        System.out.println("Sum : "+sum);

        System.out.println("\n---------Function And Methods---------");
        //Addition
        int n1=100,n2=999;
        int totalSum=Addition(n1, n2);
        System.out.println(n1+"+"+n2+"="+totalSum);
        
        // Product
        n1=10;
        n2=99;
        int product=Multiplication(n1, n2);
        System.out.println(n1+"*"+n2+"="+product);

        // Factorial
        System.out.println("Enter Value To Get Factorial: ");
        int f=sc.nextInt();
        int factValue=Factorial(f);
        System.out.println("Factorial of "+f+" is "+factValue);


    }
}