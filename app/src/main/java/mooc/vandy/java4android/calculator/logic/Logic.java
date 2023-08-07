package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;


    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;

    }

    // Important Attributes
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */

    public void process(int argumentOne, int argumentTwo, int operation) {
        try {
            if(operation == ADDITION) {
                Add sum = new Add(argumentOne,argumentTwo);
                mOut.print(sum.toString());
            }
            else if(operation == SUBTRACTION) {
                Subtract sub = new Subtract(argumentOne,argumentTwo);
                mOut.print(sub.toString());
            }
            else if (operation == MULTIPLICATION) {
                Multiply mul = new Multiply(argumentOne,argumentTwo);
                mOut.print(mul.toString());
            }
            else if(operation == DIVISION){
                Divide div = new Divide(argumentOne,argumentTwo);
                mOut.print(div.toString());
            }
            else{
                mOut.print("Unable to reach that operation...\"");
            }

        } catch (Exception e) {
            mOut.print("Error in the Execution: " + e.toString());
        }
    }
}

