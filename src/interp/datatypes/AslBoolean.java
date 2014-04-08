package interp.datatypes;

import interp.DataType;


public class AslBoolean extends DataType<Boolean>
{
    public AslBoolean(Boolean b)
    {
        super(b);
    }

    public AslBoolean __not__()
    {
        return new AslBoolean(!value);
    }

    public AslString __str__() {
        return new AslString(value ? "true" : "false");
    }

    public AslBoolean __bool__() {
        return new AslBoolean(value);
    }
}
