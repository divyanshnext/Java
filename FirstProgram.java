import java.util.Scanner;
public class FirstProgram{
    public static void main(String[] args){
        System.out.println("jai shree ram this is my first java code in vscode ");
        System.out.println("Enter a number :");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("you entered :"+name);


        scanner.close();
    }
}