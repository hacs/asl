package interp.datatypes;


import interp.DataType;

public class AslString extends DataType<String>
{
    public AslString(String s) {
        value = s;
    }

    public AslString __str__() {
        return new AslString(value);
    }
}
