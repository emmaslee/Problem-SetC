
/**
 * Write a description of class Formulas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 
public class OrderedPair
{
    double x;
   double y;
  
    
    //constructor
    OrderedPair() {
        x = 0;
        y = 0;
    }
    
    OrderedPair(double a, double b) {
        x = a;
        y = b;
    }
    
    public String toString() {
        return x + ", " + y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
  
}



