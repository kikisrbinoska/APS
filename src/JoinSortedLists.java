import com.sun.jdi.PathSearchingVirtualMachine;

public class JoinSortedLists<E extends Comparable<E>>{
   public SLL<E> join(SLL<E> list1,SLL<E> list2){
       SLL<E> rezultat = new SLL<E>();
       SLLNode<E> tmp1 = list1.getFirst();
       SLLNode<E> tmp2 = list2.getFirst();
       while (tmp1 != null && tmp2 != null){
           if(tmp1.element.compareTo(tmp2.element) < 0){
               rezultat.insertLast(tmp1.element);
               tmp1 = tmp1.succ;
           } else {
               rezultat.insertLast(tmp2.element);
               tmp2 = tmp2.succ;
           }
       }
       if(tmp1 != null){
           while (tmp1 != null){
               rezultat.insertLast(tmp1.element);
           }
       }
       if(tmp2 != null){
           while (tmp2 != null){
               rezultat.insertLast(tmp2.element);
           }
       }
       return rezultat;
   }
    public static void main(String[] args) {

    }
}
