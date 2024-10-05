import java.util.Scanner;

public class Swap_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
        int num2 = sc.nextInt();

         int temp=num1;
        num1=num2;
        num2=temp;
        sc.close();

        System.out.println("After swap those two Numbers: ");
        System.out.println(num1+","+num2);


    }
}