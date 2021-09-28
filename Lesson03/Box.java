package Lesson03;

import java.util.*;


public class Box <T extends Fruit> {
    private ArrayList<T> items;

    public Box(T... items) {
        this.items = new ArrayList<T>(Arrays.asList(items));
    }
    //  метод добавления фрукта в коробку
    public void add(T... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public void remove(T... items) {
        for (T item : items) this.items.remove(item);
    }

    public ArrayList<T> getItems() {
        return new ArrayList<T>(items);
    }

    public void clear() {
        items.clear();
    }

    // метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество
     public float getWeight() {
        if (items.size() == 0) return 0;
        float weight = 0;
        for (T item : items) weight += item.getWeight();
        return weight;
    }

    // Внутри класса Box создан метод compare(), который позволяет сравнить текущую коробку с той,
    // которую подадут в compare() в качестве параметра. true – массы равны, false наоборот.
    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<? super T> box) {
        box.items.addAll(this.items);
        clear();
    }
}
