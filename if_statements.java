import java.util.Scanner;

public class if_statements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of age: ");
        int age = sc.nextInt();


        if(age==70){
            System.out.println("okay boomer:");


        }

        else if(age>=18){
            System.out.println("okay adult");

        } else if (age>=13) {
            System.out.println("okay teenager");

        }
        else {
            System.out.println("you are still child");
        }

    }
}