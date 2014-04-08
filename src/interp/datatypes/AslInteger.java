package interp.datatypes;

import interp.DataType;

public class AslInteger extends DataType<Integer>
{
    public AslInteger(String token)
    {
        value = Integer.parseInt(token);
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

    public AslInteger __add__(DataType<Integer> d)
    {
        AslInteger i = new AslInteger(this);
        i.value += d.getValue();
        return i;
    }

    public AslInteger __sub__(DataType<Integer> d)
    {
        AslInteger i = new AslInteger(this);
        i.value -= d.getValue();
        return i;
    }

    public AslInteger __mul__(DataType<Integer> d)
    {
        AslInteger i = new AslInteger(this);
        i.value *= d.getValue();
        return i;
    }

    public AslInteger __div__(DataType<Integer> d)
    {
        checkDivZero(d);
        AslInteger i = new AslInteger(this);
        i.value /= d.getValue();
        return i;
    }

    public AslInteger __mod__(DataType<Integer> d)
    {
        checkDivZero(d);
        AslInteger i= new AslInteger(this);
        i.value %= d.getValue();
        return i;
    }

    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private void checkDivZero(DataType<Integer> d)
    {
        if (d.getValue() == 0)
            throw new RuntimeException ("Division by zero");
    }
}
