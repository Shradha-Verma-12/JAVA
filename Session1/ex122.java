import java.util.Scanner;

class ex122
 {
    public static void main ( String args[])
    {
        Scanner abc = new Scanner(System.in);
        System.out.println("Thank you for visiting us. What is your name?");
        String name = abc.nextLine();
        System.out.println("Welcome,"+ name);
    }
}
