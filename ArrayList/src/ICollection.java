public interface ICollection<T> {

    void add(T item);
    boolean add(int index, T item);
    boolean contains(T s);
    void print();
    int size();
    boolean remove();
    boolean remove(int index);
    boolean remove(T searchKey);
    T get(int index);
}
