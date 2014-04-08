package interp.datatypes;

import interp.DataType;

public class AslVoid extends DataType
{
    public AslVoid()
    {
        value = null;
    }

    public AslString __str__()
    {
       return new AslString("void");
    }
}
