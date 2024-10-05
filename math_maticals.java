import java.util.Scanner;
import java.lang.Math;

class math{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;


        System.out.println("Enter the side a:");
        a=sc.nextDouble();
        System.out.println("Enter the side b:");
        b=sc.nextDouble();


        c=Math.sqrt((a*a)+(b*b));
        System.out.println("The square root of "+a+" and "+b+" is "+c);
    }
}