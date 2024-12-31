import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the unit: ");
        int unit = scanner.nextInt();
        ElectricityBill electricitybill = new ElectricityBill();
        int bill = electricitybill.calculateBill(unit);
        System.out.println("bill amount for " + unit + " unit is: " + bill);
        bill = electricitybill.calBill(unit);
        System.out.println(" method 2 bill amount for " + unit + " unit is: " + bill);

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

    public int calBill(int unit) {
        int bill = 0;
        for (int i = 1; i <= unit; i++) {
            if (i <= 100) {
                bill += 5;
            }
            if (i > 100 && i <= 200) {
                bill += 7;
            }
            if (i > 200) {
                bill += 10;
            }
        }
        return bill;

    }
}