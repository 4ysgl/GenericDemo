public class MyList<T> {
    private T[] list;
    private int size = 0;

    private T[] newList;

    public MyList() {
        this(10);
    }
    //LİSTE İÇERİSİNDE ELEMAN BULMA
    public int indexOf(T data) {
        for (int i = 0; i < list.length; i++) {
            if (data.equals(list[i])) {
                System.out.println(list[i] + "  elemanının Index numarası : " + i);
            }
        }
        System.out.println(data + " elemanı liste içerisinde yok ");
        return -1;
    }

    private MyList(int capasity) {
        list = (T[]) new Object[capasity];
    }

    // eleman satısını döndğrğr
    public int size() {
        return size;
    }

    public void add(T data) {
        if (size >= list.length) {
            newCapasity();
        }
        list[size++] = data;
    }
public void clear()
{
    T[] newList = (T[]) new Object[list.length];
    size=0;
    System.out.println("liste sıfırlandı");
}

    public void newCapasity() {

        int newCapacity = list.length * 2;
        T[] newList = (T[]) new Object[newCapacity];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];

        }
        list = newList;
    }

    public int getCapacity() {
        return list.length;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }
}
