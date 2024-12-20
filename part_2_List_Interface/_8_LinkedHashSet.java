import java.util.LinkedHashSet;

public class _8_LinkedHashSet {
  public static void main(String[] args) {
    // Creating a LinkedHashSet
    LinkedHashSet<String> lh = new LinkedHashSet<String>();
    // Adding elements to the LinkedHashSet
    lh.add("A");
    lh.add("B");
    lh.add("C");
    lh.add("D");

    // Adding duplicate elements will be ignored
    lh.add("A");

    // Displaying the LinkedHashSet
    System.out.println(lh);
  }
}
