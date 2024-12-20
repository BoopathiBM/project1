import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter integer 1: ");
        int a = scanner.nextInt();
        System.out.println("enter integer 2: ");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println("sum of two intergers: "+ c);

    }
}