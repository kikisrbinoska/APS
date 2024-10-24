import java.util.Scanner;
/* Given a singly linked list, the task is to find the middle of the linked list. If the number of nodes are even, then there would be two middle nodes, so return the second middle node.

Example:

Input: linked list: 1->2->3->4->5
Output: 3  */
public class MiddleElement {
    public static int findMiddle(SLL<Integer> list){
        SLLNode<Integer> tmp = list.getFirst();
        SLLNode<Integer> pom = null;
        int count = 0;
        while (tmp != null){
            count++;
            tmp = tmp.succ;
        }
        tmp = list.getFirst();
        for (int i = 0; i < count / 2; i++) {
            tmp = tmp.succ;
        }
        return tmp.element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SLL<Integer> lista = new SLL<Integer>();
        for (int i = 0; i < n; i++) {
            int el = sc.nextInt();
            lista.insertLast(el);
        }
        System.out.println(findMiddle(lista));
    }
}
