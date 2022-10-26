package org.example;

public class App {
    public static void main(String[] args) {

        List<String> list = new List<>(5);

        try {
            list.add("Potato");
            list.add("Tomato");
            list.add("Pepper");
            list.add("Cucumber");
            list.add("Onion");
            list.add("Banana");
        } catch (FullListException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Program add is complete");

        try {
            list.removeLast();
            list.removeLast();
            list.removeLast();
            list.removeLast();
            list.removeLast();
            list.removeLast();
        } catch (EmptyListException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Program remove is complete");

    }
}
