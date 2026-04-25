import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = in.nextInt();
        System.out.print("Enter b:");
        int b = in.nextInt();
        System.out.println("original value of a :"+a);
        System.out.println("original value of b :"+b);
        int c = a;
        a=b;
        b=c;
        System.out.println("The  swaped value of a:"+a);
        System.out.println("The  swaped value of b:"+b);

    }
}
