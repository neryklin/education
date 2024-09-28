package dz2;

public interface ArrayListTestInterface <E>{
    boolean add(E e);
    void delete (int index);
    E get(int index);
    int size();
    void update(int index, E e);
}
