package interp.datatypes;

import interp.DataType;

import java.util.ArrayList;
import java.util.List;


public class AslArray extends DataType<List<DataType>>
{
    public AslArray() {
        value = new ArrayList<DataType>();
    }

    public DataType __getitem__(DataType index) {
        return value.get(index.toInteger());
    }

    public DataType __setitem__(DataType index, DataType item) {
        value.set(index.toInteger(), item);
        return item;
    }

    public DataType __append__(DataType item) {
        value.add(item);
        return this;
    }

    public AslString __str__() {
        String s = "";

        boolean first = true;
        for(DataType element : value) {
            if(first) first = false;
            else s += ", ";

            s += element.__repr__().toString();
        }

        return new AslString("[" + s + "]");
    }
}
