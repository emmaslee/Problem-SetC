
/**
 * Write a description of class FormulaDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class FormulaDriver
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();
        
        OrderedPair roots = Formulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for 1x^2 + 5x + 6 are " + roots);
        System.out.println();
        System.out.println("SLOPE FORMULA: Find the slope between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        OrderedPair p1 = new OrderedPair(x1, y1);
        OrderedPair p2 = new OrderedPair(x2, y2);
        double slope = Formulas.findSlope(p1,p2);
        System.out.println("A line between " + p1 + " and " + p2 
            + " has a slope of " + slope + ".");
        System.out.println();
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1)" 
            + " and (x2,y2)");
        System.out.print("x1: ");
        x1 = input.nextDouble();
        System.out.print("y1: ");
        y1 = input.nextDouble();
        System.out.print("x2: ");
        x2 = input.nextDouble();
        System.out.print("y2: ");
        y2 = input.nextDouble();
        p1 = new OrderedPair(x1, y1);
        p2 = new OrderedPair(x2, y2);
        System.out.println("The midpoint between " + p1 + " and " + p2 + " is "
            + Formulas.findMidpoint(p1,p2) + ".");
        System.out.println();
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int k = input.nextInt();
        System.out.print("Starts with: ");
        double a1 = input.nextDouble();
        System.out.print("Increases by: ");
        double d = input.nextDouble();;
        double sum = Formulas.findArithmeticSeriesSum(a1, d, k);
        System.out.println("The sum of the first " + k 
            + " terms of an arithmetic series that starts with " 
            + a1 + " and increases by " + d + " is " + sum + ".");
        System.out.println();
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        k = input.nextInt();
        System.out.print("Starts with: ");
        a1 = input.nextDouble();
        System.out.print("Rate of growth: ");
        double r = input.nextDouble();
        double sum2 = Formulas.findGeometricSeriesSum(a1, r, k);
        System.out.println("The sum of the first " + k + " terms of a finite" 
            + " geometric series that starts with " + a1 + " and increases"
            + " by a rate of " + r + " is " + sum2 + ".");
        System.out.println();
        System.out.println("DIE ROLLER");
        System.out.print("How Many Sides Does Your Die Have? ");
        int n = input.nextInt();
        System.out.println("Rolling a " + n + "-sided die... you got a " 
            + Formulas.rollDie(n) + "!");
    }
}
