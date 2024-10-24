import java.util.Scanner;

//Check if a linked list is Circular Linked List
public class CircularList {
    public static boolean circular(SLL<Integer> list){
        if(list.getFirst() == null){
            return false;
        }
        SLLNode<Integer> slow  = list.getFirst();
        SLLNode<Integer> fast = list.getFirst();
        if(fast != null && fast.succ != null){
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
        System.out.println(circular(lista));
    }
}
