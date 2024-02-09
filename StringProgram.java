import java.util.Scanner;

public class StringProgram {
    public static void main(String[] args){
        System.out.println("Enter a string 1: ");
        Scanner input = new Scanner(System.in);

        String String1 = input.nextLine(); // to take  string input in java we use nextLine method
        
        System.out.println("Enter a string 2: ");
        String String2 = input.nextLine();
        

        if(String1.contains(String2)){
            System.out.println(String2+" is substring of "+String1);
        } else {
            System.out.println("not present");
        }

        input.close();


    }
}
