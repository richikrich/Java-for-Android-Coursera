package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN=1;
    public static final int OUT=-1;
    public static final int CLOSED=0;
    private int mSwing;

    public Gate()
    {
        mSwing=CLOSED;
    }

    public boolean setSwing(int direction)
    {
        if(direction==IN || direction==OUT || direction==CLOSED)
        {
            mSwing=direction;
            return true;
        }
        else return false;
    }
    public boolean open(int direction)
    {
        if(direction==IN||direction==OUT)
        {
            this.setSwing(direction);
            return true;
        }
        else return false;
    }
    public void close()
    {
        mSwing=CLOSED;
    }
    public int getSwingDirection()
    {
        return mSwing;
    }
    public int thru(int count)
    {
        if(getSwingDirection()==IN) return count;
        else if(getSwingDirection()==OUT) return (-count);
        else return 0;
    }
    public String toString()
    {
        if(getSwingDirection()==IN) return "This gate is open and swings to enter the pen only";
        else if(getSwingDirection()==OUT) return "This gate is open and swings to exit the pen only";
        else if(getSwingDirection()==CLOSED) return "This gate is closed";
        else return "This gate has an invalid swing direction";
    }


}
