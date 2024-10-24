import java.util.Scanner;

public class DeleteLastOccurrence {
   public static void deleteLastOccurrence(SLL<Integer> list,int m){
       SLLNode<Integer> tmp = list.getFirst();
       SLLNode<Integer> toDelete = null;

       while (tmp != null){
           if(tmp.element == m) {
               toDelete = tmp;
           }
           tmp = tmp.succ;
       }
       if (toDelete != null){
           list.delete(toDelete);
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
        int m = sc.nextInt();
        deleteLastOccurrence(lista,m);
        System.out.println(lista);
    }
}
