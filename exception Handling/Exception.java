public class Exception {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        }

// uncomment one by one catch block and run to see the output

        // catch(ArithmeticException e){
        //     e.printStackTrace();
        // }

        // catch(ArithmeticException e){
        //     System.out.println(e.toString());
        // }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
}
