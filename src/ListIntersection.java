import java.util.Scanner;
//Intersection of two Sorted Linked Lists

public class ListIntersection {
    public SLL intersection(SLL<Integer> list1,SLL<Integer> list2){
        SLLNode<Integer> tmp1 = list1.getFirst();
        SLLNode<Integer> tmp2 = list2.getFirst();
        SLL<Integer> res = new SLL<Integer>();
        while (tmp1 != null && tmp2 != null){
            if(tmp1.element.equals(tmp2.element)){
                res.insertLast(tmp1.element);
                tmp1 = tmp1.succ;
                tmp2 = tmp2.succ;
            } else if(tmp1.element < tmp2.element){
                tmp1 = tmp1.succ;
            } else {
                tmp2 = tmp2.succ;
            }

        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SLL<Integer> lista1 = new SLL<Integer>();
        for (int i = 0; i < n; i++) {
            int el = sc.nextInt();
            lista1.insertLast(el);
        }
        int m = sc.nextInt();
        SLL<Integer> lista2 = new SLL<Integer>();
        for (int i = 0; i < m; i++) {
            int el = sc.nextInt();
            lista2.insertLast(el);
        }
        ListIntersection li = new ListIntersection();
        SLL<Integer> result = li.intersection(lista1,lista2);
        System.out.println(result);

    }
}
