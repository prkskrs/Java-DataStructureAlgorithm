import java.util.*;
public class JavaExercise {
    public static double Average(Double a,Double b,Double c) {
        double avg=(a+b+c)/3;
        return avg;
    }

    public static int OddSum(int n) {
        int sumOdd=0;
        for (int i = 1; i < n; i++) {
            if (i%2!=0) {
                sumOdd=sumOdd+i;
            }
        }
        return sumOdd;
    }

    public static int CheckGreaterNum(int x, int y) {
        if (x==y) {
            System.out.println("Both are equal");
            return 0;
        } else if(x>y) {
            return x;
        }
        else{
            return y;
        }
        
    }

    public static double GetCircumFerence(Double r) {
        double circ=3.14*r*r;
        return circ;
    }
    public static void main(String[] args) {
        // Enter 3 numbers from the user & make a function to print their average.
        double a,b,c;
        Scanner sc=new Scanner(System.in);;
        System.out.print("Enter a,b,c: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double avg=Average(a, b, c);
        System.out.println("Average:"+avg);
        

        // Write a function to print the sum of all odd numbers from 1 to n.
        int n,sum;
        System.out.print("Enter Odd Number Limit: ");
        n=sc.nextInt();
        sum=OddSum(n);
        System.out.println("Odd Number Sum from 1 to "+n+": "+sum);

        // Write a function which takes in 2 numbers and returns the greater of those two.
        int x,y;
        System.out.print("Enter x,y: ");
        x=sc.nextInt();
        y=sc.nextInt();
        int res=CheckGreaterNum(x, y);
        if (res!=0) {
            System.out.println(res+" is the greatest number among them.");
        }
        
        // Write a function that takes in the radius as input and returns the circumference of a circle.
        double r;
        System.out.print("Enter Radius: ");
        r=sc.nextInt();
        double circ=GetCircumFerence(r);
        System.out.println("Circumference : "+circ);

        // Write an infinite loop using do while condition.

        int i=0;
        do {
            i++;
        } while (i>0);

        // Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        int pos=0,neg=0,zer=0,number;
        String choice;
        int j=0;
        do{
            System.out.print("'y' to exit and 'n' to continue: ");
            choice=sc.next();
            switch(choice) {
                case "n": System.out.print("Enter number: ");
                        number=sc.nextInt();
                        if(number>0){
                            pos++;
                        }
                        else if(number<0){
                            neg++;
                        }
                        else{
                            zer++;
                        }
                        break;

                case "y": System.out.println("\nTotal Positive Count: "+pos+"\n"+"Total Negative Count: "+neg+"\n"+"Total Zeros Count: "+zer+"\n");
                          j=1;
            }
        }while(j!=1);
       

        // Two numbers are entered by the user, s and t. Write a function to find the value of one number raised to the power of another i.e. s^t.
        int s,t;
        System.out.print("enter s:");
        s=sc.nextInt();
        System.out.print("enter t:");
        t=sc.nextInt();
        int result=1;
        for (int f = 1; f <= t; f++) {
            result=result*s;
        }
        System.out.println("s^t : "+result);


        // Write a program to print Fibonacci series of n terms where n is input by user :
        // 0 1 1 2 3 5 8 13 21 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

        int k,p=0,q=1,add=0;
        System.out.print("enter k: ");
        k=sc.nextInt();
        if(k==1){
            System.out.println(p);
        }
        else if(k==2){
            System.out.println(p+"\t"+q);
        }
        else if(k>2)
        {
            System.out.print(p+"\t"+q);
            for (int h = 0; h < k-2; h++) {
                add=p+q;
                System.out.print("\t"+add);
                p=q;
                q=add;
            }
        }
        else{
            System.out.println("invalid 'k' choice");
        }

        // Write a function that calculates the Greatest Common Divisor of 2 numbers.
        int p1,q1,gcd=0;
        System.out.print("Enter p1: ");
        p1=sc.nextInt();
        System.out.print("Enter q1: ");
        q1=sc.nextInt();
        for (int z = 2; z <=p1 && z<=q1 ; z++) {
                if(p1%z==0 && q1%z==0){
                    gcd=z;
                }
            }
        System.out.println("GCD of "+p1+" and "+q1+" = "+gcd);
        }
        

    }
    
