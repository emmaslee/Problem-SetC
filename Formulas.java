
/**
 * Write a description of class Formulas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formulas{
    
    public static OrderedPair findQuadraticRoots (double a, double b, double c) {
        double answer1 = ((-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a);
        double answer2 = ((-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a);
        OrderedPair answer = new OrderedPair(answer1, answer2);
        return answer;
    }
    public static double findSlope(OrderedPair p1, OrderedPair p2) {
        double slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        return slope;
    }
    
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
        double newX = (A.getX() + B.getX())/2;
        double newY = (A.getY() + B.getY())/2;
        OrderedPair answer = new OrderedPair(newX, newY);
        return answer;
    }
    
    public static double findArithmeticSeriesSum (double a, double d, int k) {
        return (k/2.0) * (2*a + d* (k-1));
    }
    
    public static double findGeometricSeriesSum (double a, double r, int k) {
        return a*(1-Math.pow(r,k))/(1-r);
    }
    
    public static int rollDie (int sides) {
        return (int)(Math.random()*sides)+1;
    }

}
