/*
 * 1. Electricity Bill Calculator
=============================
Create a program to calculate the electricity bill based on the following slab rates:
	•	₹5 per unit for the first 100 units
	•	₹7 per unit for the next 100 units
	•	₹10 per unit for units above 200

Example:
	•	Input: Units = 250
	•	Output: Bill = ₹1750

    Additional Complexities:
	1.	Commercial or Residential Multiplier:
If the electricity consumption is for commercial purposes, the total bill is increased by 50% to account for higher rates for businesses. 
Users should indicate whether the usage is residential or commercial.
	2.	Fixed Charges:
A base fixed charge of ₹100 is added to all bills for maintenance costs.
	3.	Eco-Friendly Discount:
If the total units consumed are 150 or less, a 10% discount is applied to encourage energy conservation.
	4.	Late Payment Fee:
If the payment is overdue, a penalty of ₹150 is added.
Example:

Input:

	•	Units = 250
	•	Commercial = Yes
	•	Payment Overdue = Yes
	•	Eco-Friendly Discount = No

Output:

	•	Bill = ₹4025
 */




import java.util.Scanner;

public class ElectricityBill {

    private int noOfUnits;
    private boolean isCommercial;
    private double billAmount;
    private boolean latePayment;

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
        System.out.println("is overdue (true / false)");
        this.latePayment = scanner.nextBoolean();
        scanner.close();
    }

    public void calculateBill() {
        if (isCommercial) {
            this.billAmount = this.commercialBill();
        } else {
            this.billAmount = this.retailBill();
        }
        this.addFixedCharges();
        if (this.noOfUnits <= 150) {
            this.ecoFriendlyDiscount();
        }
        if (latePayment) {
            this.billAmount += 150;
        }
    }

    public void addFixedCharges() {
        int maintanance = 100;
        this.billAmount += maintanance;

    }

    public void ecoFriendlyDiscount() {
        double discount = this.billAmount * 0.1;
        this.billAmount = this.billAmount - discount;
    }

    public void printBill() {

        System.out.println("************* Electricity Bill *************************");
        System.out.println("No of units consumed  : " + this.noOfUnits);
        System.out.println("Is Commercial         : " + this.isCommercial);
        System.out.println("is Late Payment       : " + this.latePayment);
        System.out.println("Total Bill Amount     : " + this.billAmount);
        System.out.println("********************************************************");

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