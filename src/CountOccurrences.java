import java.util.Scanner;

/* Given a singly linked list and a key, the task is to count the number of occurrences of the given key in the linked list.

Example :

Input : head: 1->2->1->2->1->3->1 , key = 1
Output : 4 */
public class CountOccurrences {
    public static int occurrences(SLL<Integer> list,int m) {
        SLLNode<Integer> tmp = list.getFirst();
        int count = 0;
        while (tmp != null){
            if(tmp.element == m){
                count++;
            }
            tmp = tmp.succ;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SLL<Integer> lista = new SLL<Integer>();
        for (int i = 0; i < n; i++) {
            int el = sc.nextInt();
            lista.insertLast(el);
        }
        int m = sc.nextInt();
        System.out.println(occurrences(lista,m));
    }
}
