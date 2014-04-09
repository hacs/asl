package interp;

public class Reference {
    public DataType data;

    public Reference(DataType value) {
        data = value;
    }

    public String toString() {
        return data.toString();
    }
}
