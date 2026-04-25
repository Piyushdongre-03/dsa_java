package Recursion;
import java.util.Scanner;
public class problem_1 {
    static void printname(int i , int n){
        if (i>n)
            return;
        System.out.println("Piyush");
        printname (i+1,n);
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = in.nextInt();
        printname(1,n);


    }


}
