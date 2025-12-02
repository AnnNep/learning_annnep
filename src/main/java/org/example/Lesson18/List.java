package org.example.Lesson18;

import java.util.Iterator;

public class List <T> implements Iterable<T> { //Тип, который мы задаем во время создания нашего объекта (параметризованный тип)

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

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(); //Если нужно снова пройтись, то заново вызываем итератор (так как у нас есть сосотояние итератора, где мы видим его текущее положение, между какими элементами он стоит и должны это сохранить)
    }
    //Реализуем интерфейс
//Создаем итератор (вложеный класс), реализуем методы
    private class ListIterator implements Iterator<T> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
    //Если цикл фор был создан один раз, то мы создали итератор и проитерировались тоже один раз
    //Если нужно снова пройтись, то заново вызываем итератор (так как у нас есть сосотояние итератора, где мы видим его текущее положение, между какими элементами он стоит и должны это сохранить)
}
