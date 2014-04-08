package interp.datatypes;

import interp.DataType;
import interp.exceptions.TypeException;


public class AslBoolean extends DataType<Boolean>
{
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
        throw new TypeException();
    }

    public Boolean toBoolean()
    {
        return value;
    }

    public AslBoolean __not__()
    {
        return new AslBoolean(!value);
    }
}
