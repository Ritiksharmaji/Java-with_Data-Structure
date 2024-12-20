import java.util.Stack;

public class _4_2_stack {
  public static void main(String args[]) {
    Stack<String> stack = new Stack<String>();
    stack.push("Geeks");
    stack.push("For");
    stack.push("Geeks");
    stack.push("Geeks");
    // Iterator for the stack
    for (String s : stack) {
      System.out.print(s + " ");
    }
    System.out.println();
    stack.pop();
    // System.out.println("other way");
    // other way
    for (int i = 0; i < stack.size(); i++) {
      System.out.print(stack.get(i) + " ");
    }

  }
}
