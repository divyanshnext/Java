import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        n=sc.nextInt();

        int[] array = new int[10];
        System.out.println("enter elemebgt");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements");
        
    }
}
