import java.util.HashMap;
import java.util.Map;

public class _10_2_HashMap {
  public static void main(String[] args) {
    // Java program to demonstrate the working of a HashMap
    // Creating a HashMap
    HashMap<Integer, String> hm = new HashMap<Integer, String>();

    // Adding elements to the HashMap
    hm.put(1, "Geeks");
    hm.put(2, "For");
    hm.put(3, "Geeks");

    // Traversing through the HashMap
    for (Map.Entry<Integer, String> e : hm.entrySet()) {
      System.out.println(e.getKey() + " " + e.getValue());
    }
  }
}
