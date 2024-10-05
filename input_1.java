import java.util.Scanner;



class user_Input{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scn.nextLine();
        System.out.println("Enter your age: ");
        int age = scn.nextInt();

        System.out.println("Enter your height: ");
        double height = scn.nextDouble();
        scn.nextLine();

        System.out.println("Enter your nickname: ");
        String nickname = scn.nextLine();


        System.out.println("you are:"+name);
        System.out.println("you are age:"+age);
        System.out.println("you are height:"+height);
        System.out.println("you are nickname:"+nickname);
    }
}