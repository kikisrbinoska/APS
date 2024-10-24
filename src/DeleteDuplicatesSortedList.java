import java.util.Scanner;

public class DeleteDuplicatesSortedList {
   public static void deleteDuplicates(SLL<Integer> list){
       SLLNode<Integer> tmp = list.getFirst();
       while (tmp != null && tmp.succ != null){
           if(tmp.element.equals(tmp.succ.element)){
               list.delete(tmp.succ);
           } else {
            tmp = tmp.succ;
           }

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
        deleteDuplicates(lista);
        System.out.println(lista);
    }
}
