package part_5_Java_List_Interface.section_1_Java_List_Operations;

import java.util.*;

class _1_Example {

  public static void main(String[] args) {

    // Creating a List of Strings using ArrayList
    List<String> li = new ArrayList<>();

    // Adding elements in List
    li.add("Java");
    li.add("Python");
    li.add("DSA");
    li.add("C++");

    System.out.println("Elements of List are:");

    // Iterating through the list
    for (String s : li) {
      System.out.println(s);
    }

    // Accessing elements
    System.out.println("Element at Index 1: " + li.get(1));

    // Updating elements
    li.set(1, "JavaScript");
    System.out.println("Updated List: " + li);

    // Removing elements
    li.remove("C++");
    System.out.println("List After Removing Element: " + li);
  }
}