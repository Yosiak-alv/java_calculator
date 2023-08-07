package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.

    private  int x,y;

    public Add(int x, int y){
        this.x = x;
        this.y = y;
    }

    private int calc(){
        int result = (int) (this.x + this.y);
        return result;
    }

    @Override
    public String toString(){
        return String.valueOf(this.calc());
    }

}
