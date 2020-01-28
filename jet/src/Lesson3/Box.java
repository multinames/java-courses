package Lesson3;

public class Box {
    int size;
    int count= 0;
    Object[] object;

   /* private  Box() {
        objects = new Object[10];
    }*/

    Box(int capacity) {
        if (capacity <0) {
            size =10;
            object = new Object[10];

        }else {
            object = new Object[capacity];
            size = capacity;

        }
    }

    public void add(Object item) {
        if (count < size){
            object[count++] = item;
        }
    }

    public  Object get (Object inx) {
        Integer integer = (Integer) inx;
        return new Object();
    }
}
