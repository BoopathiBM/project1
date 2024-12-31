import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the unit: ");
        int unit = scanner.nextInt();
        ElectricityBill electricitybill = new ElectricityBill();
        int bill = electricitybill.calculateBill(unit);
        System.out.println("mention that commercial or not ");
        System.out.print("enter true / false :   ");
        boolean answer = scanner.nextBoolean();
        if(answer){
            bill *= 1.5;
            System.out.println("bill amount for " + unit + " unit is: " + bill);
        }
        else{
            System.out.println("bill amount for " + unit + " unit is: " + bill);
        }
        scanner.close();
    }


    public int calculateBill(int unit) {
        int bill = 0;
        if (unit <= 0) {
            bill = 0;
        } else if (unit <= 100) {
            bill = unit * 5;

        } else if (unit <= 200) {
            bill = 500 + ((unit - 100) * 7);
        } else {
            bill = 1200 + ((unit - 200) * 10);
        }

        return bill;

    }
    
}