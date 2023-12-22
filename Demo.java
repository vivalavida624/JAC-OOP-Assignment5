package Assignment05;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //========Task1=======
        ArrayList<String> wordList= new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("orange");
        wordList.add("grape");
        wordList.add("kiwi");

        System.out.println(wordList);

        wordList.add(0, "pear");
        wordList.remove(2);
        Boolean check = wordList.contains("orange");

        System.out.println(wordList);
        if(check){
            System.out.println("yes, the arraylist has orange");
        }else System.out.println("No, the arrayList has no orange");

        System.out.println(wordList);

        //=======Task2============//
        Pair pair1 = new Pair(55, "Apple");
        System.out.println(pair1);

        Pair pair2 = new Pair(10.5, 22.4);
        System.out.println(pair2);

        //=======Task 3=======
        ArrayList<Pair> myArrayList = new ArrayList<Pair>();
        myArrayList.add(pair1);
        myArrayList.add(pair2);

        System.out.println(myArrayList);
        System.out.println(myArrayList.get(1));

        System.out.println("=======Challenge==========");
        printArrayListElements(wordList);
        printArrayListElements(myArrayList);

    }
    public static <T> void printArrayListElements(ArrayList<T> arrayList){
        for (T element : arrayList){
            System.out.println(element);
        }
    }
}
