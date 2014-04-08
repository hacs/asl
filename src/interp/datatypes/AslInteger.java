package interp.datatypes;

import interp.DataType;

public class AslInteger extends DataType<Integer>
{
    public AslInteger(Integer i)
    {
        super(i);
    }

    public AslInteger(DataType<Integer> i)
    {
        super(i);
    }

    public String toString()
    {
        return Integer.toString(value);
    }

    public Integer toInteger()
    {
        return value;
    }

    public Boolean toBoolean()
    {
        return value != 0;
    }

    public AslInteger __pos__()
    {
        return new AslInteger(this);
    }

    public AslInteger __neg__()
    {
        return new AslInteger(-value);
    }

    public AslBoolean __not__()
    {
        return new AslBoolean(toBoolean());
    }

    public AslInteger __add__(DataType d)
    {
        AslInteger i = new AslInteger(this);
        i.value += d.toInteger();
        return i;
    }

    public AslInteger __sub__(DataType d)
    {
        AslInteger i = new AslInteger(this);
        i.value -= d.toInteger();
        return i;
    }

    public AslInteger __mul__(DataType d)
    {
        AslInteger i = new AslInteger(this);
        i.value *= d.toInteger();
        return i;
    }

    public AslInteger __div__(DataType d)
    {
        int v = checkDivZero(d);
        AslInteger i = new AslInteger(this);
        i.value /= v;
        return i;
    }

    public AslInteger __mod__(DataType d)
    {
        int v = checkDivZero(d);
        AslInteger i= new AslInteger(this);
        i.value %= v;
        return i;
    }

    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private int checkDivZero(DataType d)
    {
        int i = d.toInteger();

        if (i == 0)
            throw new RuntimeException ("Division by zero");

        return i;
    }
}
