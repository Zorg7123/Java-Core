package Lesson03;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Обобщения.");
        System.out.println("Метод, который меняет два элемента массива местами");
        Integer[] intArray = new Integer[5];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[4] = 200;
        System.out.println("Входной массив Integer: " + Arrays.deepToString(intArray));
        changePosition(intArray, 0, 4);
        System.out.println("Поменяли местами элементы 0 и 4: " + Arrays.deepToString(intArray));

        String[] stringArray = new String[7];
        stringArray[0] = "Понедельник";
        stringArray[1] = "Вторник";
        stringArray[6] = "Воскресенье";
        System.out.println("Входной массив String: " + Arrays.deepToString(stringArray));
        changePosition(stringArray, 0, 6);
        System.out.println("Поменяли местами элементы 0 и 6: " + Arrays.deepToString(stringArray));

        System.out.println("Метод, который преобразует массив в ArrayList;");
        System.out.println("Массив Integer: " + Arrays.deepToString(intArray));
        ArrayList<Integer> arrayListI = arrayToArrayList(intArray);//преобразуем массив в ArrayList
        System.out.println("Элементы ArrayList Integer: " + arrayListI.toString());
        System.out.println("Массив String: " + Arrays.deepToString(stringArray));
        ArrayList<String> arrayListS = arrayToArrayList(stringArray);//преобразуем массив в ArrayList
        System.out.println("Элементы ArrayList String:");
        for (String s : arrayListS) {
            System.out.println(s);
        }

        System.out.println("Метод, который позволяет пересыпать фрукты из текущей коробки в другую. ");
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        System.out.println("Вес коробки 1(Три яблока): " + box1.getWeight());
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);
        System.out.println("Вес коробки 2(Два апельсина): " + box2.getWeight());
        System.out.println("Сравниваем коробку 1 и коробку 2: " + box1.compare(box2));
        box2.add(orange3);
        System.out.println("Добавили в коробку 2 ещё один апельсин, теперь её вес: " + box2.getWeight());
        System.out.println("Сравниваем коробку 1(" + box1.getWeight() + ") и коробку 2(" + box2.getWeight() + "): " + box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();//Создадим ещё одну коробку с апельсинами
        System.out.println("Вес коробки 2: " + box2.getWeight() + ", вес коробки 3: " + box3.getWeight());
        box2.transfer(box3);//Пересыпим апельсины из Коробки 2 в Корорбку 3
        System.out.println("Пересыпали фрукты из коробки 2 в 3. Вес коробки 2: " + box2.getWeight() + ", вес коробки 3: " + box3.getWeight());
     }

    //Метод, который меняет два элемента массива местами
    //array - массив
    //arrayItemNumber1 - номер 1-ого элемента массива
    //arrayItemNumber2 - номер 2-ого элемента массива
    public static void changePosition(Object[] array, int arrayItemNumber1, int arrayItemNumber2) {
        Object arr = array[arrayItemNumber1];
        array[arrayItemNumber1] = array[arrayItemNumber2];
        array[arrayItemNumber2] = arr;
    }

    // Метод, который преобразует массив в ArrayList;
    public static <U> ArrayList<U> arrayToArrayList(U[] array) {
        return new ArrayList<U>(Arrays.asList(array));
    }
}