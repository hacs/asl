package interp.datatypes;

import interp.DataType;


public class AslBoolean extends DataType<Boolean>
{
    public AslBoolean(String token)
    {
        value = Boolean.valueOf(token);
    }

    public AslBoolean(Boolean b)
    {
        super(b);
    }

    public AslBoolean(DataType<Boolean> b)
    {
        super(b);
    }

    public String toString()
    {
        return value ? "true" : "false";
    }

    public Integer toInteger()
    {
        return value ? 1 : 0;
    }
}
