/* Calculate Cricket Strike Rate
==============================
Write a Java program to calculate the strike rate of a batsman given the runs scored and balls faced.
Example:
	•	Input: Runs = 60, Balls = 30
	•	Output: Strike Rate = 200.0

*/

import java.util.Scanner;

public class CricketStrickRate{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number of balls: ");
        int balls = scanner.nextInt();
        System.out.print("enter Runs: ");
        int runs = scanner.nextInt();
        float strickrate = (float) runs / balls * 100;
        System.out.println("strickRate = "+ strickrate);


    }
}