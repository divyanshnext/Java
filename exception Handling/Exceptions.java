// import java.util.*;
// public class Exceptions {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
// try{
//         String name = sc.nextLine();
//         String transType = sc.nextLine();
//         int amount = sc.nextInt();

//         if(transType.equals("D")){
//             System.out.println(name+amount+"deposit is succces");
//         }
//         else if(transType.equals("W"){
//             System.out.println(name+amount+"deposit siccess");
//         })

// } catch(Exception e){
//     System.out.println("Invalid amout");
// }



//     }
// }


import java.util.*;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String name = sc.nextLine();
            String transType = sc.nextLine();
            int amount = sc.nextInt();

            if (transType.equals("D")) {
                System.out.println(name + amount + " deposit is success");
            } else if (transType.equals("W")) {
                System.out.println(name + amount + " withdraw is success");
            } else {
                System.out.println("Invalid transaction type");
            }
        } catch (Throwable e) {
            System.out.println("Invalid amount");
        }
    }
}
