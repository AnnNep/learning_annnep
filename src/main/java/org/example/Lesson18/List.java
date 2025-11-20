package org.example.Lesson18;

public class List <T>{ //Тип, который мы задаем во время создания нашего объекта (параметризованный тип)

    private T[] objects;
    private int size;

    public List(int initialSize) {
        this.objects = (T[]) new Object [initialSize]; //Элемент и массив нельзя создать типа Т, так как джава должна знать, сколько памяти выделять
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}
