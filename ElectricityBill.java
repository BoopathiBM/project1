import java.util.Scanner;

public class ElectricityBill {

    private int noOfUnits;
    private boolean isCommercial;
    private double billAmount;

    public static void main(String[] args) {
        ElectricityBill electricitybill = new ElectricityBill();
        electricitybill.readInput();
        electricitybill.calculateBill();
        electricitybill.printBill();
    }

    private void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the unit: ");
        this.noOfUnits = scanner.nextInt();
        System.out.println("mention that commercial or not ");
        System.out.print("enter true / false :   ");
        this.isCommercial = scanner.nextBoolean();
        scanner.close();
    }

    public void calculateBill() {
        if (isCommercial) {
            this.billAmount = this.commercialBill();
        } else {
            this.billAmount = this.retailBill();
        }
    }

    public void printBill() {

        System.out.println("****************************************");
        System.out.println("No of units consumed  : " + this.noOfUnits);
        System.out.println("Is Commercial         : " + this.isCommercial);
        System.out.println("Total Bill Amount     : " + this.billAmount);
        System.out.println("****************************************");

    }

    public double commercialBill() {
        double commercialbill = retailBill() * (int) 1.5;
        return commercialbill;
    }

    public int retailBill() {
        int bill = 0;
        int unit = this.noOfUnits;
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