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

    public AslString __getitem__(DataType index) {
        int i = index.toInteger();
        return new AslString(value.substring(i, i+1));
    }
}
