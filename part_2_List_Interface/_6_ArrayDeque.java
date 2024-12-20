import java.util.ArrayDeque;

public class _6_ArrayDeque {
  public static void main(String args[]) {
    // Creating an empty ArrayDeque
    ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

    // Pushing items to the ad using add()
    ad.add(10);
    ad.add(20);
    ad.add(30);
    ad.add(40);
    ad.add(50);

    // Printing the top element of ArrayDeque
    System.out.println(ad.peek());

    // Printing the top element and removing it
    // from the ArrayDeque container
    System.out.println(ad.poll());

    // Printing the top element again
    System.out.println(ad.peek());
  }
}
