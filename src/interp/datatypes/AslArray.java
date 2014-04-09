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

    public DataType __size__() {
        return new AslInteger(value.size());
    }

    public DataType __sum__() {
        // Optimized, we avoid to use AslIntegers here
        // to be fast!
        int sum = 0;

        for(DataType element : value)
            sum += element.toInteger();

        return new AslInteger(sum);
    }

    public AslString __str__() {
        String s = "";

        boolean first = true;
        for(DataType element : value) {
            if(first) first = false;
            else s += ", ";

            s += element.__repr__().getValue();
        }

        return new AslString("[" + s + "]");
    }
}
