import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionPractice1 {
    public static void main(String args[]){

        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(56);
        l1.add(34);
        l1.add(45);
        l1.add(46);
        l1.add(49);
        l1.add(489);
        ArrayList<Integer> l2=new ArrayList();
        l2.add(56);
        l2.add(56);
        l2.add(56);
        l2.add(56);
        l2.add(56);
        System.out.println(l1.addAll(0,l2));
        System.out.println(l1.get(1));
        System.out.println(l1.equals(l2));
        System.out.println(l1);
        int d=l1.indexOf(56);
        int e=l1.lastIndexOf(56);
        System.out.println(e+1);
        System.out.println(d+1);
        System.out.println(l1.contains(65));
        Collections.sort(l1);
        System.out.println(l1);
//        for(int i:l1){
//            System.out.println(i);
        //////////////////////////////////////////
        System.out.println("*******************************linked LISt***************");
        LinkedList<Integer> l=new LinkedList<>();
        l.add(456);
        l.add(45);
        l.add(46);
        l.add(56);
        l.add(458);
        l.add(98);
        System.out.println(l);
        l.set(2,21);
        System.out.println(l);
        for(int j:l){
            System.out.println(l.get(j));
            System.out.println(",");
        }
      }
//    }
}
