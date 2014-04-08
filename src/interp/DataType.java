/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package interp;

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */

import interp.datatypes.AslBoolean;
import interp.exceptions.OperatorNotSupportedException;

public abstract class DataType<T> {
    protected T value;

    public DataType() {
    }

    /**
     * Standard constructor *
     */
    public DataType(T d) {
        value = d;
    }

    /**
     * Copy constructor
     */
    public DataType(DataType<T> d) {
        value = d.value;
    }

    /**
     * Defines a new value for the data
     */
    public void setValue(T newValue) {
        value = newValue;
    }

    public T getValue() {
        return value;
    }

    /**
     * Copies the value from another data
     */
    public void setData(DataType<T> d) {
        value = d.value;
    }

    /**
     * Returns a string representing the data in textual form.
     */
    public abstract String toString();
    public abstract Integer toInteger();

    /*
     * ARITHMETIC OPERATORS
     * They always return a new data object
     */
    public DataType<T> __add__(DataType<T> d) {
        throw new OperatorNotSupportedException();
    }

    public DataType<T> __sub__(DataType<T> d) {
        throw new OperatorNotSupportedException();
    }

    public DataType<T> __mul__(DataType<T> d) {
        throw new OperatorNotSupportedException();
    }

    public DataType<T> __div__(DataType<T> d) {
        throw new OperatorNotSupportedException();
    }

    public DataType<T> __mod__(DataType<T> d) {
        throw new OperatorNotSupportedException();
    }

    /*
     * RELATIONAL OPERATORS
     * They always return an AslBoolean
     */
    public AslBoolean __eq__(DataType d) {
        return new AslBoolean(value == d.value);
    }

    public AslBoolean __neq__(DataType d) {
        return new AslBoolean(value != d.value);
    }

    public AslBoolean __lt__(DataType d) {
        return new AslBoolean(toInteger() < d.toInteger());
    }

    public AslBoolean __le__(DataType d) {
        return new AslBoolean(toInteger() <= d.toInteger());
    }

    public AslBoolean __gt__(DataType d) {
        return new AslBoolean(toInteger() > d.toInteger());
    }

    public AslBoolean __ge__(DataType d) {
        return new AslBoolean(toInteger() >= d.toInteger());
    }
}
