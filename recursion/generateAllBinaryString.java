// this is very good question to learn recursion

import java.util.*;
import java.lang.*;

// approach 1 

// public class generateAllBinaryString {

//     public static String toString(char[] a){
//         String string = new String(a);
//         return string;
//     }

//     static void generate(int k,char[] ch,int n){
//         if(n == k){
//             System.out.print(toString(ch)+" ");
//             return;
//         }

//         if(ch[n-1] == '0'){
//             ch[n] = '0';
//             generate(k,ch,n+1);
//             ch[n] = '1';
//             generate(k,ch,n+1);
//         }

//         if(ch[n-1] == '1'){
//             ch[n] = '0';
//             generate(k,ch,n+1);
//         }
//     }

//     static void fun(int k){
//         if(k<= 0){
//             return;
//         }

//         char[] ch = new char[k];

//         ch[0] = '0';

//         generate(k,ch,1);

//         ch[0] = '1';
//         generate(k,ch,1);
//     }
//     public static void main(String[] args){
//         int k = 2;
//         fun(k);
//     }
// }




// approach 2

// public class generateAllBinaryString{

//     static void All_Binary_Strings(int arr[],int num,int r){

//     if(r == num)
//     {
//         for(int i = 0; i < num; i++)
//             System.out.print(arr[i]);
//             System.out.print(" ");
        
//         return;
//     }
//     else if(arr[r-1] == 1)
//     {
//         arr[r] = 0;
//         All_Binary_Strings(arr,num,r+1);
//     }
//     else
//     {
//         arr[r] = 0;
//         All_Binary_Strings(arr,num,r+1);
//         arr[r] = 1;
//         All_Binary_Strings(arr,num,r+1);
//     }
// }

// static void print(int a[],int num)
// {
//     a[0] = 0;
//     All_Binary_Strings(a,num,1);
//     a[0] = 1;
//     All_Binary_Strings(a,num,1);
// }

// // Driver code
// public static void main(String args[])
// {
//     int n = 2;
//     int a[] = new int[n];
//     print(a,n);
// }
// }




// approach 3
public class generateAllBinaryString{

    static void All_Binary_Strings(String str, int num){
        int len = str.length();
        if(len == num){
            System.out.println(str + " ");
            return;
        }
        else if(str.charAt(len - 1) == '1'){
            All_Binary_Strings(str+'0',num);
        }
        else{
            All_Binary_Strings(str+'0',num);
            All_Binary_Strings(str+'1',num);
        }
    }

    static void print(int num){
        String word = "";
        word+='0';
        All_Binary_Strings(word,num);
        word+='1';
        All_Binary_Strings(word,num);
    }

    public static void main(String[] args) {
        int n = 4;
        print(n);
    }
}