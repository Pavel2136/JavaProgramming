public class MyArrayList<T> implements ICollection<T> {
    private T[] arrList;
    private int size;

    public MyArrayList() {
        arrList = (T[]) new Object [10];
    }

    public MyArrayList(int length) {
        arrList = (T[]) new Object[length];
    }

    public void add(T item) {
        if (item == null) {
            return;
        }

        if (size >= arrList.length) {
            resize();
        }
        arrList[size] = item;
        size++;
    }

    private void resize() {
        T[] temp = (T[]) new String[arrList.length * 3 / 2 + 1];
        for (int i = 0, j = 0; i < arrList.length; i++, j++) {
            temp[i] = arrList[j];
        }
        arrList = temp;

    }

    public boolean add(int index, T item) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return false;
        }

        if (size > arrList.length) {
            resize();
        }

        size++;
        for (int i = index; i <= size - 1; i++) {
           Object temp = item;
           item = arrList[i];
           arrList[i] = (T) temp;
        }
        return true;
    }

    @Override
    public boolean contains(T s) {
        if (s == null) {
            return false;
        }

        for (int i = 0; i <= size; i++ ) {
            if(s.equals(arrList[i])) {
                return true;
            }
        }

        return false;
    }

    public void print() {
        if (size == 0) {
            System.out.println("Empty");
        }
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrList[i]);
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public boolean remove() {
        if (size == 0) {
            return false;
        }else {
            arrList[size] = null;
            size--;
        }
        return true;
    }

    public boolean remove(int index) {
        if (index >= size) {
            return false;
        }

        for (int i = index; i <= size - 1; i++) {
            Object temp = arrList[i];
            arrList[i] = arrList[i + 1];
            arrList[i + 1] = (T) temp;
        }
        remove();
        return true;
    }

    public boolean remove(T searchKey) {
        if (contains(searchKey)) {
            for (int i = 0; i <= size; i++) {
                if (searchKey.equals(arrList[i])) {
                    remove(i);
                    return true;
                }
            }
        }

        return false;
    }

    public T get(int index) {
        if (index < 0) {
            return null;
        }

        return arrList[index];
    }
}
