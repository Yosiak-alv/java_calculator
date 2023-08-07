package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO - add your solution here.

    private  int x,y;

    public Subtract(int x , int y){
        this.x = x;
        this.y = y;
    }

    private int calc(){
        int result = (int) (this.x - this.y);
        return result;
    }

    @Override
    public String toString(){
        return String.valueOf(this.calc());
    }
}
