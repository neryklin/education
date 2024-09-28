package dz2;

public class ArrayListTest <E> implements ArrayListTestInterface<E>, Comparable<E>{


    public static void main(String[] args) {
        ArrayListTest<String>  arrayListTest = new ArrayListTest<>();
        arrayListTest.add("c");
        arrayListTest.add("b");
        arrayListTest.add("a");

        arrayListTest.sort();
        //arrayListTest.delete(1);
        //testing
        System.out.println(arrayListTest.get(0));
        System.out.println(arrayListTest.size());
    }
    private E[] values;

    public ArrayListTest() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length+1];
            System.arraycopy(temp,0,values,0,temp.length);
            values[values.length-1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;

    }

    @Override
    public void delete(int index) {

        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length-1];
            System.arraycopy(temp,0,values,0,index);
            int amontFromCopyDel = temp.length-1 -index;
            System.arraycopy(temp,index+1,values,index, amontFromCopyDel);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }


    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index]=e;
    }

    public void sort() {

    }

    @Override
    public int compareTo(E o) {
        return o.toString().compareTo(values.toString());
    }
}
