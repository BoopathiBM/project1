import java.util.Scanner;

public class ElectricityBill{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the unit: ");
        int unit = scanner.nextInt();
        CalculateBill(unit);
    }
    public static void CalculateBill(int unit){
        int bill = 0;
        for(int i=1;i<=unit;i++){
            if(i<=100){
                bill += 5;
            }
            if(i>100 && i<= 200){
                bill +=7;
            }
            if(i>200){
                bill +=10;
            }
        }
        System.out.println("bill amount for "+ unit + " unit is: "+ bill);
    }
}