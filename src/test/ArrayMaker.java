package test;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-03-07 21:37
 */
public class ArrayMaker<T> {
    Class<T> kind;
    ArrayMaker(Class<T> t){
        kind = t;
    }
    T[] create(int size){

        return (T[]) Array.newInstance(kind,size);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ArrayMaker<Integer> stringArrayMaker = new ArrayMaker<>(Integer.class);
        Integer[] strings = stringArrayMaker.create(9);
        System.out.println(Arrays.toString(strings));
        System.out.println(String.class.newInstance());
        System.out.println();
    }
}
