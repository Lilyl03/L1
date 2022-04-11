package com.company.d18;

public class GenericCollection<E> {
    private static final int ARRAY_SIZE = 100;

    private final Object[] objects = new Object[ARRAY_SIZE];
    public void set(int index, E element){
        objects[index] = element;
    }

    public /*static <E>*/ E get(int index){
        return (E)objects[index];
    }

    public static void main(String[] args) {
        GenericCollection<Integer> collection1 = new GenericCollection<>();
        collection1.set(1,456);
        Integer integer = collection1.get(1);
    }
}
