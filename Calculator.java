import java.util.Scanner;


public class Calculator{
    
    private int add( int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter integer 1: ");
        int a = scanner.nextInt();
        System.out.println("enter integer 2: ");
        int b = scanner.nextInt();
        // int c = a+b;
        // System.out.println("sum of two intergers: "+ c);
        Calculator c1 = new Calculator();
        
        int result = c1.add(a,b);
        System.out.println("sum of two integers: " + result);
        


    }
}