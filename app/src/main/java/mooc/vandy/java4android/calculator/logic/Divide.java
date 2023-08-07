package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.

    private  int x,y;

    public Divide(int x , int y){
        this.x = x;
        this.y = y;
    }

    private int calc(){
        int result = (int) (this.x / this.y);
        return result;
    }

    private int getRemainder(){
        return (int) (x % y);
    }

    @Override
    public String toString(){
        return String.valueOf(this.calc()) + " R: " + String.valueOf(this.getRemainder());
    }
}
