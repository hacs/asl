package interp.datatypes;

import interp.DataType;

public class AslVoid extends DataType
{
    public AslVoid()
    {
        value = null;
    }

    public String toString()
    {
       return "void";
    }
}
