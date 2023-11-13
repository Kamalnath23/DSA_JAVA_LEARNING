import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // ArrayList<Integer> arrayList=new ArrayList<Integer>();
        // LinkedList<Integer> linkedList = new LinkedList<Integer>();

        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        System.out.println("add items at right to the end in the list");

        doTimings("Array List", arrayList);
        doTimings("Linked List", linkedList);

        System.out.println("add items at the elsewhere in the list");

        doTimings2("Array List", arrayList);
        doTimings2("Linked List", linkedList);

        System.out.println("add items at right to the end in the list");

        doTimings3("Array List", arrayList);
        doTimings3("Linked List", linkedList);

        System.out.println("add items at right to the end before 100 items in the list");

        doTimings4("Array List", arrayList);
        doTimings4("Linked List", linkedList);
        }
    private static void doTimings(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();

        // add items at the end of the list
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken : " + (end - start) + " ms for " + type);
    }

    private static void doTimings2(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();

        // add items at the elsewhere in the list
        for (int i = 0; i < 1E5; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken : " + (end - start) + " ms for " + type);
    }

    private static void doTimings3(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();

        // add items at right to the end in the list
        for (int i = 0; i < 1E5; i++) {
            list.add(list.size(), i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken : " + (end - start) + " ms for " + type);
    }

    private static void doTimings4(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();

        // add items at right to the end in the list
        for (int i = 0; i < 1E5; i++) {
            list.add(list.size() - 100, i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken : " + (end - start) + " ms for " + type);
    }
}