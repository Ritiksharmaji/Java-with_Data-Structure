package part_3_Collections_Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class _3_Adding_Elements {
  public static void main(String[] args) {

    List<String> l = new ArrayList<>();

    // Adding elements to the list
    l.add("Shoes");
    l.add("Toys");

    // Add one or more elements
    Collections.addAll(l, "Fruits", "Bat", "Ball");

    for (int i = 0; i < l.size(); i++) {
      System.out.print(l.get(i) + " ");
    }
  }
}
