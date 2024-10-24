import java.util.Scanner;

public class SwapPairs {
    public static void swap(SLL<Integer> list){
        SLLNode<Integer> tmp = list.getFirst();

        while (tmp != null && tmp.succ != null){
            Integer curr = tmp.element;
            tmp.element = tmp.succ.element;
            tmp.succ.element = curr;
            tmp = tmp.succ.succ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SLL<Integer> lista = new SLL<Integer>();
        for (int i = 0; i < n; i++) {
            int el = sc.nextInt();
            lista.insertLast(el);
        }
        swap(lista);
        System.out.println(lista);
    }
}
