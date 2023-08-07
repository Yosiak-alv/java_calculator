package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.

    private  int x,y;

    public Multiply(int x , int y){
        this.x = x;
        this.y = y;
    }

    private int calc(){
        int result = (int) (this.x * this.y);
        return result;
    }

    @Override
    public String toString(){
        return String.valueOf(this.calc());
    }
}
