import java.util.Scanner;
/* Detect loop or cycle in a linked list
Given a singly linked list, check if the linked list
has a loop (cycle) or not.
A loop means that the last node of the linked list is connected back
to a node in the same list.*/
public class DetectLoop {
    public static boolean isLoop(SLL<Integer> list){
        SLLNode<Integer> slow = list.getFirst();
        SLLNode<Integer> fast = list.getFirst();

        while (fast != null && fast.succ != null){
            slow = slow.succ;
            fast = fast.succ.succ;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SLL<Integer> lista = new SLL<Integer>();
        for (int i = 0; i < n; i++) {
            int el = sc.nextInt();
            lista.insertLast(el);
        }
        System.out.println(isLoop(lista));
    }
}
