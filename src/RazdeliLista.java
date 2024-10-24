import java.util.Scanner;

public class RazdeliLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SLL<Integer> lista = new SLL<Integer>();
        for (int i = 0; i < n; i++) {
            int el = sc.nextInt();
            lista.insertLast(el);
        }
        SLL<Integer> parni = new SLL<Integer>();
        SLL<Integer> neparni = new SLL<Integer>();

        SLLNode<Integer> tmp  = lista.getFirst();
        while (tmp != null){
            while (tmp.succ != null && tmp.element % 2 == 0 && tmp.succ.element == 0){
                tmp = tmp.succ;
            }
            while (tmp.succ != null && !(tmp.element % 2 == 0) && !(tmp.succ.element == 0)){
                tmp = tmp.succ;
            }
            if(tmp.element % 2 == 0){
                parni.insertLast(tmp.element);
            } else {
                neparni.insertLast(tmp.element);
            }
            tmp = tmp.succ;

            if(parni.size() == 0)
                System.out.println("Prazna lista");
            else
                System.out.println(parni);
            if(neparni.size() == 0)
                System.out.println("Prazna lista");
            else
                System.out.println(neparni);
        }
    }
}
