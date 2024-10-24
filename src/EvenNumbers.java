import java.util.Scanner;

public class EvenNumbers {
    public static int evenNumbers(SLL<Integer> list){
        SLLNode<Integer> tmp = list.getFirst();
        int count = 0;
        while (tmp != null){
            if(tmp.element % 2 == 0){
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
        System.out.println(evenNumbers(lista));
    }
}
