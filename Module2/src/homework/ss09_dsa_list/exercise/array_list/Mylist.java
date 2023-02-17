package homework.ss09_dsa_list.exercise.array_list;

import java.util.Arrays;

public class Mylist {
    private int size = 0;
    public static final int DEFUALT_CAPACITI = 10;
    private Object[] elements;

    public Mylist() {
        elements = new Object[DEFUALT_CAPACITI];
    }

    public Mylist(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public Mylist(int capacity) {
        elements = new Object[capacity];
    }

    //Nhân đôi độ dài của mảng khi đạt tới điều kiện.
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //Thêm vào cuối mảng.
    public boolean add(int element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
        return true;
    }

    //Thêm vào mảng tại vị trí chỉ định.
    public void add(int index, int element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                for (int j = i; j < elements.length + 1; j++) {
                    elements[i + 1] = elements[i];
                }
                elements[i] = element;
                size++;

            }
        }
    }

    //Độ dài của mảng.
    public int size() {
        return size;
    }

    //Lấy phần tử tại vị trí chỉ định
    public int get(int index) {
        return (int) elements[index];
    }

    //Xóa phần tử tại vị trí chỉ định.
    public void remove(int index) {
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                for (int j = i; j < elements.length - 1; j++) {
                    elements[i] = elements[i + 1];
                    i++;
                }
                elements[elements.length - 1] = 0;
                size--;
                break;
            }
        }
    }

    //Kiểm tra tham số truyền vào có trong mảng không, trả về true hoặc false.
    public boolean contains(Object o) {
        boolean flag = false;
        for (Object element : elements) {
            flag = o.equals(element);
        }
        return flag;
    }

    //Kiểm tra tham số truyền vào có trong mảng không,trả về vị trí.
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < elements.length; i++)
                if (elements[i] == null) return i;
        } else {
            for (int i = 0; i < elements.length; i++)
                if (o.equals(elements[i])) return i;
        }
        return -1;
    }

    //Xóa mảng.
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return clone;
    }
}