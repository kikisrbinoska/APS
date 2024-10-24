import java.util.Scanner;
/*Find length of loop/cycle in given Linked List
Last Updated : 13 Sep, 2024
Given the head of a linked list.
The task is to find the length of the loop in the linked list. If the loop is not present return 0.*/
public class FindLengthOfLoop {

    private static int lengthLoop(SLL<Integer> list) {
        SLLNode<Integer> fast = list.getFirst();
        SLLNode<Integer> slow = list.getFirst();

        while (fast != null && fast.succ != null) {
            slow = slow.succ;
            fast = fast.succ.succ;

            if (slow == fast) {
                return countLoop(slow);
            }
        }
        return 0;
    }

    private static int countLoop(SLLNode<Integer> node) {
        SLLNode<Integer> temp = node;
        int count = 1;
        while (temp.succ != node) {
            count++;
            temp = temp.succ;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SLL<Integer> lista = new SLL<>();
        for (int i = 0; i < n; i++) {
            int el = sc.nextInt();
            lista.insertLast(el);
        }

        // Manually creating a loop for testing purposes
        if (n > 0) {
            SLLNode<Integer> firstNode = lista.getFirst();
            SLLNode<Integer> loopNode = firstNode.succ.succ.succ; // Example: Node with value at index 3
            SLLNode<Integer> lastNode = firstNode;
            while (lastNode.succ != null) {
                lastNode = lastNode.succ;
            }
            lastNode.succ = loopNode; // Creating a loop back to the node with value at index 3
        }

        System.out.println(lengthLoop(lista));
    }
}